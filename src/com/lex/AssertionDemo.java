package com.lex;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

	SoftAssert softAssert = new SoftAssert();
	SoftAssert softAssert1 = new SoftAssert();
	String assertionString = "demoforHardAssertion";

	@Test
	public void test1() {
		softAssert.assertEquals("demoforHardAssertions", assertionString);
		softAssert.assertAll();
	}

	@Test
	public void test2() {
		softAssert1.assertEquals("demoforHardAssertion", assertionString);
		softAssert1.assertAll();

	}

}
