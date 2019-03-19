package com.singtel.test.insect;

import com.singtel.animal.activity.CanCrawl;
import com.singtel.animal.activity.CanFly;
import com.singtel.animal.activity.CannotFly;
import com.singtel.animal.sound.AnimalCannotSing;
import com.singtel.test.Animal;

public class Butterfly extends Animal {
	
		public Butterfly(boolean isCaterp){
			if(!isCaterp){
				this.flyable = new CanFly();
			}else{
				this.flyable = new CannotFly();
				this.walkable = new CanCrawl();
			}
			
			this.singable = new AnimalCannotSing();
		}
}
