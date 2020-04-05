package com.skilldistillery.jets;

public class Ishani extends Jet implements RacingAircraft {
	private double flightTime;

	
	public Ishani(String model, String name, double speed, int range, long price) {
		super(model, name, speed, range, price);
	}
	@Override
	public void race() {
		System.out.println(super.getName());
		System.out.println("It's my sky, they'll never catch me 💨.");
	}
	
	@Override
public void fly() {
		super.fly();
		this.flightTime = Math.round((super.getRange()/super.getSpeed())*100.0)/100.0;
		System.out.println(super.toString() + "\nFly fast, Fly high. I can fly for " +flightTime);
	}

}
