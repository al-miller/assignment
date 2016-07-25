package com.alex.model;

import com.alex.model.filters.PriceFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;

@JsonIgnoreProperties(        ignoreUnknown = true)
public class User {
    @XmlElement
    private String userName;
    private PriceFilter filter;


    public User() {
    }

    public User(String userName, PriceFilter filter) {
        this.userName = userName;
        this.filter = filter;
    }


    public PriceFilter getFilter() {
        return filter;
    }

    public void setFilter(PriceFilter filter) {
        this.filter = filter;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
