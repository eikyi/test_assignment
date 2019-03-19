package com.singtel.test.birds;

import java.util.HashMap;

import com.singtel.animal.sound.CatSing;
import com.singtel.animal.sound.ChickenSing;
import com.singtel.animal.sound.DogSing;
import com.singtel.animal.sound.ParrotSing;
import com.singtel.animal.sound.Sing;

public class Parrot extends Bird{
	
	public Parrot(){
		ParrotSing ps = new ParrotSing();
		HashMap<String, Sing> parrotSound = new HashMap<String, Sing>();
		parrotSound.put("Dog", new DogSing());
		parrotSound.put("Cat", new CatSing());
		parrotSound.put("Rooster", new ChickenSing(true));
		ps.setParrotSound(parrotSound);
		ps.sing();
		
	}
}
