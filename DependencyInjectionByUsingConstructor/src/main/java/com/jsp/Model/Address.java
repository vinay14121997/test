package com.jsp.Model;

public class Address {
	
	private int pincode;
	private String state;
	private String city;
	public Address()
	{
		
	}
	public Address(int pin,String state,String city) {
		pincode=pin;
	this.state=state;
    this.city=city;
		
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", state=" + state + ", city=" + city + "]";
	}
	
	}


