package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.dynamicdataPage;

public class TC_DynamicDataTest extends BaseClass{

	@Test(groups = { "valid" })
	public void dynamicdata() throws InterruptedException {
		
		driver.get("https://practice.automationtesting.in/");
		dynamicdataPage dd = new dynamicdataPage(driver);
		dd.openDemoSitePage();
		dd.clickMore();
		dd.clickdynamicdata();
		dd.clickgetdynamicdataBtn();
		Thread.sleep(20000);
		Assert.assertTrue(driver.getTitle().equals("File input - Multi select"));
	}

}
