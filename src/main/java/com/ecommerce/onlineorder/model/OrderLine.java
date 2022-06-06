package com.ecommerce.onlineorder.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class OrderLine {
	
	@NotNull
	private int itemId;
	private double price;
	private double quantity;
	private Date eta;
	@NotNull
	private Address address;
	private ItemStatus itemStatus;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public Date getEta() {
		return eta;
	}
	public void setEta(Date eta) {
		this.eta = eta;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ItemStatus getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(ItemStatus itemStatus) {
		this.itemStatus = itemStatus;
	}
	
}
