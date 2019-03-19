package com.singtel.junit.test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.singtel.test.Color;
import com.singtel.test.Size;
import com.singtel.test.waterAnimal.Fish;

public class TestFish {
	
	@Test
	public void testFishSing() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Fish c = new Fish();
		c.sing();
		assertThat(test.toString(), containsString("I cannot sing"));
	   }
	
	@Test
	public void testFishWalk() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Fish c = new Fish();
		c.walk();
		assertThat(test.toString(), containsString("I cannot walk"));
	   }
	
	@Test
	public void testFishSwim() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Fish c = new Fish();
		c.swim();
		assertThat(test.toString(), containsString("I am swimming"));
	   }
	
	@Test
	public void testShark() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Fish c = new Fish(Color.GREY,Size.LARGE,"Eat Other Fish");
		assertThat(test.toString(), containsString("LARGE and GREY\r\nEat Other Fish"));
	   }
	
	@Test
	public void testClownfish() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Fish c = new Fish(Color.ORANGE,Size.SMALL,"Make jokes");
		assertThat(test.toString(), containsString("SMALL and ORANGE\r\nMake jokes"));
	   }

}
