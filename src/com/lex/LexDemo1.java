package com.lex;

import org.testng.annotations.Test;

public class LexDemo1 {
	

@Test(enabled=false)
public void login() {
	System.out.println("Login");
}

@Test(dependsOnMethods="login")
public void dashboard() {
	System.out.println("Dashboard");
}

@Test(dependsOnMethods={"login","dashboard"})
public void logout() {
	System.out.println("Logout");
}

}
