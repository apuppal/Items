package com.anup.poc.model.v3;

import org.apache.commons.lang.builder.ToStringBuilder;

public class AlternateDescription {
    
    private String type;
    private String value;
    private String typeDescription;

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
    * The typeDescription
    */
    public String getTypeDescription() {
    return typeDescription;
    }

    /**
    * 
    * @param typeDescription
    * The type_description
    */
    public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

}
