package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")
public class ProductEntity extends BaseEntity {
    @Column(name = "ProductName")
    private String productName;

    @ManyToOne()
    @JoinColumn(name = "ProductTypeId")
    private ProductTypeEntity productType_Id;

    @Column(name = "ProductCount")
    private Long productCount;

    @Column(name = "Cost")
    private Long cost;

    @Column(name = "CreatBy")
    private Long createBy;

    @OneToMany(mappedBy = "product_Id")
    private List<DetaiImportEntity> detaiImportEntities = new ArrayList<>();

    @OneToMany(mappedBy = "product_Id")
    private List<DetailExportEntity> detailExportEntities = new ArrayList<>();

    @OneToMany(mappedBy = "product_Id")
    private List<DiscountEntity> discountEntities = new ArrayList<>();

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductTypeEntity getProductType_Id() {
        return productType_Id;
    }

    public void setProductType_Id(ProductTypeEntity productType_Id) {
        this.productType_Id = productType_Id;
    }

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public List<DetaiImportEntity> getDetaiImportEntities() {
        return detaiImportEntities;
    }

    public void setDetaiImportEntities(List<DetaiImportEntity> detaiImportEntities) {
        this.detaiImportEntities = detaiImportEntities;
    }

    public List<DetailExportEntity> getDetailExportEntities() {
        return detailExportEntities;
    }

    public void setDetailExportEntities(List<DetailExportEntity> detailExportEntities) {
        this.detailExportEntities = detailExportEntities;
    }

    public List<DiscountEntity> getDiscountEntities() {
        return discountEntities;
    }

    public void setDiscountEntities(List<DiscountEntity> discountEntities) {
        this.discountEntities = discountEntities;
    }
}
