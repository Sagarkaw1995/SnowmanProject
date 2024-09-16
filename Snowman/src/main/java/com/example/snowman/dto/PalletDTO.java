package com.example.snowman.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PalletDTO {
	
	@JsonProperty("palletID")
    private String palletID;
	
	@JsonProperty("coordinatesXYZ")
    private int coordinatesXYZ;
	
	@JsonProperty("maxWeight")
    private int maxWeight;
    
	public String getPalletID() {
		return palletID;
	}
	public void setPalletID(String palletID) {
		this.palletID = palletID;
	}
	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
}
