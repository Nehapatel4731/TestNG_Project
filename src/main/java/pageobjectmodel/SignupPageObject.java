package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	public WebDriver driver;
	By firstName=By.xpath("//input[@name='UserFirstName']");
	By lastName=By.xpath("//input[@name='UserLastName']");
	By jobTitle=By.xpath("//input[@name='UserTitle']");
	By EmailId=By.xpath("//input[@name='UserEmail']");
	By phoneNo=By.xpath("//input[@name='UserPhone']");
	By SelectCompanyEmployees=By.xpath("//select[@name='CompanyEmployees']");
	By company=By.xpath("//input[@name='CompanyName']");
	By Selectcountry=By.xpath("//select[@name='CompanyCountry']");
	By checkbox=By.xpath("//div[@class='checkbox-ui']");
	By freetrial=By.xpath("//button[@type='submit']");
	
	public SignupPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	
	public WebElement enterfirstName() {
		return driver.findElement(firstName);
	}
	public WebElement enterlastName() {
		return driver.findElement(lastName);
	}
	public WebElement enterjobTitle() {
		return driver.findElement(jobTitle);
	}
	public WebElement enterEmailId() {
		return driver.findElement(EmailId);
	}
	public WebElement enterphoneNo() {
		return driver.findElement(phoneNo);
	}
	public WebElement SelectCompanyEmployees() {
		return driver.findElement(SelectCompanyEmployees);
	}
	public WebElement entercompany() {
		return driver.findElement(company);
	}
	//public WebElement Selectcountry() {
	//	return driver.findElement(Selectcountry);
	//}
	



	public WebElement clickOncheckbox() {
		// TODO Auto-generated method stub
		return driver.findElement(checkbox);
	}
	public WebElement clickOnfreetrial() {
		return driver.findElement(freetrial);

	}

	public WebElement Selectcountry() {
		// TODO Auto-generated method stub
		return driver.findElement(Selectcountry);
	}
	}

	

