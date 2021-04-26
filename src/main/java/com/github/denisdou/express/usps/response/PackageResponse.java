package com.github.denisdou.express.usps.response;

import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "zipOrigination",
        "zipDestination",
        "pounds",
        "ounces",
        "firstClassMailType",
        "container",
        "size",
        "width",
        "length",
        "height",
        "girth",
        "machinable",
        "zone",
        "postage",
        "restrictions",
        "ratePriceType",
        "ratePaymentType",
        "error"})
@XmlRootElement(name = "Package")
public class PackageResponse {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlElement(name = "ZipOrigination")
    private String zipOrigination;

    @XmlElement(name = "ZipDestination")
    private String zipDestination;

    @XmlElement(name = "Pounds")
    private String pounds;

    @XmlElement(name = "Ounces")
    private String ounces;

    @XmlElement(name = "FirstClassMailType")
    private String firstClassMailType;

    @XmlElement(name = "Container")
    private String container;

    @XmlElement(name = "Size")
    private String size;

    @XmlElement(name = "Width")
    private String width;

    @XmlElement(name = "Length")
    private String length;

    @XmlElement(name = "Height")
    private String height;

    @XmlElement(name = "Girth")
    private String girth;

    @XmlElement(name = "Machinable")
    private String machinable;

    @XmlElement(name = "Zone")
    private String zone;

    @XmlElement(name = "Postage")
    private Postage postage;

    @XmlElement(name = "Restrictions")
    private String restrictions;

    @XmlElement(name = "RatePriceType")
    private String ratePriceType;

    @XmlElement(name = "RatePaymentType")
    private String ratePaymentType;

    @XmlElement(name = "Error")
    private Error error;

    public String getId() {
        return id;
    }

    public String getZipOrigination() {
        return zipOrigination;
    }

    public String getZipDestination() {
        return zipDestination;
    }

    public String getPounds() {
        return pounds;
    }

    public String getOunces() {
        return ounces;
    }

    public String getFirstClassMailType() {
        return firstClassMailType;
    }

    public String getContainer() {
        return container;
    }

    public String getSize() {
        return size;
    }

    public String getWidth() {
        return width;
    }

    public String getLength() {
        return length;
    }

    public String getHeight() {
        return height;
    }

    public String getGirth() {
        return girth;
    }

    public String getMachinable() {
        return machinable;
    }

    public String getZone() {
        return zone;
    }

    public Postage getPostage() {
        return postage;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public String getRatePriceType() {
        return ratePriceType;
    }

    public String getRatePaymentType() {
        return ratePaymentType;
    }

    public Error getError() {
        return error;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setZipOrigination(String zipOrigination) {
        this.zipOrigination = zipOrigination;
    }

    public void setZipDestination(String zipDestination) {
        this.zipDestination = zipDestination;
    }

    public void setPounds(String pounds) {
        this.pounds = pounds;
    }

    public void setOunces(String ounces) {
        this.ounces = ounces;
    }

    public void setFirstClassMailType(String firstClassMailType) {
        this.firstClassMailType = firstClassMailType;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setGirth(String girth) {
        this.girth = girth;
    }

    public void setMachinable(String machinable) {
        this.machinable = machinable;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public void setPostage(Postage postage) {
        this.postage = postage;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public void setRatePriceType(String ratePriceType) {
        this.ratePriceType = ratePriceType;
    }

    public void setRatePaymentType(String ratePaymentType) {
        this.ratePaymentType = ratePaymentType;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
