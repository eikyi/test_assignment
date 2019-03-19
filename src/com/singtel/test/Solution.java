package com.singtel.test;

import com.singtel.test.birds.Bird;
import com.singtel.test.birds.Chicken;
import com.singtel.test.birds.Duck;
import com.singtel.test.birds.Parrot;
import com.singtel.test.insect.Butterfly;
import com.singtel.test.waterAnimal.Dolphin;
import com.singtel.test.waterAnimal.Fish;


public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		System.out.println("DUCK:");
		Duck d = new Duck();
		d.sing();
		d.swim();
		System.out.println("CHICKEN:");
		Chicken c = new Chicken(false);
		c.sing();
		c.fly();
		System.out.println("Rooster:");
		Chicken r = new Chicken(true);
		r.sing();
		r.fly();
		System.out.println("Parrot:");
		Parrot p = new Parrot();
		System.out.println("Fish:");
		Fish f = new Fish();
		f.swim();
		f.sing();
		f.walk();
		System.out.println("Shark:");
		Fish shark = new Fish(Color.GREY,Size.LARGE,"Eat Other Fish");
		System.out.println("Clown Fish:");
		Fish clownfish = new Fish(Color.ORANGE,Size.SMALL,"Make jokes");
		System.out.println("Dolphin ");
		Dolphin dol = new Dolphin();
		System.out.println("Butterfly ");
		Butterfly b = new Butterfly(false);
		b.sing();
		b.fly();
		System.out.println("Caterpiller ");
		Butterfly ca = new Butterfly(true);
		ca.fly();
		ca.walk();
		
		CountingAnmialBehaviour counting = new CountingAnmialBehaviour();
		Animal[] animals = new Animal[]{
				d,c,r,p,f,shark,clownfish,b,ca
		};
		System.out.println("Flying Animals : "+counting.countFlyingAnimals(animals));
		System.out.println("Walking Animals : "+counting.countwalkingAnimals(animals));
		System.out.println("Singing Animals : "+counting.countSingingAnimals(animals));
		System.out.println("Swimming Animals : "+counting.countSwimmingAnimals(animals));
		
	}
}
