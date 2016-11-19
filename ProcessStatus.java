package com.anup.poc.model.v3;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ProcessStatus {
    
    private Boolean isReady;
    private String operationDescription;
    private String operationCode;

    /**
    * 
    * @return
    * The isReady
    */
    public Boolean getIsReady() {
    return isReady;
    }

    /**
    * 
    * @param isReady
    * The is_ready
    */
    public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
    }

    /**
    * 
    * @return
    * The operationDescription
    */
    public String getOperationDescription() {
    return operationDescription;
    }

    /**
    * 
    * @param operationDescription
    * The operation_description
    */
    public void setOperationDescription(String operationDescription) {
    this.operationDescription = operationDescription;
    }

    /**
    * 
    * @return
    * The operationCode
    */
    public String getOperationCode() {
    return operationCode;
    }

    /**
    * 
    * @param operationCode
    * The operation_code
    */
    public void setOperationCode(String operationCode) {
    this.operationCode = operationCode;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

}
