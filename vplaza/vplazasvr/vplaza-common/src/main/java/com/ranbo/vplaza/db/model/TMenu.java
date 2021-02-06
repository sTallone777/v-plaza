package com.ranbo.vplaza.db.model;

import java.util.Date;

/**
 * Table: T_MENU
 */
public class TMenu {
    /**
     * Column: ID
     */
    private Short id;

    /**
     * Column: MENU_NAME
     */
    private String menuName;

    /**
     * Column: MENU_CODE
     */
    private String menuCode;

    /**
     * Column: MENU_LEVEL
     */
    private Byte menuLevel;

    /**
     * Column: IS_CHILD
     */
    private Boolean isChild;

    /**
     * Column: HAS_CHILD
     */
    private Boolean hasChild;

    /**
     * Column: PARENT_CODE
     */
    private String parentCode;

    /**
     * Column: USER_PERMISSION
     */
    private Byte userPermission;

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

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public Byte getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Byte menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Boolean getIsChild() {
        return isChild;
    }

    public void setIsChild(Boolean isChild) {
        this.isChild = isChild;
    }

    public Boolean getHasChild() {
        return hasChild;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public Byte getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(Byte userPermission) {
        this.userPermission = userPermission;
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