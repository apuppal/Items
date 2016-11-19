package com.anup.poc.model.v3;

import org.apache.commons.lang.builder.ToStringBuilder;

public class RequestAttribute {
    
    private String name;
    private String value;

    /**
    * 
    * @return
    * The name
    */
    public String getName() {
    return name;
    }

    /**
    * 
    * @param name
    * The name
    */
    public void setName(String name) {
    this.name = name;
    }

    /**
    * 
    * @return
    * The value
    */
    public String getValue() {
    return value;
    }

    /**
    * 
    * @param value
    * The value
    */
    public void setValue(String value) {
    this.value = value;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

}
