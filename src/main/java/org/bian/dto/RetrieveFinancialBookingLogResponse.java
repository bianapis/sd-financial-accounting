package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveFinancialBookingLogResponse
 */
public class RetrieveFinancialBookingLogResponse   {
  private String subledgerReference = null;

  private String subledgerType = null;

  private String productInstanceReference = null;

  private String businessUnitReference = null;

  private String baseCurrency = null;

  private Object chartOfAccountBookingRules = null;

  private String status = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the reference ID to this Financial Booking Log 
   * @return subledgerReference
  **/

  public String getSubledgerReference() {
    return subledgerReference;
  }

  public void setSubledgerReference(String subledgerReference) {
    this.subledgerReference = subledgerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return subledgerType
  **/

  public String getSubledgerType() {
    return subledgerType;
  }

  public void setSubledgerType(String subledgerType) {
    this.subledgerType = subledgerType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: linked product/service reference number 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: link business unit/activity 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * Get baseCurrency
   * @return baseCurrency
  **/

  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: Chart of Account/Booking Rules 
   * @return chartOfAccountBookingRules
  **/

  public Object getChartOfAccountBookingRules() {
    return chartOfAccountBookingRules;
  }

  public void setChartOfAccountBookingRules(Object chartOfAccountBookingRules) {
    this.chartOfAccountBookingRules = chartOfAccountBookingRules;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return status
  **/

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


}

