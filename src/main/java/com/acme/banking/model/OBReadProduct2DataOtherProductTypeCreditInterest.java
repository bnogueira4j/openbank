package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about the interest that may be payable to the Account holders
 */
@ApiModel(description = "Details about the interest that may be payable to the Account holders")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-04T12:02:01.064824-03:00[America/Sao_Paulo]")
public class OBReadProduct2DataOtherProductTypeCreditInterest   {
  @JsonProperty("TierBandSet")
  
  private List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet = new ArrayList<>();

  public OBReadProduct2DataOtherProductTypeCreditInterest tierBandSet(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterest addTierBandSetItem(OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet tierBandSetItem) {
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

  /**
   * Get tierBandSet
   * @return tierBandSet
  */
  @ApiModelProperty(required = true, value = "")
  public List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeCreditInterest obReadProduct2DataOtherProductTypeCreditInterest = (OBReadProduct2DataOtherProductTypeCreditInterest) o;
    return Objects.equals(this.tierBandSet, obReadProduct2DataOtherProductTypeCreditInterest.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeCreditInterest {\n");
    
    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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

