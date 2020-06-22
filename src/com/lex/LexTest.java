package com.lex;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LexTest {
  @Test(dependsOnMethods = "login")
  @Parameters({"browser","URL"}) 
  public void setUp(@Optional("Firefox")String browser1, String url1) {
	  System.out.println("Browser:"+browser1);
	  System.out.println("URL:"+url1);
  }
  
  @Test(enabled=false)
  public void login() {
	  System.out.println("Login success!");
  }
}
