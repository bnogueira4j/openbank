package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadBeneficiary5Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-04T12:02:01.064824-03:00[America/Sao_Paulo]")
public class OBReadBeneficiary5Data   {
  @JsonProperty("Beneficiary")
  
  private List<OBBeneficiary5> beneficiary = null;

  public OBReadBeneficiary5Data beneficiary(List<OBBeneficiary5> beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  public OBReadBeneficiary5Data addBeneficiaryItem(OBBeneficiary5 beneficiaryItem) {
    if (this.beneficiary == null) {
      this.beneficiary = new ArrayList<>();
    }
    this.beneficiary.add(beneficiaryItem);
    return this;
  }

  /**
   * Get beneficiary
   * @return beneficiary
  */
  @ApiModelProperty(value = "")
  public List<OBBeneficiary5> getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(List<OBBeneficiary5> beneficiary) {
    this.beneficiary = beneficiary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBeneficiary5Data obReadBeneficiary5Data = (OBReadBeneficiary5Data) o;
    return Objects.equals(this.beneficiary, obReadBeneficiary5Data.beneficiary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBeneficiary5Data {\n");
    
    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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

