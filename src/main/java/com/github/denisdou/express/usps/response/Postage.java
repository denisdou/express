package com.github.denisdou.express.usps.response;
import com.github.denisdou.express.usps.response.SpecialService;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"classId", "mailService", "rate", "commercialRate", "commercialPlusRate", "specialServices"})
public class Postage {
    @XmlAttribute(name = "CLASSID")
    private String classId;

    @XmlElement(name = "MailService")
    private String mailService;
    @XmlElement(name = "Rate")
    private String rate;

    @XmlElement(name = "CommercialRate")
    private String commercialRate;

    @XmlElement(name = "CommercialPlusRate")
    private String commercialPlusRate;

    @XmlElements({ @XmlElement(name = "SpecialServices", type = SpecialService.class)})
    private List<SpecialService> specialServices;

    public String getMailService() {
        return mailService;
    }

    public String getRate() {
        return rate;
    }

    public String getClassId() {
        return classId;
    }

    public List<SpecialService> getSpecialServices() {
        return specialServices;
    }

    public void setMailService(String mailService) {
        this.mailService = mailService;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setSpecialServices(List<SpecialService> specialServices) {
        this.specialServices = specialServices;
    }

    public String getCommercialPlusRate() {
        return commercialPlusRate;
    }

    public void setCommercialPlusRate(String commercialPlusRate) {
        this.commercialPlusRate = commercialPlusRate;
    }

    public String getCommercialRate() {
        return commercialRate;
    }

    public void setCommercialRate(String commercialRate) {
        this.commercialRate = commercialRate;
    }
}
