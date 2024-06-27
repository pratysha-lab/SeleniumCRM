package com.comcast.crm.createOrgTest;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test
	public void createOrgTest() {
		String 	USERNAME=System.getProperty("username");
		System.out.println("Executed createOrgTest");
		System.out.println(USERNAME);
		
	}
	@Test
	public void modifyOrgTest() {
		String 	PASSWORD=System.getProperty("password");
		System.out.println("Executed modifyOrgTest");
		System.out.println(PASSWORD);
		
	}
}
