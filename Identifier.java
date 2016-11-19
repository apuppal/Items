package com.anup.poc.model.v3;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Identifier {
    
    private String idType;
    private String id;
    private Object isPrimary;
    private String source;

    /**
    * 
    * @return
    * The idType
    */
    public String getIdType() {
    return idType;
    }

    /**
    * 
    * @param idType
    * The id_type
    */
    public void setIdType(String idType) {
    this.idType = idType;
    }

    /**
    * 
    * @return
    * The id
    */
    public String getId() {
    return id;
    }

    /**
    * 
    * @param id
    * The id
    */
    public void setId(String id) {
    this.id = id;
    }

    /**
    * 
    * @return
    * The isPrimary
    */
    public Object getIsPrimary() {
    return isPrimary;
    }

    /**
    * 
    * @param isPrimary
    * The is_primary
    */
    public void setIsPrimary(Object isPrimary) {
    this.isPrimary = isPrimary;
    }

    /**
    * 
    * @return
    * The source
    */
    public String getSource() {
    return source;
    }

    /**
    * 
    * @param source
    * The source
    */
    public void setSource(String source) {
    this.source = source;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

}
