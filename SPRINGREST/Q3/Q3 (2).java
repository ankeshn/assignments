package com.capgemini.springrest;

public class ZipDetails {
	
	private String state;
	private String city;
	private String country;
	
	public ZipDetails(String state, String city, String country) {
		//super();
		this.state = state;
		this.city = city;
		this.country = country;
	}
	
	public String getState() {
		return state;}
	public void setState(String state) {
		this.state = state;}
	public String getCity() {
		return city;}
	public void setCity(String city) {
		this.city = city;}
	public String getCountry() {
		return country;}
	public void setCountry(String country) {
		this.country = country;}
	@Override
	public String toString() {
		return "ZipDetails [state=" + state + ", city=" + city + ", country=" + country + "]";
	}
}
