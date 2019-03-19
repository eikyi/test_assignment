package com.singtel.animal.activity;

public class CannotSwim implements AbleToSwim{

	@Override
	public void swim() {
		System.out.println("I cannot swim");
		
	}

}
