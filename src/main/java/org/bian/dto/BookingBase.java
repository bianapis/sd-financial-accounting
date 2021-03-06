package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BookingBase
 */
public class BookingBase   {
  private String bookingPurpose = null;

  private Object bookingAmount = null;

  private String bookingValueDate = null;

  private Object bookingResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return bookingPurpose
  **/

  public String getBookingPurpose() {
    return bookingPurpose;
  }

  public void setBookingPurpose(String bookingPurpose) {
    this.bookingPurpose = bookingPurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount general-info: credit/debit pair 
   * @return bookingAmount
  **/

  public Object getBookingAmount() {
    return bookingAmount;
  }

  public void setBookingAmount(Object bookingAmount) {
    this.bookingAmount = bookingAmount;
  }


  /**
   * Get bookingValueDate
   * @return bookingValueDate
  **/

  public String getBookingValueDate() {
    return bookingValueDate;
  }

  public void setBookingValueDate(String bookingValueDate) {
    this.bookingValueDate = bookingValueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator 
   * @return bookingResult
  **/

  public Object getBookingResult() {
    return bookingResult;
  }

  public void setBookingResult(Object bookingResult) {
    this.bookingResult = bookingResult;
  }


}

