package com.example.doan_tonghop.entity;

import lombok.Data;


import java.io.Serializable;
import java.util.Objects;

@Data
public class Image_PK implements Serializable {
    private Long parentId;
    private Long orderBy;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Image_PK)) return false;
        Image_PK image_pk = (Image_PK) o;
        return Objects.equals(getParentId(), image_pk.getParentId()) && Objects.equals(getOrderBy(), image_pk.getOrderBy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getParentId(), getOrderBy());
    }
}
