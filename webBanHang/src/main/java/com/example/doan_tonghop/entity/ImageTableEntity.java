package com.example.doan_tonghop.entity;

import javax.persistence.*;

@Entity
@Table(name = "ImageTable")
@IdClass(Image_PK.class)
public class ImageTableEntity {
    @Id
    @Column(name = "ParentId")
    private Long parentId;

    @Id
    @Column(name = "OrderBy ")
    private Long orderBy;

    @Column(name = "ImageUrl")
    private String imageUrl;

    @Column(name = "StatusId")
    private Long statusId;

    @Column(name = "ImageType")
    private Long imageType;


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
