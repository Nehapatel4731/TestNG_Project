package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObject {
	public WebDriver driver;//this driver have don't scope
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");
	By tryforfree=By.xpath("//a[@id='signup_link']");
	By error=By.xpath("//div[@id='error']");
	public LogInPageObject(WebDriver driver2) {//it wil create automatically when we useLogInPageObject LPO=new LogInPageObject(driver);\\driver
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
	public WebElement clickOntryforfree() {
		return driver.findElement(tryforfree);
	}
	public WebElement error() {
		return driver.findElement(error);
	
	}

	}

