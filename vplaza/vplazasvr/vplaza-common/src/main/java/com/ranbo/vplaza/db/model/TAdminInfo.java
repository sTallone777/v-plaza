package com.ranbo.vplaza.db.model;

import java.util.Date;

/**
 * Table: T_ADMIN_INFO
 */
public class TAdminInfo {
    /**
     * Column: ID
     */
    private Short id;

    /**
     * Column: ADMIN_NAME
     */
    private String adminName;

    /**
     * Column: ADMIN_PASS
     */
    private String adminPass;

    /**
     * Column: PERMISSION_CODE
     */
    private Byte permissionCode;

    /**
     * Column: LAST_LOGIN
     */
    private Date lastLogin;

    /**
     * Column: LAST_IPADDR
     */
    private String lastIpaddr;

    /**
     * Column: OLD_PASS
     */
    private String oldPass;

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

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass == null ? null : adminPass.trim();
    }

    public Byte getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(Byte permissionCode) {
        this.permissionCode = permissionCode;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIpaddr() {
        return lastIpaddr;
    }

    public void setLastIpaddr(String lastIpaddr) {
        this.lastIpaddr = lastIpaddr == null ? null : lastIpaddr.trim();
    }

    public String getOldPass() {
        return oldPass;
    }

    public void setOldPass(String oldPass) {
        this.oldPass = oldPass == null ? null : oldPass.trim();
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