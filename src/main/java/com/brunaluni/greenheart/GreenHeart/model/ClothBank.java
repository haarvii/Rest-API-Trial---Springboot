package com.brunaluni.greenheart.GreenHeart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ClothBank {

    @Id
    @GeneratedValue
    private Long id;
    private String bankName;
    private String bankAddress;
    private String bankPostCode;
    private String bankImage;

    private float review;

    public float getReview() {
        return review;
    }

    public void setReview(float review) {
        this.review = review;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankPostCode() {
        return bankPostCode;
    }

    public void setBankPostCode(String bankPostCode) {
        this.bankPostCode = bankPostCode;
    }

    public String getBankImage() {
        return bankImage;
    }

    public void setBankImage(String bankImage) {
        this.bankImage = bankImage;
    }
}
