package WrenchDb.DAL.Test;
// Generated 26-nov-2013 23.03.15 by Hibernate Tools 3.2.1.GA



/**
 * WdbChangescript generated by hbm2java
 */
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
   
    public long getChangescriptId() {
        return this.changescriptId;
    }
    
    public void setChangescriptId(long changescriptId) {
        this.changescriptId = changescriptId;
    }
    public WdbApplication getWdbApplication() {
        return this.wdbApplication;
    }
    
    public void setWdbApplication(WdbApplication wdbApplication) {
        this.wdbApplication = wdbApplication;
    }
    public String getChangescriptDesc() {
        return this.changescriptDesc;
    }
    
    public void setChangescriptDesc(String changescriptDesc) {
        this.changescriptDesc = changescriptDesc;
    }
    public boolean isIsDeployed() {
        return this.isDeployed;
    }
    
    public void setIsDeployed(boolean isDeployed) {
        this.isDeployed = isDeployed;
    }
    public String getChangescriptSql() {
        return this.changescriptSql;
    }
    
    public void setChangescriptSql(String changescriptSql) {
        this.changescriptSql = changescriptSql;
    }
    public Integer getScriptSource() {
        return this.scriptSource;
    }
    
    public void setScriptSource(Integer scriptSource) {
        this.scriptSource = scriptSource;
    }




}


