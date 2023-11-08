package com.example.doan_tonghop.entity;

import javax.persistence.*;

@Entity
@Table(name = "DetailExport")
public class DetailExportEntity {
    @EmbeddedId
    private Export_Product_PK id;

    @ManyToOne
    @MapsId("exportId")
    @JoinColumn(name = "exportId")
    private ExportEntity export_Id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "ProductId")
    private ProductEntity product_Id;

    @Column(name = "ProductCount")
    private Long productCount;

    @Column(name = "TotalCost ")
    private Long totalCost;

    public Export_Product_PK getId() {
        return id;
    }

    public void setId(Export_Product_PK id) {
        this.id = id;
    }

    public ExportEntity getExport_Id() {
        return export_Id;
    }

    public void setExport_Id(ExportEntity export_Id) {
        this.export_Id = export_Id;
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
