package io.org.annote;

import org.springframework.beans.factory.annotation.Required;

public class VCard {

	@Required
	private String vNumber;


	public String getvNumber() {
		return vNumber;
	}

	@Override
	public String toString() {
		return "VCard [vNumber=" + vNumber + "]";
	}

	
	 public void setvNumber(String vNumber) { this.vNumber = vNumber; }
	 



}
