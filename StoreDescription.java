package com.anup.poc.model.v3;

import org.apache.commons.lang.builder.ToStringBuilder;

public class StoreDescription {
    
    private String value;
    private String type;

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

    /**
    * 
    * @return
    * The type
    */
    public String getType() {
    return type;
    }

    /**
    * 
    * @param type
    * The type
    */
    public void setType(String type) {
    this.type = type;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

}
