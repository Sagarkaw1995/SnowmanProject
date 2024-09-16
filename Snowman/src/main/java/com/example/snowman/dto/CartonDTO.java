package com.example.snowman.dto;

import java.time.LocalDate;

public class CartonDTO {
	
    private String descriptionOfGoods;
    private String batchNo;
    private LocalDate mfgDate;
    private LocalDate expiryDate;
    private double weight;
    private int temperature;
    private boolean rejected;
    
    
	public String getDescriptionOfGoods() {
		return descriptionOfGoods;
	}
	public void setDescriptionOfGoods(String descriptionOfGoods) {
		this.descriptionOfGoods = descriptionOfGoods;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public LocalDate getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public boolean isRejected() {
		return rejected;
	}
	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}
    
}
