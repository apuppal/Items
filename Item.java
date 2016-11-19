package com.anup.poc.model.v3;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Item {
    
    private List<Identifier> identifier = new ArrayList<Identifier>();
    private String relation;
    private String relationDescription;
    private String dataPageLink;
    private Long imnIdentifier;
    private Boolean isOrderable;
    private Boolean isSellable;
    private String generalDescription;
    private Boolean isCircularPublish;
    private List<BusinessProcessStatus> businessProcessStatus = new ArrayList<BusinessProcessStatus>();
    private String dpci;
    private Long departmentId;
    private Long classId;
    private Long itemId;
    private OnlineDescription onlineDescription;
    private StoreDescription storeDescription;
    private List<AlternateDescription> alternateDescription = new ArrayList<AlternateDescription>();

    /**
    * 
    * @return
    * The identifier
    */
    public List<Identifier> getIdentifier() {
    return identifier;
    }

    /**
    * 
    * @param identifier
    * The identifier
    */
    public void setIdentifier(List<Identifier> identifier) {
    this.identifier = identifier;
    }

    /**
    * 
    * @return
    * The relation
    */
    public String getRelation() {
    return relation;
    }

    /**
    * 
    * @param relation
    * The relation
    */
    public void setRelation(String relation) {
    this.relation = relation;
    }

    /**
    * 
    * @return
    * The relationDescription
    */
    public String getRelationDescription() {
    return relationDescription;
    }

    /**
    * 
    * @param relationDescription
    * The relation_description
    */
    public void setRelationDescription(String relationDescription) {
    this.relationDescription = relationDescription;
    }

    /**
    * 
    * @return
    * The dataPageLink
    */
    public String getDataPageLink() {
    return dataPageLink;
    }

    /**
    * 
    * @param dataPageLink
    * The data_page_link
    */
    public void setDataPageLink(String dataPageLink) {
    this.dataPageLink = dataPageLink;
    }

    /**
    * 
    * @return
    * The imnIdentifier
    */
    public Long getImnIdentifier() {
    return imnIdentifier;
    }

    /**
    * 
    * @param imnIdentifier
    * The imn_identifier
    */
    public void setImnIdentifier(Long imnIdentifier) {
    this.imnIdentifier = imnIdentifier;
    }

    /**
    * 
    * @return
    * The isOrderable
    */
    public Boolean getIsOrderable() {
    return isOrderable;
    }

    /**
    * 
    * @param isOrderable
    * The is_orderable
    */
    public void setIsOrderable(Boolean isOrderable) {
    this.isOrderable = isOrderable;
    }

    /**
    * 
    * @return
    * The isSellable
    */
    public Boolean getIsSellable() {
    return isSellable;
    }

    /**
    * 
    * @param isSellable
    * The is_sellable
    */
    public void setIsSellable(Boolean isSellable) {
    this.isSellable = isSellable;
    }

    /**
    * 
    * @return
    * The generalDescription
    */
    public String getGeneralDescription() {
    return generalDescription;
    }

    /**
    * 
    * @param generalDescription
    * The general_description
    */
    public void setGeneralDescription(String generalDescription) {
    this.generalDescription = generalDescription;
    }

    /**
    * 
    * @return
    * The isCircularPublish
    */
    public Boolean getIsCircularPublish() {
    return isCircularPublish;
    }

    /**
    * 
    * @param isCircularPublish
    * The is_circular_publish
    */
    public void setIsCircularPublish(Boolean isCircularPublish) {
    this.isCircularPublish = isCircularPublish;
    }

    /**
    * 
    * @return
    * The businessProcessStatus
    */
    public List<BusinessProcessStatus> getBusinessProcessStatus() {
    return businessProcessStatus;
    }

    /**
    * 
    * @param businessProcessStatus
    * The business_process_status
    */
    public void setBusinessProcessStatus(List<BusinessProcessStatus> businessProcessStatus) {
    this.businessProcessStatus = businessProcessStatus;
    }

    /**
    * 
    * @return
    * The dpci
    */
    public String getDpci() {
    return dpci;
    }

    /**
    * 
    * @param dpci
    * The dpci
    */
    public void setDpci(String dpci) {
    this.dpci = dpci;
    }

    /**
    * 
    * @return
    * The departmentId
    */
    public Long getDepartmentId() {
    return departmentId;
    }

    /**
    * 
    * @param departmentId
    * The department_id
    */
    public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
    }

    /**
    * 
    * @return
    * The classId
    */
    public Long getClassId() {
    return classId;
    }

    /**
    * 
    * @param classId
    * The class_id
    */
    public void setClassId(Long classId) {
    this.classId = classId;
    }

    /**
    * 
    * @return
    * The itemId
    */
    public Long getItemId() {
    return itemId;
    }

    /**
    * 
    * @param itemId
    * The item_id
    */
    public void setItemId(Long itemId) {
    this.itemId = itemId;
    }

    /**
    * 
    * @return
    * The onlineDescription
    */
    public OnlineDescription getOnlineDescription() {
    return onlineDescription;
    }

    /**
    * 
    * @param onlineDescription
    * The online_description
    */
    public void setOnlineDescription(OnlineDescription onlineDescription) {
    this.onlineDescription = onlineDescription;
    }

    /**
    * 
    * @return
    * The storeDescription
    */
    public StoreDescription getStoreDescription() {
    return storeDescription;
    }

    /**
    * 
    * @param storeDescription
    * The store_description
    */
    public void setStoreDescription(StoreDescription storeDescription) {
    this.storeDescription = storeDescription;
    }

    /**
    * 
    * @return
    * The alternateDescription
    */
    public List<AlternateDescription> getAlternateDescription() {
    return alternateDescription;
    }

    /**
    * 
    * @param alternateDescription
    * The alternate_description
    */
    public void setAlternateDescription(List<AlternateDescription> alternateDescription) {
    this.alternateDescription = alternateDescription;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

}
