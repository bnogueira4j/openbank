package com.acme.banking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OBStandingOrder6Basic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-04T12:02:01.064824-03:00[America/Sao_Paulo]")
public class OBStandingOrder6Basic   {
  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("StandingOrderId")
  private String standingOrderId;

  @JsonProperty("Frequency")
  private String frequency;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("FirstPaymentDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime firstPaymentDateTime;

  @JsonProperty("NextPaymentDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime nextPaymentDateTime;

  @JsonProperty("LastPaymentDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastPaymentDateTime;

  @JsonProperty("FinalPaymentDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime finalPaymentDateTime;

  @JsonProperty("NumberOfPayments")
  private String numberOfPayments;

  @JsonProperty("StandingOrderStatusCode")
  private OBExternalStandingOrderStatus1Code standingOrderStatusCode;

  @JsonProperty("FirstPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount;

  @JsonProperty("NextPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount;

  @JsonProperty("LastPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount;

  @JsonProperty("FinalPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount;

  @JsonProperty("SupplementaryData")
  
  private Map<String, Object> supplementaryData = null;

  public OBStandingOrder6Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBStandingOrder6Basic standingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.
   * @return standingOrderId
  */
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.")
  public String getStandingOrderId() {
    return standingOrderId;
  }

  public void setStandingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
  }

  public OBStandingOrder6Basic frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Individual Definitions: NotKnown - Not Known EvryDay - Every day EvryWorkgDay - Every working day IntrvlDay - An interval specified in number of calendar days (02 to 31) IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-05 to -01, 01 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED) ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December. SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December. Individual Patterns: NotKnown (ScheduleCode) EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlDay:NoOfDay (ScheduleCode + NoOfDay) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: NotKnown EvryDay EvryWorkgDay IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]) IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(NotKnown)$|^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
   * @return frequency
  */
  @ApiModelProperty(required = true, value = "Individual Definitions: NotKnown - Not Known EvryDay - Every day EvryWorkgDay - Every working day IntrvlDay - An interval specified in number of calendar days (02 to 31) IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-05 to -01, 01 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED) ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December. SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December. Individual Patterns: NotKnown (ScheduleCode) EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlDay:NoOfDay (ScheduleCode + NoOfDay) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: NotKnown EvryDay EvryWorkgDay IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]) IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(NotKnown)$|^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBStandingOrder6Basic reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
  */
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBStandingOrder6Basic firstPaymentDateTime(OffsetDateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

  /**
   * The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return firstPaymentDateTime
  */
  @ApiModelProperty(value = "The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  public OffsetDateTime getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(OffsetDateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public OBStandingOrder6Basic nextPaymentDateTime(OffsetDateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
    return this;
  }

  /**
   * The date on which the next payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return nextPaymentDateTime
  */
  @ApiModelProperty(value = "The date on which the next payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  public OffsetDateTime getNextPaymentDateTime() {
    return nextPaymentDateTime;
  }

  public void setNextPaymentDateTime(OffsetDateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
  }

  public OBStandingOrder6Basic lastPaymentDateTime(OffsetDateTime lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
    return this;
  }

  /**
   * The date on which the last (most recent) payment for a Standing Order schedule was made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return lastPaymentDateTime
  */
  @ApiModelProperty(value = "The date on which the last (most recent) payment for a Standing Order schedule was made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  public OffsetDateTime getLastPaymentDateTime() {
    return lastPaymentDateTime;
  }

  public void setLastPaymentDateTime(OffsetDateTime lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
  }

  public OBStandingOrder6Basic finalPaymentDateTime(OffsetDateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

  /**
   * The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return finalPaymentDateTime
  */
  @ApiModelProperty(value = "The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  public OffsetDateTime getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  public void setFinalPaymentDateTime(OffsetDateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public OBStandingOrder6Basic numberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
   * @return numberOfPayments
  */
  @ApiModelProperty(value = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.")
  public String getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public OBStandingOrder6Basic standingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
    return this;
  }

  /**
   * Get standingOrderStatusCode
   * @return standingOrderStatusCode
  */
  @ApiModelProperty(value = "")
  public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
    return standingOrderStatusCode;
  }

  public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
  }

  public OBStandingOrder6Basic firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
    return this;
  }

  /**
   * Get firstPaymentAmount
   * @return firstPaymentAmount
  */
  @ApiModelProperty(value = "")
  public OBActiveOrHistoricCurrencyAndAmount2 getFirstPaymentAmount() {
    return firstPaymentAmount;
  }

  public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
  }

  public OBStandingOrder6Basic nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

  /**
   * Get nextPaymentAmount
   * @return nextPaymentAmount
  */
  @ApiModelProperty(value = "")
  public OBActiveOrHistoricCurrencyAndAmount3 getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public OBStandingOrder6Basic lastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

  /**
   * Get lastPaymentAmount
   * @return lastPaymentAmount
  */
  @ApiModelProperty(value = "")
  public OBActiveOrHistoricCurrencyAndAmount11 getLastPaymentAmount() {
    return lastPaymentAmount;
  }

  public void setLastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }

  public OBStandingOrder6Basic finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
    return this;
  }

  /**
   * Get finalPaymentAmount
   * @return finalPaymentAmount
  */
  @ApiModelProperty(value = "")
  public OBActiveOrHistoricCurrencyAndAmount4 getFinalPaymentAmount() {
    return finalPaymentAmount;
  }

  public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
  }

  public OBStandingOrder6Basic supplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBStandingOrder6Basic putSupplementaryDataItem(String key, Object supplementaryDataItem) {
    if (this.supplementaryData == null) {
      this.supplementaryData = new HashMap<>();
    }
    this.supplementaryData.put(key, supplementaryDataItem);
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   * @return supplementaryData
  */
  @ApiModelProperty(value = "Additional information that can not be captured in the structured fields and/or any other specific block.")
  public Map<String, Object> getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStandingOrder6Basic obStandingOrder6Basic = (OBStandingOrder6Basic) o;
    return Objects.equals(this.accountId, obStandingOrder6Basic.accountId) &&
        Objects.equals(this.standingOrderId, obStandingOrder6Basic.standingOrderId) &&
        Objects.equals(this.frequency, obStandingOrder6Basic.frequency) &&
        Objects.equals(this.reference, obStandingOrder6Basic.reference) &&
        Objects.equals(this.firstPaymentDateTime, obStandingOrder6Basic.firstPaymentDateTime) &&
        Objects.equals(this.nextPaymentDateTime, obStandingOrder6Basic.nextPaymentDateTime) &&
        Objects.equals(this.lastPaymentDateTime, obStandingOrder6Basic.lastPaymentDateTime) &&
        Objects.equals(this.finalPaymentDateTime, obStandingOrder6Basic.finalPaymentDateTime) &&
        Objects.equals(this.numberOfPayments, obStandingOrder6Basic.numberOfPayments) &&
        Objects.equals(this.standingOrderStatusCode, obStandingOrder6Basic.standingOrderStatusCode) &&
        Objects.equals(this.firstPaymentAmount, obStandingOrder6Basic.firstPaymentAmount) &&
        Objects.equals(this.nextPaymentAmount, obStandingOrder6Basic.nextPaymentAmount) &&
        Objects.equals(this.lastPaymentAmount, obStandingOrder6Basic.lastPaymentAmount) &&
        Objects.equals(this.finalPaymentAmount, obStandingOrder6Basic.finalPaymentAmount) &&
        Objects.equals(this.supplementaryData, obStandingOrder6Basic.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, standingOrderId, frequency, reference, firstPaymentDateTime, nextPaymentDateTime, lastPaymentDateTime, finalPaymentDateTime, numberOfPayments, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, lastPaymentAmount, finalPaymentAmount, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStandingOrder6Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
    sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
    sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

