package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadDirectDebit2Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-04T12:02:01.064824-03:00[America/Sao_Paulo]")
public class OBReadDirectDebit2Data   {
  @JsonProperty("DirectDebit")
  
  private List<OBReadDirectDebit2DataDirectDebit> directDebit = null;

  public OBReadDirectDebit2Data directDebit(List<OBReadDirectDebit2DataDirectDebit> directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  public OBReadDirectDebit2Data addDirectDebitItem(OBReadDirectDebit2DataDirectDebit directDebitItem) {
    if (this.directDebit == null) {
      this.directDebit = new ArrayList<>();
    }
    this.directDebit.add(directDebitItem);
    return this;
  }

  /**
   * Get directDebit
   * @return directDebit
  */
  @ApiModelProperty(value = "")
  public List<OBReadDirectDebit2DataDirectDebit> getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(List<OBReadDirectDebit2DataDirectDebit> directDebit) {
    this.directDebit = directDebit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit2Data obReadDirectDebit2Data = (OBReadDirectDebit2Data) o;
    return Objects.equals(this.directDebit, obReadDirectDebit2Data.directDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit2Data {\n");
    
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

