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
    private final String id;

    @XmlElement(name = "Service")
    private final String service;

    @XmlElement(name = "FirstClassMailType")
    private final String firstClassMailType;

    @XmlElement(name = "ZipOrigination")
    private final String zipOrigination;

    @XmlElement(name = "ZipDestination")
    private final String zipDestination;

    @XmlElement(name = "Pounds")
    private final String pounds;

    @XmlElement(name = "Ounces")
    private final String ounces;

    @XmlElement(name = "Container")
    private final String container;

    @XmlElement(name = "Size")
    private final String size;

    @XmlElement(name = "Width")
    private final String width;

    @XmlElement(name = "Length")
    private final String length;

    @XmlElement(name = "Height")
    private final String height;

    @XmlElement(name = "Girth")
    private final String girth;

    @XmlElement(name = "Value")
    private final String value;

    @XmlElement(name = "AmountToCollect")
    private final String amountToCollect;

    @XmlElement(name = "SpecialServices")
    private final SpecialService specialService;

    @XmlElement(name = "Content")
    private final Content content;

    @XmlElement(name = "GroundOnly")
    private final String groundOnly;

    @XmlElement(name = "SortBy")
    private final String sortBy;

    @XmlElement(name = "Machinable")
    private final String machinable;

    @XmlElement(name = "ReturnLocations")
    private final String returnLocations;

    @XmlElement(name = "ReturnServiceInfo")
    private final String returnServiceInfo;

    @XmlElement(name = "DropOffTime")
    private final String dropOffTime;

    @XmlElement(name = "ShipDate")
    private final ShipDate shipDate;
    public PackageRequest() {
        this(new Builder());
    }

    public PackageRequest(Builder builder) {
        this.id = builder.id;
        this.service = builder.service;
        this.firstClassMailType = builder.firstClassMailType;
        this.zipOrigination = builder.zipOrigination;
        this.zipDestination = builder.zipDestination;
        this.pounds = builder.pounds;
        this.ounces = builder.ounces;
        this.container = builder.container;
        this.size = builder.size;
        this.width = builder.width;
        this.length = builder.length;
        this.height = builder.height;
        this.girth = builder.girth;
        this.value = builder.value;
        this.amountToCollect = builder.amountToCollect;
        this.specialService = builder.specialService;
        this.content = builder.content;
        this.groundOnly = builder.groundOnly;
        this.sortBy = builder.sortBy;
        this.machinable = builder.machinable;
        this.returnLocations = builder.returnLocations;
        this.returnServiceInfo = builder.returnServiceInfo;
        this.dropOffTime = builder.dropOffTime;
        this.shipDate = builder.shipDate;
    }

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

    public static class Builder {
        private String id;
        private String service;
        private String firstClassMailType;
        private String zipOrigination;
        private String zipDestination;
        private String pounds;
        private String ounces;
        private String container;
        private String size;
        private String width;
        private String length;
        private String height;
        private String girth;
        private String value;
        private String amountToCollect;
        private SpecialService specialService;
        private Content content;
        private String groundOnly;
        private String sortBy;
        private String machinable;
        private String returnLocations;
        private String returnServiceInfo;
        private String dropOffTime;
        private ShipDate shipDate;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder service(String service) {
            this.service = service;
            return this;
        }

        public Builder firstClassMailType(String firstClassMailType) {
            this.firstClassMailType = firstClassMailType;
            return this;
        }

        public Builder zipOrigination(String zipOrigination) {
            this.zipOrigination = zipOrigination;
            return this;
        }

        public Builder zipDestination(String zipDestination) {
            this.zipDestination = zipDestination;
            return this;
        }

        public Builder pounds(String pounds) {
            this.pounds = pounds;
            return this;
        }

        public Builder ounces(String ounces) {
            this.ounces = ounces;
            return this;
        }

        public Builder container(String container) {
            this.container = container;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder width(String width) {
            this.width = width;
            return this;
        }

        public Builder length(String length) {
            this.length = length;
            return this;
        }

        public Builder height(String height) {
            this.height = height;
            return this;
        }

        public Builder girth(String girth) {
            this.girth = girth;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Builder amountToCollect(String amountToCollect) {
            this.amountToCollect = amountToCollect;
            return this;
        }

        public Builder specialServices(SpecialService specialService) {
            this.specialService = specialService;
            return this;
        }

        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        public Builder groundOnly(String groundOnly) {
            this.groundOnly = groundOnly;
            return this;
        }

        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        public Builder machinable(String machinable) {
            this.machinable = machinable;
            return this;
        }

        public Builder returnLocations(String returnLocations) {
            this.returnLocations = returnLocations;
            return this;
        }

        public Builder returnServiceInfo(String returnServiceInfo) {
            this.returnServiceInfo = returnServiceInfo;
            return this;
        }

        public Builder dropOffTime(String dropOffTime) {
            this.dropOffTime = dropOffTime;
            return this;
        }

        public Builder shipDate(String dateTime, String option) {
            this.shipDate = new ShipDate(dateTime, option);
            return this;
        }

        public PackageRequest build() {
            return new PackageRequest(this);
        }
    }
}
