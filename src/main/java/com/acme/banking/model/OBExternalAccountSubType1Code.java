package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the sub type of account (product family group).
 */
public enum OBExternalAccountSubType1Code {
  
  CHARGECARD("ChargeCard"),
  
  CREDITCARD("CreditCard"),
  
  CURRENTACCOUNT("CurrentAccount"),
  
  EMONEY("EMoney"),
  
  LOAN("Loan"),
  
  MORTGAGE("Mortgage"),
  
  PREPAIDCARD("PrePaidCard"),
  
  SAVINGS("Savings");

  private String value;

  OBExternalAccountSubType1Code(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalAccountSubType1Code fromValue(String value) {
    for (OBExternalAccountSubType1Code b : OBExternalAccountSubType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

