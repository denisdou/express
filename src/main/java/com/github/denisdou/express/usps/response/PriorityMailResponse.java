/**
 * express - United States Postal Service Web Tool Kit Development for Java applications
 * Copyright (c) 2021 denisdou Software LLC <https://github.com/denisdou/express>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal 
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 */
package com.github.denisdou.express.usps.response;

import com.github.denisdou.express.usps.Address;

import javax.xml.bind.annotation.*;

/**
 * @author 402550833@qq.com doujiajun
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "originZip","destinationZip","days","message","effectiveAcceptanceDate","scheduledDeliveryDate" })
@XmlRootElement(name = "PriorityMailResponse")
public class PriorityMailResponse {

    @XmlElement(name = "OriginZip", required = true)
    protected String originZip;

    @XmlElement(name = "DestinationZip", required = true)
    protected String destinationZip;

    @XmlElement(name = "Days", required = true)
    protected Integer days;

    @XmlElement(name = "Message", required = true)
    protected String message;

    @XmlElement(name = "EffectiveAcceptanceDate", required = true)
    protected String effectiveAcceptanceDate;

    @XmlElement(name = "ScheduledDeliveryDate", required = true)
    protected String scheduledDeliveryDate;

    public String getOriginZip() {
        return originZip;
    }

    public String getDestinationZip() {
        return destinationZip;
    }

    public Integer getDays() {
        return days;
    }

    public String getMessage() {
        return message;
    }

    public String getEffectiveAcceptanceDate() {
        return effectiveAcceptanceDate;
    }

    public String getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    public void setOriginZip(String originZip) {
        this.originZip = originZip;
    }

    public void setDestinationZip(String destinationZip) {
        this.destinationZip = destinationZip;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setEffectiveAcceptanceDate(String effectiveAcceptanceDate) {
        this.effectiveAcceptanceDate = effectiveAcceptanceDate;
    }

    public void setScheduledDeliveryDate(String scheduledDeliveryDate) {
        this.scheduledDeliveryDate = scheduledDeliveryDate;
    }
}
