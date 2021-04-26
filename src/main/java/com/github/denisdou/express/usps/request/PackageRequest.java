package com.github.denisdou.express.usps.request;
import com.github.denisdou.express.usps.Content;
import com.github.denisdou.express.usps.response.SpecialService;

import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", propOrder = {
        "id",
        "service",
        "zipOrigination",
        "zipDestination",
        "pounds",
        "ounces",
        "container",
        "size",
        "width",
        "length",
        "height",
        "girth",
        "value",
        "amountToCollect",
        "specialService",
        "content",
        "groundOnly",
        "sortBy",
        "machinable",
        "returnLocations",
        "returnServiceInfo",
        "dropOffTime",
        "shipDate",
        "firstClassMailType"})
public class PackageRequest {
    @XmlAttribute(name = "ID")
    private String id;

    @XmlElement(name = "Service")
    private String service;

    @XmlElement(name = "FirstClassMailType")
    private String firstClassMailType;

    @XmlElement(name = "ZipOrigination")
    private String zipOrigination;

    @XmlElement(name = "ZipDestination")
    private String zipDestination;

    @XmlElement(name = "Pounds")
    private String pounds;

    @XmlElement(name = "Ounces")
    private String ounces;

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

    @XmlElement(name = "Value")
    private String value;

    @XmlElement(name = "AmountToCollect")
    private String amountToCollect;

    @XmlElement(name = "SpecialServices")
    private SpecialService specialService;

    @XmlElement(name = "Content")
    private Content content;

    @XmlElement(name = "GroundOnly")
    private String groundOnly;

    @XmlElement(name = "SortBy")
    private String sortBy;

    @XmlElement(name = "Machinable")
    private String machinable;

    @XmlElement(name = "ReturnLocations")
    private String returnLocations;

    @XmlElement(name = "ReturnServiceInfo")
    private String returnServiceInfo;

    @XmlElement(name = "DropOffTime")
    private String dropOffTime;

    @XmlElement(name = "ShipDate")
    private ShipDate shipDate;

    public String getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public String getFirstClassMailType() {
        return firstClassMailType;
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

    public String getValue() {
        return value;
    }

    public String getAmountToCollect() {
        return amountToCollect;
    }

    public SpecialService getSpecialServices() {
        return specialService;
    }

    public Content getContent() {
        return content;
    }

    public String getGroundOnly() {
        return groundOnly;
    }

    public String getSortBy() {
        return sortBy;
    }

    public String getMachinable() {
        return machinable;
    }

    public String getReturnLocations() {
        return returnLocations;
    }

    public String getReturnServiceInfo() {
        return returnServiceInfo;
    }

    public String getDropOffTime() {
        return dropOffTime;
    }

    public ShipDate getShipDate() {
        return shipDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setFirstClassMailType(String firstClassMailType) {
        this.firstClassMailType = firstClassMailType;
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

    public void setValue(String value) {
        this.value = value;
    }

    public void setAmountToCollect(String amountToCollect) {
        this.amountToCollect = amountToCollect;
    }

    public void setSpecialServices(SpecialService specialService) {
        this.specialService = specialService;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setGroundOnly(String groundOnly) {
        this.groundOnly = groundOnly;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public void setMachinable(String machinable) {
        this.machinable = machinable;
    }

    public void setReturnLocations(String returnLocations) {
        this.returnLocations = returnLocations;
    }

    public void setReturnServiceInfo(String returnServiceInfo) {
        this.returnServiceInfo = returnServiceInfo;
    }

    public void setDropOffTime(String dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public void setShipDate(String dateTime, String option) {
        this.shipDate = new ShipDate(dateTime, option);
    }

    @XmlRootElement(name = "ShipDate")
    public static class ShipDate {
        @XmlValue
        private String value;

        @XmlAttribute(name = "Option")
        private String option;

        public ShipDate() {}

        public ShipDate(String dateTime, String option) {
            this.value = dateTime;
            this.option = option;
        }
    }
}
