package PageObjectTricentis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AbstractComponents.AbstractComponent;

public class LandingPageTricentisPage extends AbstractComponent{
	
	WebDriver driver;
	
	public LandingPageTricentisPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@id=\"nav_automobile\"])[1]") //	@FindBy(id = "nav_automobile")
	WebElement nav_automobileButtonWebElement;
	
	@FindBy(id = "nav_truck")
	WebElement nav_truckButtonWebElement;
	
	@FindBy(id = "nav_motorcycle")
	WebElement nav_motorcycleButtonWebElement;
	
	@FindBy(id = "nav_camper")
	WebElement nav_camperButtonWebElement;
	
	public void openWebSite() throws IOException {
//		String expectedUrlString = "https://sampleapp.tricentis.com/101/#";
//		driver.get(expectedUrlString); //	driver.get("https://sampleapp.tricentis.com/101/#");
//		String actualUrlString = driver.getCurrentUrl();
//		Assert.assertEquals(actualUrlString, expectedUrlString, "Url is not loaded successfuly."); //	Assert.assertEquals(actualUrlString, "12321", "Url is not loaded successfuly.");
		
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\WELLA\\Desktop\\JAVA SELENUIM WENDELL"
				+ "\\major java folder\\ArtifactIdMaven101\\src\\main\\java\\Resources\\Global.properties");
		properties.load(fileInputStream);
		driver.get(properties.getProperty("url"));
	}
	
	public void nav_automobileButtonWebElementClick() {
		Assert.assertTrue(nav_automobileButtonWebElement.isEnabled(), "nav_automobileButton is not Clickable."); //	Assert.assertFalse(nav_automobileButtonWebElement.isEnabled(), "nav_automobileButton is Clickable." );
		nav_automobileButtonWebElement.click();
	}
	
	public void nav_truckButtonWebElementClick() {
		Assert.assertTrue(nav_truckButtonWebElement.isEnabled(), "nav_truckButton is not Clickable.");
		nav_truckButtonWebElement.click();
	}
	
	public void nav_motorcycleButtonWebElementClick() {
		Assert.assertTrue(nav_motorcycleButtonWebElement.isEnabled(), "nav_motorcycleButton is not Clickable.");
		nav_motorcycleButtonWebElement.click();
	}
	
	public void nav_camperButtonWebElementClick() {
		Assert.assertTrue(nav_camperButtonWebElement.isEnabled(), "nav_camperButton is not Clickable.");
		nav_camperButtonWebElement.click();
	}
}
