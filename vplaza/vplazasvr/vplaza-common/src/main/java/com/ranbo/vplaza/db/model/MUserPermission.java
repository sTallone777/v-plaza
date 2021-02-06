package com.ranbo.vplaza.db.model;

/**
 * Table: M_USER_PERMISSION
 */
public class MUserPermission {
    /**
     * Column: ID
     */
    private Short id;

    /**
     * Column: UNIQUE_ID
     */
    private String uniqueId;

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

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
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