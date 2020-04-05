package com.skilldistillery.jets;

public class JetImpl extends Jet{
	private double flightTime;
	
    public JetImpl() {
    	
    }
    
    public JetImpl (String model, double speed, int range, long price) {
    	super(model, speed, range, price);
    }
    
    @Override
    public void fly() {
    	super.fly();
		this.flightTime = Math.round((super.getRange()/super.getSpeed())*100.0)/100.0; 
		System.out.println(super.toString() + "\nI'm just a drone. I can fly for " +flightTime+"hrs");
		
	}
 
}
