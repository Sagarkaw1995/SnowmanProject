package com.example.snowman.dto;

import java.time.LocalDate;
import java.util.List;

import com.example.snowman.entities.ItemDB;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceDTO {
	
    private Seller seller;
    private Invoice invoice;
    private Buyer buyer;
    private List<ItemDB> items;
    
    @JsonProperty("totalValue")
    private Double totalValue;
    
    @JsonProperty("totalTaxableValue")
    private Double totalTaxableValue;
    
    @JsonProperty("totalIGST")
    private Double totalIGST;
    
    @JsonProperty("totalCGST")
    private Double totalCGST;
    
    @JsonProperty("totalSGST")
    private Double totalSGST;
    
    @JsonProperty("totalTax")
    private Double totalTax;
    
    @JsonProperty("roundOff")
    private Double roundOff;
    
    @JsonProperty("totalInvoiceValue")
    private Double totalInvoiceValue;
    
    @JsonProperty("taxAmountInWords")
    private String taxAmountInWords;
    
    @JsonProperty("amountChargeableInWords")
    private String amountChargeableInWords;
    
    @JsonProperty("declaration")
    private String declaration;
    
    @JsonProperty("irn")
    private String irn;
    
    @JsonProperty("ackNo")
    private String ackNo;
    
    @JsonProperty("ackDate")
    private LocalDate ackDate;
    
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Buyer getBuyer() {
		return buyer;
	}
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	public Double getTotalTaxableValue() {
		return totalTaxableValue;
	}
	public void setTotalTaxableValue(Double totalTaxableValue) {
		this.totalTaxableValue = totalTaxableValue;
	}
	public Double getTotalIGST() {
		return totalIGST;
	}
	public void setTotalIGST(Double totalIGST) {
		this.totalIGST = totalIGST;
	}
	public Double getTotalCGST() {
		return totalCGST;
	}
	public void setTotalCGST(Double totalCGST) {
		this.totalCGST = totalCGST;
	}
	public Double getTotalSGST() {
		return totalSGST;
	}
	public void setTotalSGST(Double totalSGST) {
		this.totalSGST = totalSGST;
	}
	public Double getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(Double totalTax) {
		this.totalTax = totalTax;
	}
	public Double getRoundOff() {
		return roundOff;
	}
	public void setRoundOff(Double roundOff) {
		this.roundOff = roundOff;
	}
	public Double getTotalInvoiceValue() {
		return totalInvoiceValue;
	}
	public void setTotalInvoiceValue(Double totalInvoiceValue) {
		this.totalInvoiceValue = totalInvoiceValue;
	}
	public String getTaxAmountInWords() {
		return taxAmountInWords;
	}
	public void setTaxAmountInWords(String taxAmountInWords) {
		this.taxAmountInWords = taxAmountInWords;
	}
	public String getAmountChargeableInWords() {
		return amountChargeableInWords;
	}
	public void setAmountChargeableInWords(String amountChargeableInWords) {
		this.amountChargeableInWords = amountChargeableInWords;
	}
	public String getDeclaration() {
		return declaration;
	}
	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}
	public String getIrn() {
		return irn;
	}
	public void setIrn(String irn) {
		this.irn = irn;
	}
	public String getAckNo() {
		return ackNo;
	}
	public void setAckNo(String ackNo) {
		this.ackNo = ackNo;
	}
	public LocalDate getAckDate() {
		return ackDate;
	}
	public void setAckDate(LocalDate ackDate) {
		this.ackDate = ackDate;
	}
	public List<ItemDB> getItems() {
		return items;
	}
	public void setItems(List<ItemDB> items) {
		this.items = items;
	}


	
	
	
    
   
}
