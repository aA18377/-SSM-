package com.sample;


import java.io.Serializable;

public class SmbmsAddress implements Serializable {

  private long id;
  private String contact;
  private String addressDesc;
  private String postCode;
  private String tel;
  private long createdBy;
  private java.sql.Timestamp creationDate;
  private long modifyBy;
  private java.sql.Timestamp modifyDate;
  private long userId;

  @Override
  public String toString() {
    return "SmbmsAddress{" +
            "id=" + id +
            ", contact='" + contact + '\'' +
            ", addressDesc='" + addressDesc + '\'' +
            ", postCode='" + postCode + '\'' +
            ", tel='" + tel + '\'' +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            ", userId=" + userId +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public String getAddressDesc() {
    return addressDesc;
  }

  public void setAddressDesc(String addressDesc) {
    this.addressDesc = addressDesc;
  }


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(long modifyBy) {
    this.modifyBy = modifyBy;
  }


  public java.sql.Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
