package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {

		// logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		if (driver.getTitle().contains("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);

		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);

		}

	}
}
