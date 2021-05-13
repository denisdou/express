package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {"sdd","cot","facType","street","city","state","zipCode","isGuaranteed"})
@XmlRootElement(name = "Location")
public class Location{
    @XmlElement(name = "SDD")
    private String sdd;

    @XmlElement(name = "COT")
    private String cot;

    @XmlElement(name = "FacType")
    private String facType;

    @XmlElement(name = "Street")
    private String street;

    @XmlElement(name = "City")
    private String city;

    @XmlElement(name = "State")
    private String state;

    @XmlElement(name = "ZIP")
    private String zipCode;

    @XmlElement(name = "IsGuaranteed")
    private Integer isGuaranteed;

    public String getSdd() {
        return sdd;
    }

    public void setSdd(String sdd) {
        this.sdd = sdd;
    }

    public String getCot() {
        return cot;
    }

    public void setCot(String cot) {
        this.cot = cot;
    }

    public String getFacType() {
        return facType;
    }

    public void setFacType(String facType) {
        this.facType = facType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getIsGuaranteed() {
        return isGuaranteed;
    }

    public void setIsGuaranteed(Integer isGuaranteed) {
        this.isGuaranteed = isGuaranteed;
    }
}
