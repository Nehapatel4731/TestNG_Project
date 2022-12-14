package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.commonMethods;
import Resources.constants;
import pageobjectmodel.LogInPageObject;

public class LoginTestcase extends BaseClass {
	
	@Test
	public void login() throws IOException {
		//browseInitialization();
		//driver.get("https://login.salesforce.com/"); //this driver have a scope
		
		LogInPageObject LPO=new LogInPageObject(driver);
		LPO.enterUsername().sendKeys(constants.username);
		LPO.enterpassword().sendKeys(constants.password);
		LPO.clickOnLogin().click();
		
		/*SoftAssert assertion=new SoftAssert();
		                                                    //String actual=error.getText();
		String Expected=constants.errormessage;
		                                                     // WebElement actual=driver.findElement(By.xpath("//div[@id='error']"));(it is not allowed in testcase class)
		
		
	     assertion.assertEquals(LPO.error().getText(), Expected);
	      assertion.assertAll();*/
		  commonMethods.handleAssertion(LPO.error().getText(), constants.errormessage);

	
	}
	
	

	

}
