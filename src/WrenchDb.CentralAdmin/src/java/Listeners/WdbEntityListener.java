/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import WrenchDb.DAL.Annotations.EventListenerAnnotation;
import WrenchDb.DAL.Configuration.EventListener;
import WrenchDb.DAL.Entities.WdbChangescript;
import WrenchDb.DAL.Entities.WdbApplication;
import WrenchDb.DAL.Entities.WdbChangescript;
import WrenchDb.DAL.Entities.WdbEntity;
import WrenchDb.DAL.Entities.WdbProperty;
import WrenchDb.DAL.Entities.WdbPropertyType;
import WrenchDb.DAL.Entities.WdbRelease;
import WrenchDb.DAL.Helpers.HContext;
import WrenchDb.Deploy.Database.WdbDatabaseDeployer;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Daniele Fontani
 */
@EventListenerAnnotation()
public class WdbEntityListener extends EventListener {

    @Override
    public String getName() {
        return "WdbApplicationAudit";
    }

    @Override
    public String getEventSource() {
        return "wdb_entity";
    }


    @Override
    public void AfterInsert(Object entityToSave, Object objectId, String EventProvider) {
        long id=-1;
        id= Long.parseLong(objectId.toString());
        Session s = HContext.Current().getSessionFactory().openSession();
        Transaction t= s.beginTransaction();
        try
        {
        WdbEntity entitySaved=HContext.Current().Get(s,WdbEntity.class,id);
       
        WdbApplication application=entitySaved.getWdbApplication();
        
        //Create Table
        WdbDatabaseDeployer db= WdbDatabaseDeployer.getDatabaseDeployer(application.getApplicationId());
        db.logOnly=true;
        db.createTable(entitySaved.getEntityName());
        db.addColumn(entity.getEntityName(),pkColumnName,property.getWdbPropertyType().getPropertyTypeSql(),null);
        db.addPk(entity.getEntityName(),pkColumnName);
       
         
       //Get last chacge script
       long version=0;
       List<WdbChangescript> prevVersion= s.createCriteria(WdbChangescript.class)
               .add(Restrictions.eq("wdbApplication.applicationId",application.getApplicationId()))
               .addOrder(Order.desc("changescriptId"))
               .setFetchSize(1)
               .list();
       
       if(prevVersion==null || prevVersion.size()>0)
       {
           version=prevVersion.get(0).getScriptSource()+1;
       }
       
     WdbPropertyType type= (WdbPropertyType)s.createCriteria(WdbPropertyType.class)
               .add(Restrictions.eq("propertyTypeName","AutoGeneratedPK"))
               .uniqueResult();
       
        //Add change
        WdbChangescript cs= new WdbChangescript();
        cs.setChangescriptDesc("ENTITY "+entitySaved.getEntityName()+" CREATION SCRIPT");
        cs.setChangescriptSql(db.getScript());
        cs.setIsDeployed(false);
        cs.setScriptSource(0);
        cs.setWdbApplication(application);
        s.saveOrUpdate(cs);
        
        WdbProperty prop= new WdbProperty();
        prop.setIsInlist(false);
        prop.setIsInview(false);
        prop.setPropertyName("wdb_"+entitySaved.getEntityName()+"_id");
        prop.setWdbEntity(entitySaved);
        prop.setWdbPropertyType(type);
        s.saveOrUpdate(prop);
        
                
        s.flush();
        t.commit();
        }
        catch(Exception err)
        {
            Logger.getLogger("").log(Level.SEVERE,"ADDING ENTITY",err);
            t.rollback();
        }
        finally
        {
            if(s!=null && s.isOpen())
                s.close();
        }
        
    }

    
    
}