package com.example.snowman.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Seller {
	
	@JsonProperty("name")
    private String sName;
	
	@JsonProperty("address")
    private String sAddress;
	
	@JsonProperty("cin")
    private String sCin;
	
	@JsonProperty("fscNo")
    private String sFscNo;
	
	@JsonProperty("gstin")
    private String sGstin;
	
	@JsonProperty("email")
    private String sEmail;
	
    
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsCin() {
		return sCin;
	}
	public void setsCin(String sCin) {
		this.sCin = sCin;
	}
	public String getsFscNo() {
		return sFscNo;
	}
	public void setsFscNo(String sFscNo) {
		this.sFscNo = sFscNo;
	}
	public String getsGstin() {
		return sGstin;
	}
	public void setsGstin(String sGstin) {
		this.sGstin = sGstin;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
    


    
    
}
