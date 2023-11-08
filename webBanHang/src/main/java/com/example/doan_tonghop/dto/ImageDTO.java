package com.example.doan_tonghop.dto;



public class ImageDTO {

    private Long parentId;
    private Long orderBy;
    private String imageUrl;
    private Long statusId;
    private Long imageType;

    public ImageDTO(Long parentId, Long orderBy, String imageUrl, Long statusId, Long imageType) {
        this.parentId = parentId;
        this.orderBy = orderBy;
        this.imageUrl = imageUrl;
        this.statusId = statusId;
        this.imageType = imageType;
    }
    public ImageDTO(){}

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Long orderBy) {
        this.orderBy = orderBy;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getImageType() {
        return imageType;
    }

    public void setImageType(Long imageType) {
        this.imageType = imageType;
    }
}
