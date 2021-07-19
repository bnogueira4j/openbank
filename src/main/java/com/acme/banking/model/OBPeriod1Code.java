package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Period e.g. day, week, month etc. for which the fee/charge is capped
 */
public enum OBPeriod1Code {
  
  PACT("PACT"),
  
  PDAY("PDAY"),
  
  PHYR("PHYR"),
  
  PMTH("PMTH"),
  
  PQTR("PQTR"),
  
  PWEK("PWEK"),
  
  PYER("PYER");

  private String value;

  OBPeriod1Code(String value) {
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
  public static OBPeriod1Code fromValue(String value) {
    for (OBPeriod1Code b : OBPeriod1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

