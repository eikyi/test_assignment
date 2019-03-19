package com.singtel.animal.activity;

public class CannotFly implements AbleToFly{

	@Override
	public void fly() {
		System.out.println("I cannot fly");
		
	}

}
