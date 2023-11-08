package com.example.doan_tonghop.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "Dicount")
public class DiscountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ProductId")
    private ProductEntity product_Id;

    @Column(name = "DiscountType")
    private Long discountType;

    @Column(name = "DiscountValue")
    private double discountValue;

    @Column(name = "Number")
    private String number;

    @Column(name = "StartAt")
    private Date startAt;

    @Column(name = "EndAt")
    private Date endAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductEntity getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(ProductEntity product_Id) {
        this.product_Id = product_Id;
    }

    public Long getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Long discountType) {
        this.discountType = discountType;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }
}
