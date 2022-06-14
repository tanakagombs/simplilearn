package com.simplilearn.inheritance;

class MountainBike implements Bicycle {
	
	private int seatHeight;
	private int gear;
	private int speed;
	
	
	public MountainBike(int startHeight, int startGear, int startSpeed) {
		
		seatHeight = startHeight;
		gear = startGear;
		speed = startSpeed;
		
		speedUp(6);
		
		System.out.println(speed);
		
	}


	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		speed = speed - decrement;
		
	}


	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed = speed + increment;
		
	}
	
	
	

}
