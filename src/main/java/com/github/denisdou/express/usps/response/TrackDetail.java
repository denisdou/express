package com.github.denisdou.express.usps.response;
import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackFieldDetail", propOrder = {"eventTime","eventDate","event","eventCity","eventState","eventZipCode","eventCountry","firmName","name","authorizedAgent","eventCode","eventStatusCategory"})
public class TrackDetail {
    @XmlElement(name = "EventTime")
    private String eventTime;
    @XmlElement(name = "EventDate")
    private String eventDate;
    @XmlElement(name = "Event")
    private String event;
    @XmlElement(name = "EventCity")
    private String eventCity;
    @XmlElement(name = "EventState")
    private String eventState;
    @XmlElement(name = "EventZipCode")
    private int eventZipCode;
    @XmlElement(name = "EventCountry")
    private String eventCountry;
    @XmlElement(name = "FirmName")
    private String firmName;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "AuthorizedAgent")
    private boolean authorizedAgent;
    @XmlElement(name = "EventCode")
    private String eventCode;
    @XmlElement(name = "EventStatusCategory")
    private String eventStatusCategory;

    public String getEventTime() {
        return eventTime;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEvent() {
        return event;
    }

    public String getEventCity() {
        return eventCity;
    }

    public String getEventState() {
        return eventState;
    }

    public int getEventZipCode() {
        return eventZipCode;
    }

    public String getEventCountry() {
        return eventCountry;
    }

    public String getFirmName() {
        return firmName;
    }

    public String getName() {
        return name;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setEventCity(String eventCity) {
        this.eventCity = eventCity;
    }

    public void setEventState(String eventState) {
        this.eventState = eventState;
    }

    public void setEventZipCode(int eventZipCode) {
        this.eventZipCode = eventZipCode;
    }

    public void setEventCountry(String eventCountry) {
        this.eventCountry = eventCountry;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorizedAgent(boolean authorizedAgent) {
        this.authorizedAgent = authorizedAgent;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public void setEventStatusCategory(String eventStatusCategory) {
        this.eventStatusCategory = eventStatusCategory;
    }

    public boolean isAuthorizedAgent() {
        return authorizedAgent;
    }

    public String getEventCode() {
        return eventCode;
    }

    public String getEventStatusCategory() {
        return eventStatusCategory;
    }
}
