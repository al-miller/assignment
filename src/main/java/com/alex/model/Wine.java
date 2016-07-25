package com.alex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlElement;

@JsonIgnoreProperties(        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
//
public class Wine{

    @XmlElement(name = "id")
    private String _id;
    @XmlElement(name = "primary_category")
    private String _primaryCategory;
    @XmlElement(name = "secondary_category")
    private String _secondaryCategory;
    @XmlElement(name = "origin")
    private String _country;
    @XmlElement(name = "producer_name")
    private String _producer;
    @XmlElement(name = "price_in_cents")
    private Integer _price;
    @XmlElement(name = "released_on")
    private String _vintage;
    @XmlElement(name = "varietal")
    private String _varietal;


    public String get_country() {
        return _country;
    }

    public void set_country(String _country) {
        this._country = _country;
    }

    public String get_producer() {
        return _producer;
    }

    public void set_producer(String _producer) {
        this._producer = _producer;
    }

    public Integer get_price() {
        return _price;
    }

    public void set_price(Integer _price) {
        this._price = _price;
    }

    public String get_vintage() {
        return _vintage;
    }

    public void set_vintage(String _vintage) {
        this._vintage = _vintage;
    }

    public String get_varietal() {
        return _varietal;
    }

    public void set_varietal(String _varietal) {
        this._varietal = _varietal;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_primaryCategory() {
        return _primaryCategory;
    }

    public void set_primaryCategory(String _primaryCategory) {
        this._primaryCategory = _primaryCategory;
    }

    public String get_secondaryCategory() {
        return _secondaryCategory;
    }

    public void set_secondaryCategory(String _secondaryCategory) {
        this._secondaryCategory = _secondaryCategory;
    }
}
