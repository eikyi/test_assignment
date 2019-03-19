package com.singtel.test.birds;

import com.singtel.animal.activity.CanFly;
import com.singtel.animal.activity.CanWalk;
import com.singtel.animal.sound.AnimalCanSing;
import com.singtel.test.Animal;

public class Bird extends Animal{
	public Bird(){
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.singable=new AnimalCanSing();
    }
}
