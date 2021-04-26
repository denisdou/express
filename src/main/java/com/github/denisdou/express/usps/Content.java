package com.github.denisdou.express.usps;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content", propOrder = { "contentType","contentDescription"})
public class Content {
    @XmlElement(name = "ContentType")
    private String contentType;

    @XmlElement(name = "ContentDescription")
    private String contentDescription;

    public String getContentType() {
        return contentType;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }
}
