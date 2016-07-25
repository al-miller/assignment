package com.alex.model.filters;

import com.alex.model.Wine;

import java.util.List;


public interface Filter {

    boolean filter(Wine wine);

    List<Wine> filter(List<Wine> wine);

}
