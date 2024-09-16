package com.example.snowman.dto;

public class GoodReceiptNote {
	
    private String invoiceNumber;
    private String descriptionOfGoods;
    private int invoicedQuantity;
    private int actualQuantity;
    private String netQuantity;
    
    
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getDescriptionOfGoods() {
		return descriptionOfGoods;
	}
	public void setDescriptionOfGoods(String descriptionOfGoods) {
		this.descriptionOfGoods = descriptionOfGoods;
	}
	public int getInvoicedQuantity() {
		return invoicedQuantity;
	}
	public void setInvoicedQuantity(int invoicedQuantity) {
		this.invoicedQuantity = invoicedQuantity;
	}
	public int getActualQuantity() {
		return actualQuantity;
	}
	public void setActualQuantity(int actualQuantity) {
		this.actualQuantity = actualQuantity;
	}
	public String getNetQuantity() {
		return netQuantity;
	}
	public void setNetQuantity(String netQuantity) {
		this.netQuantity = netQuantity;
	}
    
    
    
}
