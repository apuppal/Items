package com.anup.poc.model.v3;

import org.apache.commons.lang.builder.ToStringBuilder;

public class BusinessProcessStatus {
    
    private ProcessStatus processStatus;

    /**
    * 
    * @return
    * The processStatus
    */
    public ProcessStatus getProcessStatus() {
    return processStatus;
    }

    /**
    * 
    * @param processStatus
    * The process_status
    */
    public void setProcessStatus(ProcessStatus processStatus) {
    this.processStatus = processStatus;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

}
