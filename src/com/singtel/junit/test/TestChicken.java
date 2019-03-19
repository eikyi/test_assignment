package com.singtel.junit.test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.singtel.test.birds.Chicken;

public class TestChicken {
	
	@Test
	public void testChickenSing() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Chicken c = new Chicken(false);
		c.sing();
		assertThat(test.toString(), containsString("Cluck, cluck"));
	   }
	
	@Test
	public void testChickenFly() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Chicken c = new Chicken(false);
		c.fly();
		assertThat(test.toString(), containsString("I cannot fly"));
	   }
}
