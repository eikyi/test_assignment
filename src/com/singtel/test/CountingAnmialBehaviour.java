package com.singtel.test;


import com.singtel.animal.activity.CanFly;
import com.singtel.animal.activity.CanSwim;
import com.singtel.animal.activity.CanWalk;
import com.singtel.animal.sound.AnimalCanSing;
import com.singtel.animal.sound.CatSing;
import com.singtel.animal.sound.ChickenSing;
import com.singtel.animal.sound.DogSing;
import com.singtel.animal.sound.DuckSing;
import com.singtel.animal.sound.ParrotSing;

public class CountingAnmialBehaviour {
	
	public int countFlyingAnimals(Animal animals[]){
		int count = 0;
		for (Animal animal : animals) {
			if(animal.getFlyable() != null && animal.getFlyable() instanceof CanFly){
				count++;
			}
		}
		return count;
		
	}
	
	public int countwalkingAnimals(Animal animals[]){
		int count = 0;
		for (Animal animal : animals) {
			if(animal.getWalkable() != null && animal.getWalkable() instanceof CanWalk){
				count++;
			}
		}
		return count;
	}
	public int countSingingAnimals(Animal animals[]){
		int count = 0;
		for (Animal animal : animals) {
			if(animal.getSingable() != null && (animal.getSingable() instanceof AnimalCanSing ||
					animal.getSingable() instanceof CatSing || animal.getSingable() instanceof ChickenSing ||
					animal.getSingable() instanceof DogSing || animal.getSingable() instanceof DuckSing || 
					animal.getSingable() instanceof ParrotSing)){
				count++;
			}
		}
		return count;
	}
	public int countSwimmingAnimals(Animal animals[]){
		int count = 0;
		for (Animal animal : animals) {
			if(animal.getSwimmable() != null && animal.getSwimmable() instanceof CanSwim){
				count++;
			}
		}
		return count;
	}
}
