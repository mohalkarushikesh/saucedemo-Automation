package TestScenario;

import org.testng.annotations.Test;

import PageObjects.Inventory;
import TestBase.BaseClass;

public class TC_InventoryPage extends BaseClass {
	Inventory inventory;

	@Test(priority = 4)
	public void printProductNamesandPricesTestCase() {
		inventory = new Inventory(driver);
		inventory.printProductNamesandPrices();
	}

	@Test(priority = 5)
	public void clickOnAddtoCartBackPackTestCase() {
		inventory.clickOnAddtoCartBackPack();
	}

	@Test(priority = 6)
	public void ClickOnAddtoCartTshirtTestCase() {
		inventory.ClickOnAddtoCartTshirt();
	}

	@Test(priority = 7)
	public void click_on_shopping_cart_link_TestCase() {
		inventory.click_on_shopping_cart_link();
	}

	@Test(priority = 8)
	public void click_on_checkout_TestCase() {
		inventory.click_on_checkout();
	}

	@Test(priority = 9)
	public void sendFirstNameTestCase() {
		inventory.sendFirstName();
	}

	@Test(priority = 10)
	public void sendLastNameTestCase() {
		inventory.sendLastName();
	}

	@Test(priority = 11)
	public void sendpostalcodeTestCase() {
		inventory.sendpostalcode();
	}

	@Test(priority = 12)
	public void ClickOnContinueTestCase() {
		inventory.ClickOnContinue();
	}

	@Test(priority=13)
	public void GetTotalBillInfoTestCase() {
		inventory.GetTotalBillInfo();
	}
	
	@Test(priority = 14)
	public void ClickOnfinishTestCase() {
		inventory.ClickOnfinish();
	}

	@Test(priority = 15)
	public void captureTheMessageTestCase() {
		inventory.captureTheMessage();
	}
	@Test(priority = 16)
	public void ClickOnBacktoProductsTestCase() {
		inventory.ClickOnBacktoProducts();
	}
	/*
	@Test(priority = 16)
	public void verifySucessfullyNavigatedTestCase() {
		inventory.verifySucessfullyNavigated();
	}
	*/
}
