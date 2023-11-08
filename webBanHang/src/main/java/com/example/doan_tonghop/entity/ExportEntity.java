package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Export")
public class ExportEntity extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "OwnerId")
    private GuestAccountEntity guestAccount_Id;

    @Column(name = "StatusId")
    private Long statusId;

    @Column(name = "CreateBy")
    private Long createBy;

    @OneToMany(mappedBy = "export_Id")
    private List<ProductItemEntity> productItemEntities = new ArrayList<>();

    @OneToMany(mappedBy = "export_Id")
    private List<DetailExportEntity> detailExportEntities = new ArrayList<>();

    public GuestAccountEntity getGuestAccount_Id() {
        return guestAccount_Id;
    }

    public void setGuestAccount_Id(GuestAccountEntity guestAccount_Id) {
        this.guestAccount_Id = guestAccount_Id;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public List<ProductItemEntity> getProductItemEntities() {
        return productItemEntities;
    }

    public void setProductItemEntities(List<ProductItemEntity> productItemEntities) {
        this.productItemEntities = productItemEntities;
    }

    public List<DetailExportEntity> getDetailExportEntities() {
        return detailExportEntities;
    }

    public void setDetailExportEntities(List<DetailExportEntity> detailExportEntities) {
        this.detailExportEntities = detailExportEntities;
    }
}
