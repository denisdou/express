package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialService", propOrder = { "serviceId","serviceName","available","price"})
public class SpecialService {
    @XmlElement(name = "ServiceID")
    private String serviceId;

    @XmlElement(name = "ServiceName")
    private String serviceName;

    @XmlElement(name = "Available")
    private boolean available;

    @XmlElement(name = "Price")
    private BigDecimal price;

    public String getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public boolean isAvailable() {
        return available;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
