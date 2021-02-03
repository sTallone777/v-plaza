package com.ranbo.vplaza.model;

import java.util.Date;

public class TUserFavorite {
    private Long id;

    private String uniqueId;

    private Short behaviorCode;

    private String behaviorObj;

    private Integer amount;

    private Boolean isDeleted;

    private String createUser;

    private Date createDate;

    private String updateUser;

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
        this.uniqueId = uniqueId;
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
        this.behaviorObj = behaviorObj;
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
        this.createUser = createUser;
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
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}