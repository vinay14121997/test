package com.jsp.Model;

public class Engine {
	
	private int cc;
	private String gas;
	private int noofpistons;
	public int getCc() {
		return cc;
	}
	public void setCc(int cc)
	{
		System.out.println("ok");
	}
	public String getGas() {
		return gas;
	}
	public void setGas(String gas) {
		this.gas = gas;
	}
	public int getNoofpistons() {
		return noofpistons;
	}
	public void setNoofpistons(int noofpistons) {
		this.noofpistons = noofpistons;
	}
	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", gas=" + gas + ", noofpistons=" + noofpistons + "]";
	}
	

}
