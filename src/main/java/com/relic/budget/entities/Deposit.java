package com.relic.budget.entities;

import java.math.BigDecimal;
import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "deposits")
public class Deposit {

  @javax.persistence.Id
  @javax.persistence.Column(name = "id", nullable = false, length = 16)
  private String id;

  @javax.persistence.Column(name = "status", nullable = false, length = 128)
  private String status;

  @javax.persistence.Convert(disableConversion = true)
  @javax.persistence.Column(name = "date")
  private Instant date;

  @javax.persistence.Column(name = "description", nullable = false)
  private String description;

  @javax.persistence.Column(name = "category", nullable = false, length = 64)
  private String category;

  @javax.persistence.Column(name = "amount", precision = 5, scale = 2)
  private BigDecimal amount;

  @javax.persistence.Column(name = "account", nullable = false)
  private String account;

  @javax.persistence.Column(name = "reoccurring")
  private Boolean reoccurring;

  @javax.persistence.Column(name = "reoccuring")
  private Boolean reoccuring;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Instant getDate() {
    return date;
  }

  public void setDate(Instant date) {
    this.date = date;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Boolean getReoccurring() {
    return reoccurring;
  }

  public void setReoccurring(Boolean reoccurring) {
    this.reoccurring = reoccurring;
  }

  public Boolean getReoccuring() {
    return reoccuring;
  }

  public void setReoccuring(Boolean reoccuring) {
    this.reoccuring = reoccuring;
  }

}