package com.morning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PRODUCT_DETAILS")

public class ProductDetails {
	@Id
	@GenericGenerator(name = "myGenerator", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "myGenerator")
	@Column(name = "PDID")
	private int pdid;
	@Column(name = "PDQUALITY")
	private String quality;
	@Column(name = "QUANTITY")
	private int quantity;

	@Override
	public String toString() {
		return "ProductDetails [pdid=" + pdid + ", quality=" + quality + ", quantity=" + quantity + "]";
	}

	public int getPdid() {
		return pdid;
	}
	public void setPdid(int pdid) {
		this.pdid = pdid;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
