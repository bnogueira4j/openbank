package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBBCAData1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-04T12:02:01.064824-03:00[America/Sao_Paulo]")
public class OBBCAData1   {
  @JsonProperty("ProductDetails")
  private ProductDetails productDetails;

  @JsonProperty("CreditInterest")
  private CreditInterest creditInterest;

  @JsonProperty("Overdraft")
  private Overdraft overdraft;

  @JsonProperty("OtherFeesCharges")
  
  private List<OBBCAData1OtherFeesCharges> otherFeesCharges = null;

  public OBBCAData1 productDetails(ProductDetails productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")
  public ProductDetails getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails productDetails) {
    this.productDetails = productDetails;
  }

  public OBBCAData1 creditInterest(CreditInterest creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
  */
  @ApiModelProperty(value = "")
  public CreditInterest getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest creditInterest) {
    this.creditInterest = creditInterest;
  }

  public OBBCAData1 overdraft(Overdraft overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
  */
  @ApiModelProperty(value = "")
  public Overdraft getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft overdraft) {
    this.overdraft = overdraft;
  }

  public OBBCAData1 otherFeesCharges(List<OBBCAData1OtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public OBBCAData1 addOtherFeesChargesItem(OBBCAData1OtherFeesCharges otherFeesChargesItem) {
    if (this.otherFeesCharges == null) {
      this.otherFeesCharges = new ArrayList<>();
    }
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

  /**
   * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
   * @return otherFeesCharges
  */
  @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
  public List<OBBCAData1OtherFeesCharges> getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(List<OBBCAData1OtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBCAData1 obBCAData1 = (OBBCAData1) o;
    return Objects.equals(this.productDetails, obBCAData1.productDetails) &&
        Objects.equals(this.creditInterest, obBCAData1.creditInterest) &&
        Objects.equals(this.overdraft, obBCAData1.overdraft) &&
        Objects.equals(this.otherFeesCharges, obBCAData1.otherFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBCAData1 {\n");
    
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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
