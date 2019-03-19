package com.singtel.junit.test;


import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.matchers.JUnitMatchers.*;
import org.junit.Test;

import com.singtel.test.birds.Duck;

public class TestDuck {
	
	
	
	@Test
	public void testDuckSing() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Duck d = new Duck();
		d.sing();
		assertThat(test.toString(), containsString("Quack, quack"));
	   }
	
	@Test
	public void testDuckSwim() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Duck d = new Duck();
		d.swim();
		assertThat(test.toString(), containsString("I am swimming"));
	}
}
