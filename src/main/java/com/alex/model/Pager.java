package com.alex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlElement;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Pager {

    @XmlElement(name = "records_per_page")
    private String _records;
    @XmlElement(name = "is_final_page")
    private Boolean _isFinalPage;
    @XmlElement(name = "current_page")
    private Integer _currentPage;
    @XmlElement(name = "next_page")
    private Integer _nextPage;


    public Pager() {
    }

    public Pager(Boolean _isFinalPage, Integer _nextPage) {
        this._isFinalPage = _isFinalPage;
        this._nextPage = _nextPage;
    }

    public String get_records() {
        return _records;
    }

    public void set_records(String _records) {
        this._records = _records;
    }

    public Boolean get_isFinalPage() {
        return _isFinalPage;
    }

    public void set_isFinalPage(Boolean _isFinalPage) {
        this._isFinalPage = _isFinalPage;
    }

    public Integer get_currentPage() {
        return _currentPage;
    }

    public void set_currentPage(Integer _currentPage) {
        this._currentPage = _currentPage;
    }

    public Integer getNextPage() {
        return _nextPage;
    }

    public void setNextPage(Integer nextPage) {
       _nextPage = nextPage;
    }
}
