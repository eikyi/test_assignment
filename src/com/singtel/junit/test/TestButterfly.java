package com.singtel.junit.test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.singtel.test.insect.Butterfly;

public class TestButterfly {
	@Test
	public void testButterflySing() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Butterfly b = new Butterfly(false);
		b.sing();
		assertThat(test.toString(), containsString("I cannot sing"));
	   }
	@Test
	public void testButterflyFly() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Butterfly b = new Butterfly(false);
		b.fly();
		assertThat(test.toString(), containsString("I am flying"));
	   }
}
