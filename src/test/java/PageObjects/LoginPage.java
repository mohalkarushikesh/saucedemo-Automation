package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "user-name")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	public void clickOnUserName() {
		username.sendKeys("standard_user");
	}
	
	public void clickOnPassword() {
		password.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginButton() {
		loginbutton.click();
	}
	
}
