package com.example.snowman.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PalletDB {
	
    @Id
    private String palletID;
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