package com.ranbo.vplaza.model;

public class MUserPermission {
    private Short id;

    private String uniqueId;

    private String permissionName;

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