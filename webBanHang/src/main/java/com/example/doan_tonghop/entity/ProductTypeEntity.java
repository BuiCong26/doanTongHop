package com.example.doan_tonghop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ProductType")
public class ProductTypeEntity extends BaseEntity {
    @Column(name = "NameOfType")
    private String nameOfType;

    @Column(name = "CreatBy")
    private Long createBy;

    @OneToMany(mappedBy = "productType_Id")
    private List<ProductEntity> productEntities = new ArrayList<>();

    public String getNameOfType() {
        return nameOfType;
    }

    public void setNameOfType(String nameOfType) {
        this.nameOfType = nameOfType;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }
}
