package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "packages" })
@XmlRootElement(name = "RateV4Response")
public class RateV4Response {
    @XmlElements({@XmlElement(name = "Package", type = PackageResponse.class)})
    private List<PackageResponse> packages;

    public List<PackageResponse> getPackages() {
        return packages;
    }

    public void setPackages(List<PackageResponse> packages) {
        this.packages = packages;
    }
}
