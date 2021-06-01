package com.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contact {

	@Id
	private int id;
	
	private int numberProduct;
	@ManyToOne
	@JoinColumn(name = "productID")
	private Product product;
	
	private Boolean status;
	@Column(name = "startDate", columnDefinition = "DATETIME")
	private Date startDate;
	private String userName;
	private String phoneNumber;
	private String address;
	@ManyToOne
	@JoinColumn(name = "userID")
	private User user;
	
	public Contact() {
		
	}

	public Contact(int numberProduct, Boolean status, Date startDate, String userName, String phoneNumber,
			String address) {
		super();
		this.numberProduct = numberProduct;
		this.status = status;
		this.startDate = startDate;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberProduct() {
		return numberProduct;
	}

	public void setNumberProduct(int numberProduct) {
		this.numberProduct = numberProduct;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
}
