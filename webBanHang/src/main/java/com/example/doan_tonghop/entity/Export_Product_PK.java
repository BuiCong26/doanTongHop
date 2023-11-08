package com.example.doan_tonghop.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Export_Product_PK implements Serializable {
    private Long productId;
    private Long exportId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getExportId() {
        return exportId;
    }

    public void setExportId(Long exportId) {
        this.exportId = exportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Export_Product_PK)) return false;
        Export_Product_PK that = (Export_Product_PK) o;
        return Objects.equals(getProductId(), that.getProductId()) && Objects.equals(getExportId(), that.getExportId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getExportId());
    }
}
