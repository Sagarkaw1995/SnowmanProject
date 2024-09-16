package com.example.snowman.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int srNo;
    private String descriptionOfGoods;
    private int quantityInNo;
    private int quantityInCase;
    private String hsnSac;
    private String taxRate;
    private double rate;
    private String uom;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "invoiceNumber")
    private InvoiceDB invoiceDB;

    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getDescriptionOfGoods() {
		return descriptionOfGoods;
	}

	public void setDescriptionOfGoods(String descriptionOfGoods) {
		this.descriptionOfGoods = descriptionOfGoods;
	}

	public int getQuantityInNo() {
		return quantityInNo;
	}

	public void setQuantityInNo(int quantityInNo) {
		this.quantityInNo = quantityInNo;
	}

	public int getQuantityInCase() {
		return quantityInCase;
	}

	public void setQuantityInCase(int quantityInCase) {
		this.quantityInCase = quantityInCase;
	}

	public String getHsnSac() {
		return hsnSac;
	}

	public void setHsnSac(String hsnSac) {
		this.hsnSac = hsnSac;
	}

	public String getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public InvoiceDB getInvoiceDB() {
		return invoiceDB;
	}

	public void setInvoiceDB(InvoiceDB invoiceDB) {
		this.invoiceDB = invoiceDB;
	}
    
}
