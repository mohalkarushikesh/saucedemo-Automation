package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inventory extends BasePage {
	WebDriver driver;

	public Inventory(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "inventory_item_name")
	public List<WebElement> productNames;

	@FindBy(className = "inventory_item_price")
	public List<WebElement> productPrices;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	public WebElement addtocartbackpackbutton;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	public WebElement addtocarttshirt;

	@FindBy(className = "shopping_cart_link")
	public WebElement shopping_cart_link;

	@FindBy(id = "checkout")
	public WebElement checkout;

	@FindBy(id = "first-name")
	public WebElement firstname;

	@FindBy(id = "last-name")
	public WebElement lastname;

	@FindBy(id = "postal-code")
	public WebElement postalcode;

	@FindBy(id = "continue")
	public WebElement continueweb;

	@FindBy(xpath = "//div[@class=\"summary_info\"]//div")
	public List<WebElement> summaryinfo;

	@FindBy(id = "finish")
	public WebElement finish;

	@FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
	public WebElement thankyoumsg;

	@FindBy(id = "back-to-products")
	public WebElement back_to_products;

	// String inventorypageurl = driver.getCurrentUrl();

	public void printProductNamesandPrices() {
		for (int i = 0; i < productNames.size(); i++) {
			
			System.out.println(productNames.get(i).getText() + "		" + productPrices.get(i).getText());
		}
		System.out.println();
	}

	public void clickOnAddtoCartBackPack() {
		addtocartbackpackbutton.click();
	}

	public void ClickOnAddtoCartTshirt() {
		addtocarttshirt.click();
	}

	public void click_on_shopping_cart_link() {
		shopping_cart_link.click();
	}

	public void click_on_checkout() {
		checkout.click();
	}

	public void sendFirstName() {
		firstname.sendKeys("Elon");
	}

	public void sendLastName() {
		lastname.sendKeys("Musk");
	}

	public void sendpostalcode() {
		postalcode.sendKeys("885101");
	}

	public void ClickOnContinue() {
		continueweb.click();
	}

	public void GetTotalBillInfo() {
		for (int i = 4; i < summaryinfo.size() - 1; i++) {
			System.out.println(summaryinfo.get(i).getText());
		}
		System.out.println();
	}

	public void ClickOnfinish() {
		finish.click();
	}

	public void captureTheMessage() {
		System.out.println(thankyoumsg.getText());
	}

	public void ClickOnBacktoProducts() {
		back_to_products.click();
	}
	/*
	 * public void verifySucessfullyNavigated() { if
	 * (driver.getCurrentUrl().equals(inventorypageurl)) {
	 * System.out.println("Successfully headed back to inventory page!"); } else {
	 * System.out.println("There has been Error here MATE"); } }
	 */
}
