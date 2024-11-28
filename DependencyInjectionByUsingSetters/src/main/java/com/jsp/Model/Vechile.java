package com.jsp.Model;

public class Vechile {
	private String vechilenumber;
	private String name;
	private double price;
	private String brand;
	private String color;
	private Engine engine;

	public Vechile() {
		
	}

	public String getVechilenumber() {
		return vechilenumber;
	}

	public void setVechilenumber(String vechilenumber) {
		this.vechilenumber = vechilenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vechile [vechilenumber=" + vechilenumber + ", name=" + name + ", price=" + price + ", brand=" + brand
				+ ", color=" + color + ", engine=" + engine + "]";
	}
	
}
