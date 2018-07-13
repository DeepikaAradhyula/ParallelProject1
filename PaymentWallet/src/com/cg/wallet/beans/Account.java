package com.cg.wallet.beans;

import java.time.LocalDateTime;

public class Account {
	private String mobileNo;
	private String name;
	private String email;
	private double balance;
	LocalDateTime date;

	public Account(String mobileNo, String name, String email, double balance) {
		super();
		this.mobileNo = mobileNo;
		this.name = name;
		this.email = email;
		this.balance = balance;

	}

	public Account() {
		super();
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
