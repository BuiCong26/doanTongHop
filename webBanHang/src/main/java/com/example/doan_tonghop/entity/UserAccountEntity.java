package com.example.doan_tonghop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "UserAccount")
public class UserAccountEntity extends BaseEntity {
    @Column(name = "UserName")
    private String userName;

    @Column(name = "Code")
    private String code;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Number")
    private String number;

    @Column(name = "Mail")
    private String mail;

    @Column(name = "UserRole")
    private Long userRole;

    @OneToMany(mappedBy = "userAccount_Id")
    private List<ImportEntity> importEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userAccount_Id")
    private List<ProductItemEntity> productItemEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userAccount_Id")
    private List<LogTableEntity> logTableEntities = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getUserRole() {
        return userRole;
    }

    public void setUserRole(Long userRole) {
        this.userRole = userRole;
    }

    public List<ImportEntity> getImportEntities() {
        return importEntities;
    }

    public void setImportEntities(List<ImportEntity> importEntities) {
        this.importEntities = importEntities;
    }

    public List<ProductItemEntity> getProductItemEntities() {
        return productItemEntities;
    }

    public void setProductItemEntities(List<ProductItemEntity> productItemEntities) {
        this.productItemEntities = productItemEntities;
    }

    public List<LogTableEntity> getLogTableEntities() {
        return logTableEntities;
    }

    public void setLogTableEntities(List<LogTableEntity> logTableEntities) {
        this.logTableEntities = logTableEntities;
    }
}
