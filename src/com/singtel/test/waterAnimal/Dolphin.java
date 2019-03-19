package com.singtel.test.waterAnimal;

import com.singtel.animal.activity.CanSwim;

public class Dolphin {
	Fish fish;
	public Dolphin(){
		
        this.fish =new Fish();
        this.fish.setSwimmable(new CanSwim());
        this.fish.swim();
    }

}
