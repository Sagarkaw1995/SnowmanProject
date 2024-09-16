package com.example.snowman.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartonRequest {
	
	@JsonProperty("invoiceNo")
	private String invoiceNumber;
	
	@JsonProperty("palletID")
    private String palletID;
	
	@JsonProperty("cartons")
    private List<CartonDTO> cartons;
    
    
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getPalletID() {
		return palletID;
	}
	public void setPalletID(String palletID) {
		this.palletID = palletID;
	}
	public List<CartonDTO> getCartons() {
		return cartons;
	}
	public void setCartons(List<CartonDTO> cartons) {
		this.cartons = cartons;
	}
    
    
}
