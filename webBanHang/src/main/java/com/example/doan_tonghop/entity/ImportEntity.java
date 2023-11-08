package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Import")
public class ImportEntity extends BaseEntity {
    @Column(name = "OwnerId")
    private Long ownerId;

    @Column(name = "StatusId")
    private Long statusId;

    @ManyToOne
    @JoinColumn(name = "CreateBy")
    private UserAccountEntity userAccount_Id;

    @OneToMany(mappedBy = "import_Id")
    private List<ProductItemEntity> productItemEntities = new ArrayList<>();

    @OneToMany(mappedBy = "import_Id")
    private List<DetaiImportEntity> detaiImportEntities = new ArrayList<>();

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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

    public List<ProductItemEntity> getProductItemEntities() {
        return productItemEntities;
    }

    public void setProductItemEntities(List<ProductItemEntity> productItemEntities) {
        this.productItemEntities = productItemEntities;
    }

    public List<DetaiImportEntity> getDetaiImportEntities() {
        return detaiImportEntities;
    }

    public void setDetaiImportEntities(List<DetaiImportEntity> detaiImportEntities) {
        this.detaiImportEntities = detaiImportEntities;
    }
}
