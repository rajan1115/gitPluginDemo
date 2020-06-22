package com.lex;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

	@Test
	public void testing() {
		// TODO Auto-generated method stub

		String name="Rajan";
		SoftAssert sa=new SoftAssert();
		
		
		sa.assertEquals("rajan", name);
		System.out.println("1");
		sa.assertTrue(name.equals("rajan"));
		System.out.println("2");
		sa.assertAll();
	}

}
