package com.skilldistillery.jets;

public class Jet {
	private String model;
	private String name;
	private double speed;
	private int range;
	private long price;
	
	
	public Jet() {
		super();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Jet(String model, String name, double speed, int range, long price) {
		this.model = model;
		this.name = name;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.name = "Drone";
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	
	public void fly() {

	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		
		return "Jet [model: " + model + ", name: " + name + ", speed: " + speed + ", range: " + range + ", price: " + price
				+ "$]";
	}

}
