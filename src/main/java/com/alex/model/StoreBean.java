package com.alex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlElement;

@JsonIgnoreProperties(        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class StoreBean extends BaseWrapper{

    @XmlElement(name = "result")
    private StoreBean2 store;


    public StoreBean() {
    }

//
//    public Store getStore() {
//        return store;
//    }
//
//    public void setStore(Store store) {
//        this.store = store;
//    }

}
