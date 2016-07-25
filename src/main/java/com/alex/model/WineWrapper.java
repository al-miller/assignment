package com.alex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class WineWrapper extends BaseWrapper {


    @XmlElement(name = "pager")
    private Pager pager;
    @XmlElement(name = "result")
    private List<Wine> wines = new ArrayList<>();

    public WineWrapper() {
    }

    public WineWrapper(Pager pager, List<Wine> wines) {
        this.pager = pager;
        this.wines = wines;
    }

    public List<Wine> getWines() {
        return wines;
    }

    public void setWines(List<Wine> wines) {
        this.wines = wines;
    }

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }
}
