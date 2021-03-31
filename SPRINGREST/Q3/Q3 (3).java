package com.capgemini.springrest;

public class Zipcode {
	
	private int zipCode;
	private ZipDetails zipdetails;
	public Zipcode(int zipCode, ZipDetails zipdetails) {
		this.zipCode = zipCode;
		this.zipdetails = zipdetails;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public ZipDetails getZipdetails() {
		return zipdetails;
	}
	public void setZipdetails(ZipDetails zipdetails) {
		this.zipdetails = zipdetails;
	}
}
