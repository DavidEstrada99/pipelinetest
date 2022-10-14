package com.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Testing.JenkinsCalculator;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10,myCalc.addNumbers(5, 5));
		
	}
	
	@Test
	public void subTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10,myCalc.subNumbers(15, 5));
		
	}

}
