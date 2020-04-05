package com.skilldistillery.jets;

public class DustyCrophopper extends Jet implements LightAircraft {
	private double flightTime;
	
	public DustyCrophopper(String model, String name, double speed, int range, long price) {
		super(model, name, speed, range, price);
	}

	@Override
	public void cropdusting() {
		System.out.println(super.getName());
		System.out.println("Wroom wroom, it's time to spray some fungicide");
		
	}
	
	@Override
    public void fly() {
		super.fly();
		this.flightTime = Math.round((super.getRange()/super.getSpeed())*100.0)/100.0; 
		System.out.println(super.toString() + "\nI'm slow but hardworking cropduster. I can fly for " +flightTime+"hrs");
		
	}

}