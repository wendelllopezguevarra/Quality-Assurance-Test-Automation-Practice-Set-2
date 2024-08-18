package PageObjectTricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AbstractComponents.AbstractComponent;

public class CamperSendQuoteTricentisPage extends AbstractComponent{

	WebDriver driver;
	
	public CamperSendQuoteTricentisPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id = "email")
	    WebElement emailTextWebElement;

	    @FindBy(id = "phone")
	    WebElement phoneTextWebElement;

	    @FindBy(id = "username")
	    WebElement usernameTextWebElement;

	    @FindBy(id = "password")
	    WebElement passwordTextWebElement;

	    @FindBy(id = "confirmpassword")
	    WebElement confirmpasswordTextWebElement;

	    @FindBy(id = "Comments")
	    WebElement CommentsTextWebElement;

	    @FindBy(id = "sendemail")
	    WebElement sendemailButtonWebElement;

	    @FindBy(xpath = "/html/body/div[4]/div[7]/div/button")
	    WebElement confirmButtonWebElement;

	    @FindBy(xpath = "/html/body/div[4]/h2")
	    WebElement sendingemailsuccessWebElement;

	    @FindBy(id = "nav_truck")
	    WebElement nav_truckButtonWebElement;

	    public void inputCamperSendQuoteTricentisPage() {

	        emailTextWebElement.sendKeys("asdasa@gmail.com");
	        Assert.assertEquals(emailTextWebElement.getAttribute("value"), "asdasa@gmail.com", "Mismatched: Value or Synchronization");

	        phoneTextWebElement.sendKeys("13213145");
	        Assert.assertEquals(phoneTextWebElement.getAttribute("value"), "13213145", "Mismatched: Value or Synchronization");

	        usernameTextWebElement.sendKeys("sdad");
	        Assert.assertEquals(usernameTextWebElement.getAttribute("value"), "sdad", "Mismatched: Value or Synchronization");

	        passwordTextWebElement.sendKeys("Wendell21");
	        Assert.assertEquals(passwordTextWebElement.getAttribute("value"), "Wendell21", "Mismatched: Value or Synchronization");

	        confirmpasswordTextWebElement.sendKeys("Wendell21");
	        Assert.assertEquals(confirmpasswordTextWebElement.getAttribute("value"), "Wendell21", "Mismatched: Value or Synchronization");

	        CommentsTextWebElement.sendKeys("Wendell21");
	        Assert.assertEquals(CommentsTextWebElement.getAttribute("value"), "Wendell21", "Mismatched: Value or Synchronization");

	        Assert.assertTrue(sendemailButtonWebElement.isEnabled(), "sendemailButton is not clickable.");
	        sendemailButtonWebElement.click();

	        Assert.assertEquals(sendingemailsuccessWebElement.getText(), "Sending e-mail success!", "Mismatched: Value or Synchronization");
	        Assert.assertTrue(confirmButtonWebElement.isEnabled(), "confirmButton is not clickable.");
	        confirmButtonWebElement.click();
	        
			System.out.println("SELENIUM AUTOMATION entered inputCamperSendQuoteTricentisPage..");
	    }
}
