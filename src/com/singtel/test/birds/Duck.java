package com.singtel.test.birds;

import com.singtel.animal.activity.CanSwim;
import com.singtel.animal.sound.DuckSing;

public class Duck extends Bird{
	public Duck(){
		this.swimmable = new CanSwim();
		this.singable = new DuckSing();
	}
}
