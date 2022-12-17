package Testcase;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.commonMethods;
import Resources.constants;
import pageobjectmodel.LogInPageObject;
import pageobjectmodel.SignupPageObject;

public class Signuptestcase extends BaseClass {
	@Test
	public void verifySignup() throws IOException, InterruptedException {
		
		
		LogInPageObject LPO=new LogInPageObject(driver);
		LPO.clickOntryforfree().click();
		
		SignupPageObject SPO=new SignupPageObject(driver);
		Thread.sleep(3000);
		SPO.enterfirstName().sendKeys(constants.firstName);
		SPO.enterlastName().sendKeys(constants.lastName);
		SPO.enterjobTitle().sendKeys(constants.jobTitle);
		SPO.enterEmailId().sendKeys(constants.EmailId);
		SPO.enterphoneNo().sendKeys(constants.phoneNo);
		SPO.entercompany().sendKeys(constants.company);
		
		
		commonMethods.SelectDropdown(SPO.SelectCompanyEmployees(), 1);
		//Select s=new Select(SPO.SelectCompanyEmployees());
		//s.selectByIndex(1);
		//SPO.Selectcountry().sendKeys(constants.company);
		commonMethods.SelectDropdown(SPO.Selectcountry(), 4);
		//Select s1=new Select(SPO.Selectcountry());
		//s1.selectByIndex(1);
		SPO.clickOncheckbox().click();
		SPO.clickOnfreetrial().click();
		
	}

}
