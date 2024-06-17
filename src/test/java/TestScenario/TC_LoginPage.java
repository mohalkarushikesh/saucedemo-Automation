package TestScenario;

import org.testng.annotations.Test;
import PageObjects.LoginPage;
import TestBase.BaseClass;

public class TC_LoginPage extends BaseClass {
	LoginPage loginpage;

	@Test(priority = 0)
	public void clickOnUserNameTestCase() {
		loginpage = new LoginPage(driver);
		loginpage.clickOnUserName();
	}

	@Test(priority = 1)
	public void clickOnPasswordTestCase() {
		loginpage.clickOnPassword();
	}

	@Test(priority = 2)
	public void clickOnLoginButtonTestCase() {
		loginpage.clickOnLoginButton();
	}

}
