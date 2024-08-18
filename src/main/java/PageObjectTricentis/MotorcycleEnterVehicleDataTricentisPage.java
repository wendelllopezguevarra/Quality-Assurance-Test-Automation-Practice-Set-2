package PageObjectTricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import AbstractComponents.AbstractComponent;

public class MotorcycleEnterVehicleDataTricentisPage extends AbstractComponent{
	
	WebDriver driver;

	public MotorcycleEnterVehicleDataTricentisPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(id = "make")
    WebElement makeListWebElement;
    
    @FindBy(id = "model")
    WebElement modelListWebElement;
    
    @FindBy(id = "cylindercapacity")
    WebElement cylindercapacityTextWebElement;

    @FindBy(id = "engineperformance")
    WebElement engineperformanceTextWebElement;

    @FindBy(id = "dateofmanufacture")
    WebElement dateofmanufactureTextWebElement;

    @FindBy(id = "numberofseatsmotorcycle")
    WebElement numberofseatsmotorcycleListWebElement;

    @FindBy(id = "listprice")
    WebElement listpriceTextWebElement;

    @FindBy(id = "annualmileage")
    WebElement annualmileageTextWebElement;

    @FindBy(id = "nextenterinsurantdata")
    WebElement nextenterinsurantdataButtonWebElement;

    public void inputMotorcycleEnterVehicleDataTricentisPage() {

        Select makeListsSelect = new Select(makeListWebElement);
        makeListsSelect.selectByVisibleText("Volvo");
        Assert.assertEquals(makeListWebElement.getAttribute("value"), "Volvo", "Mismatched: Value or Synchronization");

        Select modelListsSelect = new Select(modelListWebElement);
        modelListsSelect.selectByVisibleText("Motorcycle");
        Assert.assertEquals(modelListWebElement.getAttribute("value"), "Motorcycle", "Mismatched: Value or Synchronization");

        cylindercapacityTextWebElement.sendKeys("1241");
        Assert.assertEquals(cylindercapacityTextWebElement.getAttribute("value"), "1241", "Mismatched: Value or Synchronization");

        String engineperformanceString = "124";
        engineperformanceTextWebElement.sendKeys(engineperformanceString);
        Assert.assertEquals(engineperformanceTextWebElement.getAttribute("value"), engineperformanceString, "Mismatched: Value or Synchronization");

        dateofmanufactureTextWebElement.sendKeys("01/03/2024");
        Assert.assertEquals(dateofmanufactureTextWebElement.getAttribute("value"), "01/03/2024", "Mismatched: Value or Synchronization");

        Select numberofseatsmotorcycleListSelect = new Select(numberofseatsmotorcycleListWebElement);
        numberofseatsmotorcycleListSelect.selectByVisibleText("3");
        Assert.assertEquals(numberofseatsmotorcycleListWebElement.getAttribute("value"), "3", "Mismatched: Value or Synchronization");

        listpriceTextWebElement.sendKeys("1241");
        Assert.assertEquals(listpriceTextWebElement.getAttribute("value"), "1241", "Mismatched: Value or Synchronization");

        annualmileageTextWebElement.sendKeys("12114");
        Assert.assertEquals(annualmileageTextWebElement.getAttribute("value"), "12114", "Mismatched: Value or Synchronization");

        Assert.assertTrue(nextenterinsurantdataButtonWebElement.isEnabled(), "nextenterinsurantdataButton is not clickable.");
        nextenterinsurantdataButtonWebElement.click();
    }	
}
