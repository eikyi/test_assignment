package com.singtel.test.birds;

import com.singtel.animal.activity.CannotFly;
import com.singtel.animal.sound.ChickenSing;


public class Chicken extends Bird{
	public Chicken(boolean isRooster){
		this.singable = new ChickenSing(isRooster);
		this.flyable = new CannotFly();
	}
}
