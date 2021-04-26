package com.github.denisdou.express.usps.request;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "userId","revision","packages"})
@XmlRootElement(name = "RateV4Request")
public class RateV4Request extends RequestAbstract{
    @XmlAttribute(name = "USERID")
    private String userId;
    @XmlElement(name = "Package")
    private List<PackageRequest> packages;
    @XmlElement(name = "Revision")
    private String revision;

    public String getUserId() {
        return userId;
    }

    public List<PackageRequest> getPackages() {
        return packages;
    }

    public String getRevision() {
        return revision;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPackages(List<PackageRequest> packages) {
        this.packages = packages;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }
}
