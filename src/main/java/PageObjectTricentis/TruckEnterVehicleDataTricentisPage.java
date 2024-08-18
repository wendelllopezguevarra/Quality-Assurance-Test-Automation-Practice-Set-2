package PageObjectTricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import AbstractComponents.AbstractComponent;

public class TruckEnterVehicleDataTricentisPage extends AbstractComponent{
	
	WebDriver driver;

	public TruckEnterVehicleDataTricentisPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(id = "make")
    WebElement makeListWebElement;

    @FindBy(id = "engineperformance")
    WebElement engineperformanceTextWebElement;

    @FindBy(id = "dateofmanufacture")
    WebElement dateofmanufactureTextWebElement;

    @FindBy(id = "numberofseats")
    WebElement numberofseatsListWebElement;

    @FindBy(id = "fuel")
    WebElement fuelListWebElement;
    
    @FindBy(id = "payload")
    WebElement payloadTextWebElement;
    
    @FindBy(id = "totalweight")
    WebElement totalweightTextWebElement;

    @FindBy(id = "listprice")
    WebElement listpriceTextWebElement;

    @FindBy(id = "licenseplatenumber")
    WebElement licenseplatenumberTextWebElement;

    @FindBy(id = "annualmileage")
    WebElement annualmileageTextWebElement;

    @FindBy(id = "nextenterinsurantdata")
    WebElement nextenterinsurantdataButtonWebElement;

    public void inputTruckEnterVehicleDataTricentisPage() {

        Select makeListsSelect = new Select(makeListWebElement);
        makeListsSelect.selectByVisibleText("Volvo");
        Assert.assertEquals(makeListWebElement.getAttribute("value"), "Volvo", "Mismatched: Value or Synchronization");

        String engineperformanceString = "124";
        engineperformanceTextWebElement.sendKeys(engineperformanceString);
        Assert.assertEquals(engineperformanceTextWebElement.getAttribute("value"), engineperformanceString, "Mismatched: Value or Synchronization");

        dateofmanufactureTextWebElement.sendKeys("01/03/2024");
        Assert.assertEquals(dateofmanufactureTextWebElement.getAttribute("value"), "01/03/2024", "Mismatched: Value or Synchronization");

        Select numberofseatsListSelect = new Select(numberofseatsListWebElement);
        numberofseatsListSelect.selectByVisibleText("9");
        Assert.assertEquals(numberofseatsListWebElement.getAttribute("value"), "9", "Mismatched: Value or Synchronization");

        Select fuelListSelect = new Select(fuelListWebElement);
        fuelListSelect.selectByVisibleText("Other");
        Assert.assertEquals(fuelListWebElement.getAttribute("value"), "Other", "Mismatched: Value or Synchronization");

        payloadTextWebElement.sendKeys("123");
        Assert.assertEquals(payloadTextWebElement.getAttribute("value"), "123", "Mismatched: Value or Synchronization");

        totalweightTextWebElement.sendKeys("12312");
        Assert.assertEquals(totalweightTextWebElement.getAttribute("value"), "12312", "Mismatched: Value or Synchronization");

        listpriceTextWebElement.sendKeys("1241");
        Assert.assertEquals(listpriceTextWebElement.getAttribute("value"), "1241", "Mismatched: Value or Synchronization");

        licenseplatenumberTextWebElement.sendKeys("124");
        Assert.assertEquals(licenseplatenumberTextWebElement.getAttribute("value"), "124", "Mismatched: Value or Synchronization");

        annualmileageTextWebElement.sendKeys("12114");
        Assert.assertEquals(annualmileageTextWebElement.getAttribute("value"), "12114", "Mismatched: Value or Synchronization");

        Assert.assertTrue(nextenterinsurantdataButtonWebElement.isEnabled(), "nextenterinsurantdataButton is not clickable.");
        nextenterinsurantdataButtonWebElement.click();
    }	
}
