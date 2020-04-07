package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException
	{

		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered username");	
		
		lp.setPassword(password);
		logger.info("Entered password");		
		
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");			
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");			
		}
		
		
	}
	
	

}
