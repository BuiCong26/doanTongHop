package com.example.doan_tonghop.dto;

public class ProductDTO extends BaseDTO<ProductDTO> {
    private String productName;
    private Long productTypeId;
    private Long productCount;
    private Long cost;
    private Long creatBy;

    public ProductDTO(String productName, Long productTypeId, Long productCount, Long cost, Long creatBy) {
        this.productName = productName;
        this.productTypeId = productTypeId;
        this.productCount = productCount;
        this.cost = cost;
        this.creatBy = creatBy;
    }
    public  ProductDTO()
    {}

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
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

    public Long getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(Long creatBy) {
        this.creatBy = creatBy;
    }
}
