package com.example.snowman.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Invoice {
	
	@JsonProperty("invoiceNo")
    private String invoiceNumber;
	
	@JsonProperty("date")
    private LocalDate iDate;
	
	@JsonProperty("eWayBillNo")
    private String iEWayBillNo;
	
	@JsonProperty("modeTermsOfPayment")
    private String iModeTermsOfPayment;
	
	@JsonProperty("buyersOrderNo")
    private String iBuyersOrderNo;
	
	@JsonProperty("buyersOrderDate")
    private LocalDate iBuyersOrderDate;
	
	@JsonProperty("despatchDocumentNo")
    private String iDespatchDocumentNo;
	
	@JsonProperty("deliveryNoteDate")
    private LocalDateTime iDeliveryNoteDate;
	
	@JsonProperty("despatchedThrough")
    private String iDespatchedThrough;
	
	@JsonProperty("destination")
    private String iDestination;
	
	@JsonProperty("billOfLadingNo")
    private String iDillOfLadingNo;
	
	@JsonProperty("motorVehicleNo")
    private String iMotorVehicleNo;
	
	@JsonProperty("termsOfDelivery")
    private String iTermsOfDelivery;
    
	public String getinvoiceNumber() {
		return invoiceNumber;
	}
	public void setinvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public LocalDate getiDate() {
		return iDate;
	}
	public void setiDate(LocalDate iDate) {
		this.iDate = iDate;
	}
	public String getiEWayBillNo() {
		return iEWayBillNo;
	}
	public void setiEWayBillNo(String iEWayBillNo) {
		this.iEWayBillNo = iEWayBillNo;
	}
	public String getiModeTermsOfPayment() {
		return iModeTermsOfPayment;
	}
	public void setiModeTermsOfPayment(String iModeTermsOfPayment) {
		this.iModeTermsOfPayment = iModeTermsOfPayment;
	}
	public String getiBuyersOrderNo() {
		return iBuyersOrderNo;
	}
	public void setiBuyersOrderNo(String iBuyersOrderNo) {
		this.iBuyersOrderNo = iBuyersOrderNo;
	}
	public LocalDate getiBuyersOrderDate() {
		return iBuyersOrderDate;
	}
	public void setiBuyersOrderDate(LocalDate iBuyersOrderDate) {
		this.iBuyersOrderDate = iBuyersOrderDate;
	}
	public String getiDespatchDocumentNo() {
		return iDespatchDocumentNo;
	}
	public void setiDespatchDocumentNo(String iDespatchDocumentNo) {
		this.iDespatchDocumentNo = iDespatchDocumentNo;
	}
	public LocalDateTime getiDeliveryNoteDate() {
		return iDeliveryNoteDate;
	}
	public void setiDeliveryNoteDate(LocalDateTime iDeliveryNoteDate) {
		this.iDeliveryNoteDate = iDeliveryNoteDate;
	}
	public String getiDespatchedThrough() {
		return iDespatchedThrough;
	}
	public void setiDespatchedThrough(String iDespatchedThrough) {
		this.iDespatchedThrough = iDespatchedThrough;
	}
	public String getiDestination() {
		return iDestination;
	}
	public void setiDestination(String iDestination) {
		this.iDestination = iDestination;
	}
	public String getiDillOfLadingNo() {
		return iDillOfLadingNo;
	}
	public void setiDillOfLadingNo(String iDillOfLadingNo) {
		this.iDillOfLadingNo = iDillOfLadingNo;
	}
	public String getiMotorVehicleNo() {
		return iMotorVehicleNo;
	}
	public void setiMotorVehicleNo(String iMotorVehicleNo) {
		this.iMotorVehicleNo = iMotorVehicleNo;
	}
	public String getiTermsOfDelivery() {
		return iTermsOfDelivery;
	}
	public void setiTermsOfDelivery(String iTermsOfDelivery) {
		this.iTermsOfDelivery = iTermsOfDelivery;
	}
    
}
