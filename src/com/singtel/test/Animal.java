package com.singtel.test;

import com.singtel.animal.activity.AbleToFly;
import com.singtel.animal.activity.AbleToSwim;
import com.singtel.animal.activity.AbleToWalk;
import com.singtel.animal.sound.Sing;


public class Animal {
	protected AbleToWalk walkable;
	protected AbleToSwim swimmable;
	protected AbleToFly flyable;
	protected Sing singable;
	
	public AbleToWalk getWalkable() {
		return walkable;
	}
	public void setWalkable(AbleToWalk walkable) {
		this.walkable = walkable;
	}
	public AbleToSwim getSwimmable() {
		return swimmable;
	}
	public void setSwimmable(AbleToSwim swimmable) {
		this.swimmable = swimmable;
	}
	
	public AbleToFly getFlyable() {
		return flyable;
	}
	public void setFlyable(AbleToFly flyable) {
		this.flyable = flyable;
	}
	
	public Sing getSingable() {
		return singable;
	}
	public void setSingable(Sing singable) {
		this.singable = singable;
	}
	public void walk() {
		walkable.walk();
		
	}
	public void swim() {
		swimmable.swim();
		
	}
	public void sing(){
		singable.sing();
	}
	public void fly(){
		flyable.fly();
	}
}
