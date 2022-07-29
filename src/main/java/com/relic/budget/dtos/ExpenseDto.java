package com.relic.budget.dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class ExpenseDto implements Serializable {

  private final String id;
  private final String status;
  private final Instant date;
  private final String description;
  private final String category;
  private final BigDecimal amount;
  private final String account;
  private final Boolean reoccurring;
  private final Boolean reoccuring;

  public ExpenseDto(String id, String status, Instant date, String description, String category,
      BigDecimal amount, String account, Boolean reoccurring, Boolean reoccuring) {
    this.id = id;
    this.status = status;
    this.date = date;
    this.description = description;
    this.category = category;
    this.amount = amount;
    this.account = account;
    this.reoccurring = reoccurring;
    this.reoccuring = reoccuring;
  }

  public String getId() {
    return id;
  }

  public String getStatus() {
    return status;
  }

  public Instant getDate() {
    return date;
  }

  public String getDescription() {
    return description;
  }

  public String getCategory() {
    return category;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public String getAccount() {
    return account;
  }

  public Boolean getReoccurring() {
    return reoccurring;
  }

  public Boolean getReoccuring() {
    return reoccuring;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseDto entity = (ExpenseDto) o;
    return Objects.equals(this.id, entity.id) &&
        Objects.equals(this.status, entity.status) &&
        Objects.equals(this.date, entity.date) &&
        Objects.equals(this.description, entity.description) &&
        Objects.equals(this.category, entity.category) &&
        Objects.equals(this.amount, entity.amount) &&
        Objects.equals(this.account, entity.account) &&
        Objects.equals(this.reoccurring, entity.reoccurring) &&
        Objects.equals(this.reoccuring, entity.reoccuring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, date, description, category, amount, account, reoccurring,
        reoccuring);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "(" +
        "id = " + id + ", " +
        "status = " + status + ", " +
        "date = " + date + ", " +
        "description = " + description + ", " +
        "category = " + category + ", " +
        "amount = " + amount + ", " +
        "account = " + account + ", " +
        "reoccurring = " + reoccurring + ", " +
        "reoccuring = " + reoccuring + ")";
  }
}
