package com.anup.poc.model.v3;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ProductCompositeResponse {
    
    private List<RequestAttribute> requestAttributes = new ArrayList<RequestAttribute>();
    private List<Item> items = new ArrayList<Item>();

    /**
    * 
    * @return
    * The requestAttributes
    */
    public List<RequestAttribute> getRequestAttributes() {
    return requestAttributes;
    }

    /**
    * 
    * @param requestAttributes
    * The request_attributes
    */
    public void setRequestAttributes(List<RequestAttribute> requestAttributes) {
    this.requestAttributes = requestAttributes;
    }

    /**
    * 
    * @return
    * The items
    */
    public List<Item> getItems() {
    return items;
    }

    /**
    * 
    * @param items
    * The items
    */
    public void setItems(List<Item> items) {
    this.items = items;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

}
