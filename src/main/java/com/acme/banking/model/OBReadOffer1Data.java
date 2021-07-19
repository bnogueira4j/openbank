package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadOffer1Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-04T12:02:01.064824-03:00[America/Sao_Paulo]")
public class OBReadOffer1Data   {
  @JsonProperty("Offer")
  
  private List<OBReadOffer1DataOffer> offer = null;

  public OBReadOffer1Data offer(List<OBReadOffer1DataOffer> offer) {
    this.offer = offer;
    return this;
  }

  public OBReadOffer1Data addOfferItem(OBReadOffer1DataOffer offerItem) {
    if (this.offer == null) {
      this.offer = new ArrayList<>();
    }
    this.offer.add(offerItem);
    return this;
  }

  /**
   * Get offer
   * @return offer
  */
  @ApiModelProperty(value = "")
  public List<OBReadOffer1DataOffer> getOffer() {
    return offer;
  }

  public void setOffer(List<OBReadOffer1DataOffer> offer) {
    this.offer = offer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadOffer1Data obReadOffer1Data = (OBReadOffer1Data) o;
    return Objects.equals(this.offer, obReadOffer1Data.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadOffer1Data {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

