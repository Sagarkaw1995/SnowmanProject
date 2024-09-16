package com.example.snowman.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GoodReceiptNoteDB {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String invoiceNumber;
    private String descriptionOfGoods;
    private int invoicedQuantity;
    private int actualQuantity;
    private String netQuantity;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
