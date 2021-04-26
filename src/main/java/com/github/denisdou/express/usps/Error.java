package com.github.denisdou.express.usps;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"error", "number", "description", "source","helpFile","helpContext"})
public class Error {
    @XmlElement(name = "Error")
    private String error;

    @XmlElement(name = "Number")
    private String number;

    @XmlElement(name = "Description")
    private String description;

    @XmlElement(name = "Source")
    private String source;

    @XmlElement(name = "HelpFile")
    private String helpFile;

    @XmlElement(name = "HelpContext")
    private String helpContext;

    public String getError() {
        return error;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public String getSource() {
        return source;
    }

    public String getHelpFile() {
        return helpFile;
    }

    public String getHelpContext() {
        return helpContext;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setHelpFile(String helpFile) {
        this.helpFile = helpFile;
    }

    public void setHelpContext(String helpContext) {
        this.helpContext = helpContext;
    }
}
