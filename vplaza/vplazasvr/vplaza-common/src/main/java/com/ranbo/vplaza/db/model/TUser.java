package com.ranbo.vplaza.db.model;

import java.util.Date;

/**
 * Table: T_USER
 */
public class TUser {
    /**
     * Column: ID
     */
    private Long id;

    /**
     * Column: USER_NAME
     */
    private String userName;

    /**
     * Column: USER_PASS
     */
    private String userPass;

    /**
     * Column: UNIQUE_ID
     */
    private String uniqueId;

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
     * Column: AGE
     */
    private Byte age;

    /**
     * Column: SEX
     */
    private String sex;

    /**
     * Column: COUNTRY
     */
    private String country;

    /**
     * Column: EMAIL
     */
    private String email;

    /**
     * Column: TEL
     */
    private String tel;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
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

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
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