package com.singtel.junit.test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.singtel.test.birds.Chicken;

public class TestRooster {

	@Test
	public void testRoosterSing() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Chicken c = new Chicken(true);
		c.sing();
		assertThat(test.toString(), containsString("Cock-a-doodle-doo"));
	   }
}
