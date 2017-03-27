package com.zjy.jms.producer.model;

public class Vendor {
	private String vendorName;
	private String firstName;
	private String lastrName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String email;
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastrName() {
		return lastrName;
	}
	public void setLastrName(String lastrName) {
		this.lastrName = lastrName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Vendor [vendorName=" + getVendorName() + ", firstName=" + getFirstName()
				+ ", lastrName=" + getLastrName() + ", address=" + getAddress()
				+ ", city=" + getCity() + ", state=" + getState() + ", zipCode="
				+ getZipCode() + ", phoneNumber=" + getPhoneNumber() + ", email=" + getEmail()
				+ "]";
	}
	
}
