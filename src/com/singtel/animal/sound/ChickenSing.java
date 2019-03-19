package com.singtel.animal.sound;

public class ChickenSing implements Sing{
	String chickenSound = "Cluck, cluck";
	String roosterSound = "Cock-a-doodle-doo";
	boolean isRooster= false;
	
	public ChickenSing(boolean isRooster){
		this.isRooster = isRooster;
	}
	@Override
	public void sing() {
		if(isRooster){
			System.out.println(this.roosterSound);
		}else{
			System.out.println(this.chickenSound);
		}
		
	}
	
}
