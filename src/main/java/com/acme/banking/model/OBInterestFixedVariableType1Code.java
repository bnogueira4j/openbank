package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of interest rate, Fixed or Variable
 */
public enum OBInterestFixedVariableType1Code {
  
  INFI("INFI"),
  
  INVA("INVA");

  private String value;

  OBInterestFixedVariableType1Code(String value) {
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
  public static OBInterestFixedVariableType1Code fromValue(String value) {
    for (OBInterestFixedVariableType1Code b : OBInterestFixedVariableType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

