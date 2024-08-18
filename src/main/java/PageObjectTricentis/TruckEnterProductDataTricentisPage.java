package PageObjectTricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import AbstractComponents.AbstractComponent;

public class TruckEnterProductDataTricentisPage extends AbstractComponent{

	WebDriver driver;
	
	public TruckEnterProductDataTricentisPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	  @FindBy(id = "startdate")
	    WebElement startdateTextWebElement;

	    @FindBy(id = "insurancesum")
	    WebElement insurancesumListWebElement;

	    @FindBy(id = "damageinsurance")
	    WebElement damageinsuranceListWebElement;

	    @FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span")
	    WebElement legalDefenseInsuranceButtonWebElement;

	    @FindBy(id = "nextselectpriceoption")
	    WebElement nextselectpriceoptionButtonWebElement;

	    public void inputTruckEnterProductDataTricentisPage() {

	        startdateTextWebElement.sendKeys("04/11/2025");
	        Assert.assertEquals(startdateTextWebElement.getAttribute("value"), "04/11/2025", "Mismatched: Value or Synchronization");

	        Select insurancesumListSelect = new Select(insurancesumListWebElement);
	        insurancesumListSelect.selectByVisibleText("35.000.000,00");
	        Assert.assertEquals(insurancesumListWebElement.getAttribute("value"), "35000000", "Mismatched: Value or Synchronization");

	        Select damageinsuranceListSelect = new Select(damageinsuranceListWebElement);
	        damageinsuranceListSelect.selectByVisibleText("Full Coverage");
	        Assert.assertEquals(damageinsuranceListWebElement.getAttribute("value"), "Full Coverage", "Mismatched: Value or Synchronization");

	        Assert.assertTrue(legalDefenseInsuranceButtonWebElement.isEnabled(), "legalDefenseInsuranceButton is not clickable.");
	        legalDefenseInsuranceButtonWebElement.click();

	        Assert.assertTrue(nextselectpriceoptionButtonWebElement.isEnabled(), "nextselectpriceoptionButton is not clickable.");
	        nextselectpriceoptionButtonWebElement.click();
	    }
}
