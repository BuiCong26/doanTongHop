package com.example.doan_tonghop.entity;

import javax.persistence.*;

@Entity
@Table(name = "ProductItem")
public class ProductItemEntity extends BaseEntity {
    @Column(name = "ProductNameId")
    private Long productNameId;

    @Column(name = "BarCode")
    private Long barCode;

    @Column(name = "DiscountId")
    private Long discountId;

    @ManyToOne
    @JoinColumn(name = "ImportId")
    private ImportEntity import_Id;

    @ManyToOne
    @JoinColumn(name = "ExportId")
    private ExportEntity export_Id;

    @Column(name = "StatusId")
    private Long statusId;

    @ManyToOne
    @JoinColumn(name = "CreateBy")
    private UserAccountEntity userAccount_Id;

    public Long getProductNameId() {
        return productNameId;
    }

    public void setProductNameId(Long productNameId) {
        this.productNameId = productNameId;
    }

    public Long getBarCode() {
        return barCode;
    }

    public void setBarCode(Long barCode) {
        this.barCode = barCode;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public ImportEntity getImport_Id() {
        return import_Id;
    }

    public void setImport_Id(ImportEntity import_Id) {
        this.import_Id = import_Id;
    }

    public ExportEntity getExport_Id() {
        return export_Id;
    }

    public void setExport_Id(ExportEntity export_Id) {
        this.export_Id = export_Id;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public UserAccountEntity getUserAccount_Id() {
        return userAccount_Id;
    }

    public void setUserAccount_Id(UserAccountEntity userAccount_Id) {
        this.userAccount_Id = userAccount_Id;
    }
}
