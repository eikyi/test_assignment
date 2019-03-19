package com.singtel.junit.test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.singtel.test.birds.Parrot;

public class TestParrot {

	@Test
	public void testParrotSing() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Parrot c = new Parrot();
		c.sing();
		assertThat(test.toString(), containsString("Parrot stay near Cat: Meow\r\nParrot stay near Rooster: Cock-a-doodle-doo\r\nParrot stay near Dog: Woof, woof"));
	   }
}
