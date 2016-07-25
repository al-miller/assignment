package com.alex.model.filters;

import com.alex.model.Wine;

import java.util.ArrayList;
import java.util.List;

public class PriceFilter implements Filter{
    private Integer minPrice;//5
    private Integer maxPrice;//10

    public PriceFilter(Integer minPrice, Integer maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean filter(Wine wine){
        Integer price = wine.get_price();
        return price > minPrice && price < maxPrice;
    }

    @Override
    public List<Wine> filter(List<Wine> wines) {
        List<Wine> filtered = new ArrayList<>();
        if(wines != null){
            for (Wine w : wines){
                if (filter(w)){
                    filtered.add(w);
                }
            }
        }
        return filtered;
    }


    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }
}
