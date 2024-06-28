package com.comcast.crm.createContactTest;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test
public void createContactTest() {
		String BROWSER=System.getProperty("browser");
	System.out.println("Executed createdContactTest");
	System.out.println(BROWSER);
	
}
@Test
public void modifyContactTest() {
	String 	URL=System.getProperty("url");
	System.out.println("Executed modifyContactTest");
	System.out.println(URL);
		
}
@Test
public void deleteContactTest() {
	String 	URL=System.getProperty("url");
	System.out.println("Executed deletedContactTest");
	System.out.println(URL);
		
}

}
