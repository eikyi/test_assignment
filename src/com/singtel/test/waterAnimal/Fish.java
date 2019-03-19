package com.singtel.test.waterAnimal;

import com.singtel.animal.activity.CanSwim;
import com.singtel.animal.activity.CannotWalk;
import com.singtel.animal.sound.AnimalCannotSing;
import com.singtel.test.Animal;
import com.singtel.test.Color;
import com.singtel.test.Size;

public class Fish extends Animal{
	Color color;
	Size size;
	String fishBehaviour;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getFishBehaviour() {
		return fishBehaviour;
	}

	public void setFishBehaviour(String fishBehaviour) {
		this.fishBehaviour = fishBehaviour;
	}

	public Fish(){
		this.singable = new AnimalCannotSing();
		this.walkable = new CannotWalk();
		this.swimmable = new CanSwim();
	}
	public Fish(Color color,Size size,String fishBehaviour){
		this.singable = new AnimalCannotSing();
		this.walkable = new CannotWalk();
		this.swimmable = new CanSwim();
		this.color = color;
		this.size = size;
		this.fishBehaviour = fishBehaviour;
		System.out.println(this.getSize() +" and " + this.getColor());
		System.out.println(this.getFishBehaviour());
	}
}
