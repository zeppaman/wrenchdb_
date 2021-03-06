package WrenchDb.DAL.Entities;
// Generated 8-dic-2013 14.59.34 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

/**
 * WdbChangescript generated by hbm2java
 */
@Entity
@Table(name="wdb_changescript"
    ,schema="public"
)
public class WdbChangescript  implements java.io.Serializable {


     private long changescriptId;
     private WdbApplication wdbApplication;
     private String changescriptDesc;
     private boolean isDeployed;
     private String changescriptSql;
     private Integer scriptSource;

    public WdbChangescript() {
    }

	
    public WdbChangescript(long changescriptId, boolean isDeployed) {
        this.changescriptId = changescriptId;
        this.isDeployed = isDeployed;
    }
    public WdbChangescript(long changescriptId, WdbApplication wdbApplication, String changescriptDesc, boolean isDeployed, String changescriptSql, Integer scriptSource) {
       this.changescriptId = changescriptId;
       this.wdbApplication = wdbApplication;
       this.changescriptDesc = changescriptDesc;
       this.isDeployed = isDeployed;
       this.changescriptSql = changescriptSql;
       this.scriptSource = scriptSource;
    }
   
     @Id 
          @Generated(GenerationTime.INSERT)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="changescript_id", unique=true, nullable=false)
    public long getChangescriptId() {
        return this.changescriptId;
    }
    
    public void setChangescriptId(long changescriptId) {
        this.changescriptId = changescriptId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="application_id")
    public WdbApplication getWdbApplication() {
        return this.wdbApplication;
    }
    
    public void setWdbApplication(WdbApplication wdbApplication) {
        this.wdbApplication = wdbApplication;
    }
    
    @Column(name="changescript_desc", length=200)
    public String getChangescriptDesc() {
        return this.changescriptDesc;
    }
    
    public void setChangescriptDesc(String changescriptDesc) {
        this.changescriptDesc = changescriptDesc;
    }
    
    @Column(name="is_deployed", nullable=false)
    public boolean isIsDeployed() {
        return this.isDeployed;
    }
    
    public void setIsDeployed(boolean isDeployed) {
        this.isDeployed = isDeployed;
    }
    
    @Column(name="changescript_sql", length=8000)
    public String getChangescriptSql() {
        return this.changescriptSql;
    }
    
    public void setChangescriptSql(String changescriptSql) {
        this.changescriptSql = changescriptSql;
    }
    
    @Column(name="script_source")
    public Integer getScriptSource() {
        return this.scriptSource;
    }
    
    public void setScriptSource(Integer scriptSource) {
        this.scriptSource = scriptSource;
    }




}


