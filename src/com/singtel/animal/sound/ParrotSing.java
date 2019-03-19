package com.singtel.animal.sound;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParrotSing implements Sing{
	Sing s;
	HashMap<String, Sing> parrotSound = new HashMap<String, Sing>();
	
	public HashMap<String, Sing> getParrotSound() {
		return parrotSound;
	}
	public void setParrotSound(HashMap<String, Sing> parrotSound) {
		this.parrotSound = parrotSound;
	}
	@Override
	public void sing() {
		Iterator it = this.parrotSound.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.print( "Parrot stay near " + pair.getKey()+": ");
	        ((Sing) pair.getValue()).sing();
	        it.remove(); // avoids a ConcurrentModificationException
	        
	    }
		
		
	}
	

}
