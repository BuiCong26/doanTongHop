package com.example.doan_tonghop.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Import_Product_PK implements Serializable {
    private Long productId;
    private Long importId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getImportId() {
        return importId;
    }

    public void setImportId(Long importId) {
        this.importId = importId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Import_Product_PK)) return false;
        Import_Product_PK that = (Import_Product_PK) o;
        return Objects.equals(getProductId(), that.getProductId()) && Objects.equals(getImportId(), that.getImportId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getImportId());
    }
}
