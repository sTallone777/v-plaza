package com.ranbo.vplaza.db.model;

import java.util.Date;

/**
 * Table: T_USER_ACCOUNT
 */
public class TUserAccount {
    /**
     * Column: ID
     */
    private Long id;

    /**
     * Column: UNIQUE_ID
     */
    private String uniqueId;

    /**
     * Column: BEHAVIOR_CODE
     */
    private Short behaviorCode;

    /**
     * Column: BEHAVIOR_OBJ
     */
    private String behaviorObj;

    /**
     * Column: AMOUNT
     */
    private Integer amount;

    /**
     * Column: IS_DELETED
     */
    private Boolean isDeleted;

    /**
     * Column: CREATE_USER
     */
    private String createUser;

    /**
     * Column: CREATE_DATE
     */
    private Date createDate;

    /**
     * Column: UPDATE_USER
     */
    private String updateUser;

    /**
     * Column: UPDATE_DATE
     */
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
    }

    public Short getBehaviorCode() {
        return behaviorCode;
    }

    public void setBehaviorCode(Short behaviorCode) {
        this.behaviorCode = behaviorCode;
    }

    public String getBehaviorObj() {
        return behaviorObj;
    }

    public void setBehaviorObj(String behaviorObj) {
        this.behaviorObj = behaviorObj == null ? null : behaviorObj.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}