package com.github.denisdou.express.usps.response;
import com.github.denisdou.express.usps.response.SpecialService;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"mailService", "rate","classId", "specialServices"})
public class Postage {
    @XmlElement(name = "MailService")
    private String mailService;
    @XmlElement(name = "Rate")
    private String rate;
    @XmlAttribute(name = "CLASSID")
    private String classId;

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
}
