package WrenchDb.DAL.Test;
// Generated 26-nov-2013 23.03.15 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * WdbSitemap generated by hbm2java
 */
public class WdbSitemap  implements java.io.Serializable {


     private long sitemapId;
     private WdbApplication wdbApplication;
     private WdbSitemap wdbSitemap;
     private String sitemapUrl;
     private String configData;
     private String sitemapName;
     private String sitemapLabel;
     private Set<WdbSitemap> wdbSitemaps = new HashSet<WdbSitemap>(0);

    public WdbSitemap() {
    }

	
    public WdbSitemap(long sitemapId, WdbApplication wdbApplication, String sitemapUrl) {
        this.sitemapId = sitemapId;
        this.wdbApplication = wdbApplication;
        this.sitemapUrl = sitemapUrl;
    }
    public WdbSitemap(long sitemapId, WdbApplication wdbApplication, WdbSitemap wdbSitemap, String sitemapUrl, String configData, String sitemapName, String sitemapLabel, Set<WdbSitemap> wdbSitemaps) {
       this.sitemapId = sitemapId;
       this.wdbApplication = wdbApplication;
       this.wdbSitemap = wdbSitemap;
       this.sitemapUrl = sitemapUrl;
       this.configData = configData;
       this.sitemapName = sitemapName;
       this.sitemapLabel = sitemapLabel;
       this.wdbSitemaps = wdbSitemaps;
    }
   
    public long getSitemapId() {
        return this.sitemapId;
    }
    
    public void setSitemapId(long sitemapId) {
        this.sitemapId = sitemapId;
    }
    public WdbApplication getWdbApplication() {
        return this.wdbApplication;
    }
    
    public void setWdbApplication(WdbApplication wdbApplication) {
        this.wdbApplication = wdbApplication;
    }
    public WdbSitemap getWdbSitemap() {
        return this.wdbSitemap;
    }
    
    public void setWdbSitemap(WdbSitemap wdbSitemap) {
        this.wdbSitemap = wdbSitemap;
    }
    public String getSitemapUrl() {
        return this.sitemapUrl;
    }
    
    public void setSitemapUrl(String sitemapUrl) {
        this.sitemapUrl = sitemapUrl;
    }
    public String getConfigData() {
        return this.configData;
    }
    
    public void setConfigData(String configData) {
        this.configData = configData;
    }
    public String getSitemapName() {
        return this.sitemapName;
    }
    
    public void setSitemapName(String sitemapName) {
        this.sitemapName = sitemapName;
    }
    public String getSitemapLabel() {
        return this.sitemapLabel;
    }
    
    public void setSitemapLabel(String sitemapLabel) {
        this.sitemapLabel = sitemapLabel;
    }
    public Set<WdbSitemap> getWdbSitemaps() {
        return this.wdbSitemaps;
    }
    
    public void setWdbSitemaps(Set<WdbSitemap> wdbSitemaps) {
        this.wdbSitemaps = wdbSitemaps;
    }




}

