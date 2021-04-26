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
package com.github.denisdou.express;

public class ExpressException extends Exception {

    private String code;

    /**
     * @param message message
     * @param cause cause
     * @param enableSuppression enableSuppression
     * @param writableStackTrace writableStackTrace
     */
    public ExpressException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message.trim(), cause, enableSuppression, writableStackTrace);
    }

    /**
     * @param cause cause
     */
    public ExpressException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message message
     * @param cause cause
     */
    public ExpressException(String message, Throwable cause) {
        super(message.trim(), cause);
    }

    /**
     * @param message message
     */
    public ExpressException(String message) {
        super(message.trim());
    }

    /**
     * @param message message
     * @param code code
     */
    public ExpressException(String message, String code) {
        super(message.trim());
        code = code;
    }

    public ExpressException() {
        super();
    }

    public String getCode() {
        return (code);
    }
}
