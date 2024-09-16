package com.example.snowman.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Buyer {
	
	@JsonProperty("name")
    private String bName;
	
	@JsonProperty("address")
    private String bAddress;
	
	@JsonProperty("pinCode")
    private String bPinCode;
	
	@JsonProperty("gstin")
    private String bGstin;
	
	@JsonProperty("stateName")
    private String bStateName;
	
	@JsonProperty("code")
    private String bCode;
    
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAddress() {
		return bAddress;
	}
	public void setbAddress(String bAddress) {
		this.bAddress = bAddress;
	}
	public String getbPinCode() {
		return bPinCode;
	}
	public void setbPinCode(String bPinCode) {
		this.bPinCode = bPinCode;
	}
	public String getbGstin() {
		return bGstin;
	}
	public void setbGstin(String bGstin) {
		this.bGstin = bGstin;
	}
	public String getbStateName() {
		return bStateName;
	}
	public void setbStateName(String bStateName) {
		this.bStateName = bStateName;
	}
	public String getbCode() {
		return bCode;
	}
	public void setbCode(String bCode) {
		this.bCode = bCode;
	}
    

    
	    
}
