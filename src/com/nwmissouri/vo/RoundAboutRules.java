package com.nwmissouri.vo;

public class RoundAboutRules extends Rules{

	float speed;
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public boolean isuTurn() {
		return uTurn;
	}
	public void setuTurn(boolean uTurn) {
		this.uTurn = uTurn;
	}
	public float getCarDistance() {
		return carDistance;
	}
	public void setCarDistance(float carDistance) {
		this.carDistance = carDistance;
	}
	boolean uTurn = false;
	float carDistance;
	
	
}
