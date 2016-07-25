package com.alex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonIgnoreProperties(        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
//api response - basic fields
public class BaseWrapper {


    String status;
    String message;


    public BaseWrapper() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
