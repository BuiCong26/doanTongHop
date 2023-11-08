package com.example.doan_tonghop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GuestAccount")
public class GuestAccountEntity extends BaseEntity {
    @Column(name = "Number")
    private String number;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "Mail")
    private String mail;

    @Column(name = "ReceiveAddress")
    private String receiveAddress;

    @OneToMany(mappedBy = "guestAccount_Id")
    private List<ExportEntity> exportEntities = new ArrayList<>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public List<ExportEntity> getExportEntities() {
        return exportEntities;
    }

    public void setExportEntities(List<ExportEntity> exportEntities) {
        this.exportEntities = exportEntities;
    }
}
