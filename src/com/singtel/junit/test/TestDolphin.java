package com.singtel.junit.test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.singtel.test.waterAnimal.Dolphin;

public class TestDolphin {
	@Test
	public void testDolphin() {
		ByteArrayOutputStream test = new ByteArrayOutputStream();
		PrintStream PS = new PrintStream(test);
		System.setOut(PS);
		Dolphin c = new Dolphin();
		assertThat(test.toString(), containsString("I am swimming"));
	   }

}
