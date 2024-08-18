package PageObjectTricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AbstractComponents.AbstractComponent;

public class CamperSelectPriceOptionTricentisPage extends AbstractComponent{

	WebDriver driver;
	
	public CamperSelectPriceOptionTricentisPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")
	WebElement selectultimateButtonWebElement;

	@FindBy(id = "nextsendquote")
	WebElement nextsendquoteButtonWebElement;

	public void inputCamperSelectPriceOptionTricentisPage() {
		Assert.assertTrue(selectultimateButtonWebElement.isEnabled(), "selectultimateButton is not clickable.");
		selectultimateButtonWebElement.click();

		Assert.assertTrue(nextsendquoteButtonWebElement.isEnabled(), "nextsendquoteButton is not clickable.");
		nextsendquoteButtonWebElement.click();
	}
}
