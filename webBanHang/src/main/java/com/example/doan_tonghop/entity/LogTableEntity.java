package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LogTable")
public class LogTableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TargetId")
    private Long targetId;

    @Column(name = "CreatAt")
    private Date creatAt;

    @ManyToOne
    @JoinColumn(name = "CreateBy")
    private UserAccountEntity userAccount_Id;

    @Column(name = "IsDelete")
    private boolean isDelete;

    @Column(name = "DeleteBy ")
    private Long deleteBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public UserAccountEntity getUserAccount_Id() {
        return userAccount_Id;
    }

    public void setUserAccount_Id(UserAccountEntity userAccount_Id) {
        this.userAccount_Id = userAccount_Id;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Long getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(Long deleteBy) {
        this.deleteBy = deleteBy;
    }
}
