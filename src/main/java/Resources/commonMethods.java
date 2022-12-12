package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	/*public void SelectDropdown() {
		Select s=new Select(SPO.SelectCompanyEmployees());
		s.selectByIndex(1);
		Select s1=new Select(SPO.Selectcountry());
		s1.selectByIndex(1);
	}*/
	public  static void SelectDropdown(WebElement dropdown,int Index) {
		Select s=new Select(dropdown);
		s.selectByIndex(Index);
	}
	public static void handleAssertion(String actualString,String expectedString) {

		SoftAssert assertion=new SoftAssert();
        String Expected=constants.errormessage;
	
	    assertion.assertEquals(LPO.error().getText(), Expected);
	    assertion.assertAll();
	}

}
