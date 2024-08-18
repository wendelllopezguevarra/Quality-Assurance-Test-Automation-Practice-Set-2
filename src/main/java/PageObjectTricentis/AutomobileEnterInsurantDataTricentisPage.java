package PageObjectTricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import AbstractComponents.AbstractComponent;

public class AutomobileEnterInsurantDataTricentisPage extends AbstractComponent {

	WebDriver driver;
	
	public AutomobileEnterInsurantDataTricentisPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstname")
    WebElement firstnameTextWebElement;

    @FindBy(id = "lastname")
    WebElement lastnameTextWebElement;

    @FindBy(id = "birthdate")
    WebElement birthdateTextWebElement;

    @FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")
    WebElement gendermaleButtonWebElement;

    @FindBy(id = "streetaddress")
    WebElement streetaddressTextWebElement;

    @FindBy(id = "country")
    WebElement countryListWebElement;

    @FindBy(id = "zipcode")
    WebElement zipcodeTextWebElement;

    @FindBy(id = "city")
    WebElement cityTextWebElement;

    @FindBy(id = "occupation")
    WebElement occupationListWebElement;

    @FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span")
    WebElement otherButtonWebElement;

    @FindBy(id = "website")
    WebElement websiteTextWebElement;

    @FindBy(id = "nextenterproductdata")
    WebElement nextenterproductdataButtonWebElement;

    public void inputAutomobileEnterInsurantDataTricentisPage() {
        firstnameTextWebElement.sendKeys("asdasd");
        Assert.assertEquals(firstnameTextWebElement.getAttribute("value"), "asdasd", "Mismatched: Value or Synchronization");

        lastnameTextWebElement.sendKeys("asdasda");
        Assert.assertEquals(lastnameTextWebElement.getAttribute("value"), "asdasda", "Mismatched: Value or Synchronization");

        birthdateTextWebElement.sendKeys("11/01/1996");
        Assert.assertEquals(birthdateTextWebElement.getAttribute("value"), "11/01/1996", "Mismatched: Value or Synchronization");

        Assert.assertTrue(gendermaleButtonWebElement.isEnabled(), "gendermaleButton is not clickable.");
        gendermaleButtonWebElement.click();

        streetaddressTextWebElement.sendKeys("asdas");
        Assert.assertEquals(streetaddressTextWebElement.getAttribute("value"), "asdas", "Mismatched: Value or Synchronization");

        Select countryListsSelect = new Select(countryListWebElement);
        countryListsSelect.selectByVisibleText("Åland Islands");
        Assert.assertEquals(countryListWebElement.getAttribute("value"), "Åland Islands", "Mismatched: Value or Synchronization");

        zipcodeTextWebElement.sendKeys("12312");
        Assert.assertEquals(zipcodeTextWebElement.getAttribute("value"), "12312", "Mismatched: Value or Synchronization");

        cityTextWebElement.sendKeys("asda");
        Assert.assertEquals(cityTextWebElement.getAttribute("value"), "asda", "Mismatched: Value or Synchronization");

        Select occupationListSelect = new Select(occupationListWebElement);
        occupationListSelect.selectByVisibleText("Selfemployed");
        Assert.assertEquals(occupationListWebElement.getAttribute("value"), "Selfemployed", "Mismatched: Value or Synchronization");

        Assert.assertTrue(otherButtonWebElement.isEnabled(), "otherButton is not clickable.");
        otherButtonWebElement.click();

        websiteTextWebElement.sendKeys("asdsad.com");
        Assert.assertEquals(websiteTextWebElement.getAttribute("value"), "asdsad.com", "Mismatched: Value or Synchronization");

        Assert.assertTrue(nextenterproductdataButtonWebElement.isEnabled(), "nextenterproductdataButton is not clickable.");
        nextenterproductdataButtonWebElement.click();
    }
}
