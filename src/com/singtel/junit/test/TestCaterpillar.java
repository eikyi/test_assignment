package com.singtel.junit.test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.singtel.test.insect.Butterfly;

public class TestCaterpillar {
	
	@Test
	public void testCaterpillarFly() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Butterfly b = new Butterfly(true);
		b.fly();
		assertThat(test.toString(), containsString("I cannot fly"));
	   }
	@Test
	public void testCaterpillarCrawl() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Butterfly b = new Butterfly(true);
		b.walk();
		assertThat(test.toString(), containsString("I am crawling"));
	   }

}
