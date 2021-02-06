package com.ranbo.vplaza.db.model;

import java.util.Date;

/**
 * Table: T_VIDEO_INFO
 */
public class TVideoInfo {
    /**
     * Column: ID
     */
    private Long id;

    /**
     * Column: UNIQUE_ID
     */
    private String uniqueId;

    /**
     * Column: VIDEO_NAME
     */
    private String videoName;

    /**
     * Column: VIDEO_DESC
     */
    private String videoDesc;

    /**
     * Column: KEY_WORD
     */
    private String keyWord;

    /**
     * Column: VIDEO_NO
     */
    private String videoNo;

    /**
     * Column: RELEASE_YEAR
     */
    private Date releaseYear;

    /**
     * Column: PUBLISHER
     */
    private String publisher;

    /**
     * Column: STARRING
     */
    private String starring;

    /**
     * Column: DIRECTOR
     */
    private String director;

    /**
     * Column: COUNTRY
     */
    private String country;

    /**
     * Column: HAS_MOSAIC
     */
    private Boolean hasMosaic;

    /**
     * Column: PATH
     */
    private String path;

    /**
     * Column: MENU_CODE
     */
    private String menuCode;

    /**
     * Column: PLAY_PERMISSION
     */
    private Byte playPermission;

    /**
     * Column: VIEWS
     */
    private Long views;

    /**
     * Column: DURATION
     */
    private Date duration;

    /**
     * Column: THUMB_PATH
     */
    private String thumbPath;

    /**
     * Column: RELATED_IMG
     */
    private String relatedImg;

    /**
     * Column: CHECK_SUM
     */
    private String checkSum;

    /**
     * Column: APPROVAL_STATUS
     */
    private Boolean approvalStatus;

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

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoDesc() {
        return videoDesc;
    }

    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc == null ? null : videoDesc.trim();
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }

    public String getVideoNo() {
        return videoNo;
    }

    public void setVideoNo(String videoNo) {
        this.videoNo = videoNo == null ? null : videoNo.trim();
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring == null ? null : starring.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Boolean getHasMosaic() {
        return hasMosaic;
    }

    public void setHasMosaic(Boolean hasMosaic) {
        this.hasMosaic = hasMosaic;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public Byte getPlayPermission() {
        return playPermission;
    }

    public void setPlayPermission(Byte playPermission) {
        this.playPermission = playPermission;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public String getThumbPath() {
        return thumbPath;
    }

    public void setThumbPath(String thumbPath) {
        this.thumbPath = thumbPath == null ? null : thumbPath.trim();
    }

    public String getRelatedImg() {
        return relatedImg;
    }

    public void setRelatedImg(String relatedImg) {
        this.relatedImg = relatedImg == null ? null : relatedImg.trim();
    }

    public String getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum == null ? null : checkSum.trim();
    }

    public Boolean getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
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