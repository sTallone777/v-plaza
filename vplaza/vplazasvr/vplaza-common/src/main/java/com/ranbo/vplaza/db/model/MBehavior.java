package com.ranbo.vplaza.db.model;

import java.util.Date;

/**
 * Table: M_BEHAVIOR
 */
public class MBehavior {
    /**
     * Column: ID
     */
    private Short id;

    /**
     * Column: BEHAVIOR_NAME
     */
    private String behaviorName;

    /**
     * Column: BEHAVIOR_CODE
     */
    private Short behaviorCode;

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

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getBehaviorName() {
        return behaviorName;
    }

    public void setBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName == null ? null : behaviorName.trim();
    }

    public Short getBehaviorCode() {
        return behaviorCode;
    }

    public void setBehaviorCode(Short behaviorCode) {
        this.behaviorCode = behaviorCode;
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