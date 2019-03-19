package com.singtel.animal.activity;

public class CannotWalk implements AbleToWalk{

	@Override
	public void walk() {
		System.out.println("I cannot walk");
		
	}

}
