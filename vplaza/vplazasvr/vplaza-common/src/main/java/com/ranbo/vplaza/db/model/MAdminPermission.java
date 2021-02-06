package com.ranbo.vplaza.db.model;

/**
 * Table: M_ADMIN_PERMISSION
 */
public class MAdminPermission {
    /**
     * Column: ID
     */
    private Short id;

    /**
     * Column: PERMISSION_NAME
     */
    private String permissionName;

    /**
     * Column: PERMISSION_CODE
     */
    private Byte permissionCode;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public Byte getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(Byte permissionCode) {
        this.permissionCode = permissionCode;
    }
}