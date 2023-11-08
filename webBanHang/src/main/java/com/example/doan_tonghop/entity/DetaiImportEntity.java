package com.example.doan_tonghop.entity;

import javax.persistence.*;

@Entity
@Table(name = "DetailImport")
public class DetaiImportEntity {
    @EmbeddedId
    private Import_Product_PK id;

    @ManyToOne
    @MapsId("importId")
    @JoinColumn(name = "ImportId")
    private ImportEntity import_Id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "ProductId")
    private ProductEntity product_Id;

    @Column(name = "ProductCount")
    private Long productCount;

    @Column(name = "TotalCost ")
    private Long totalCost;

    public Import_Product_PK getId() {
        return id;
    }

    public void setId(Import_Product_PK id) {
        this.id = id;
    }

    public ImportEntity getImport_Id() {
        return import_Id;
    }

    public void setImport_Id(ImportEntity import_Id) {
        this.import_Id = import_Id;
    }

    public ProductEntity getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(ProductEntity product_Id) {
        this.product_Id = product_Id;
    }

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public Long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Long totalCost) {
        this.totalCost = totalCost;
    }
}
