package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageObjectTricentis.AutomobileEnterInsurantDataTricentisPage;
import PageObjectTricentis.AutomobileEnterProductDataTricentisPage;
import PageObjectTricentis.AutomobileEnterVehicleDataTricentisPage;
import PageObjectTricentis.AutomobileSelectPriceOptionTricentisPage;
import PageObjectTricentis.AutomobileSendQuoteTricentisPage;
import PageObjectTricentis.CamperEnterInsurantDataTricentisPage;
import PageObjectTricentis.CamperEnterProductDataTricentisPage;
import PageObjectTricentis.CamperEnterVehicleDataTricentisPage;
import PageObjectTricentis.CamperSelectPriceOptionTricentisPage;
import PageObjectTricentis.CamperSendQuoteTricentisPage;
import PageObjectTricentis.LandingPageTricentisPage;
import PageObjectTricentis.MotorcycleEnterInsurantDataTricentisPage;
import PageObjectTricentis.MotorcycleEnterProductDataTricentisPage;
import PageObjectTricentis.MotorcycleEnterVehicleDataTricentisPage;
import PageObjectTricentis.MotorcycleSelectPriceOptionTricentisPage;
import PageObjectTricentis.MotorcycleSendQuoteTricentisPage;
import PageObjectTricentis.TruckEnterInsurantDataTricentisPage;
import PageObjectTricentis.TruckEnterProductDataTricentisPage;
import PageObjectTricentis.TruckEnterVehicleDataTricentisPage;
import PageObjectTricentis.TruckSelectPriceOptionTricentisPage;
import PageObjectTricentis.TruckSendQuoteTricentisPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestTricentis {

	public LandingPageTricentisPage landingPageTricentisPage;
	
	public AutomobileEnterVehicleDataTricentisPage automobileEnterVehicleDataTricentisPage;
	public AutomobileEnterInsurantDataTricentisPage automobileEnterInsurantDataTricentisPage;
	public AutomobileEnterProductDataTricentisPage automobileEnterProductDataTricentisPage;
	public AutomobileSelectPriceOptionTricentisPage automobileSelectPriceOptionTricentisPage;
	public AutomobileSendQuoteTricentisPage automobileSendQuoteTricentisPage;
	
	public TruckEnterVehicleDataTricentisPage truckEnterVehicleDataTricentisPage;
	public TruckEnterInsurantDataTricentisPage truckEnterInsurantDataTricentisPage;
	public TruckEnterProductDataTricentisPage truckEnterProductDataTricentisPage;
	public TruckSelectPriceOptionTricentisPage truckSelectPriceOptionTricentisPage;
	public TruckSendQuoteTricentisPage truckSendQuoteTricentisPage;
	
	public MotorcycleEnterVehicleDataTricentisPage motorcycleEnterVehicleDataTricentisPage;
	public MotorcycleEnterInsurantDataTricentisPage motorcycleEnterInsurantDataTricentisPage;
	public MotorcycleEnterProductDataTricentisPage motorcycleEnterProductDataTricentisPage;
	public MotorcycleSelectPriceOptionTricentisPage motorcycleSelectPriceOptionTricentisPage;
	public MotorcycleSendQuoteTricentisPage motorcycleSendQuoteTricentisPage;

	public CamperEnterVehicleDataTricentisPage camperEnterVehicleDataTricentisPage;
	public CamperEnterInsurantDataTricentisPage camperEnterInsurantDataTricentisPage;
	public CamperEnterProductDataTricentisPage camperEnterProductDataTricentisPage;
	public CamperSelectPriceOptionTricentisPage camperSelectPriceOptionTricentisPage;
	public CamperSendQuoteTricentisPage camperSendQuoteTricentisPage;
	
	public static WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\WELLA\\Desktop\\JAVA SELENUIM WENDELL"
				+ "\\major java folder\\ArtifactIdMaven101\\src\\main\\java\\Resources\\Global.properties");
		properties.load(fileInputStream);
		String browser = properties.getProperty("browser");
		String chromeDriverVersion = properties.getProperty("chromeDriverVersion");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().browserVersion(chromeDriverVersion).setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {

		} else if (browser.equalsIgnoreCase("edge")) {

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		return driver;
	}

	@BeforeMethod
	public void openBrowser() throws IOException { // Dito bubuksan ang browser at pupunta sa website
		driver = initializeDriver();

		landingPageTricentisPage = new LandingPageTricentisPage(driver);
		
		automobileEnterVehicleDataTricentisPage = new AutomobileEnterVehicleDataTricentisPage(driver);
		automobileEnterInsurantDataTricentisPage = new AutomobileEnterInsurantDataTricentisPage(driver);
		automobileEnterProductDataTricentisPage = new AutomobileEnterProductDataTricentisPage(driver);
		automobileSelectPriceOptionTricentisPage = new AutomobileSelectPriceOptionTricentisPage(driver);
		automobileSendQuoteTricentisPage = new AutomobileSendQuoteTricentisPage(driver);

		truckEnterVehicleDataTricentisPage = new TruckEnterVehicleDataTricentisPage(driver);
		truckEnterInsurantDataTricentisPage = new TruckEnterInsurantDataTricentisPage(driver);
		truckEnterProductDataTricentisPage = new TruckEnterProductDataTricentisPage(driver);
		truckSelectPriceOptionTricentisPage = new TruckSelectPriceOptionTricentisPage(driver);
		truckSendQuoteTricentisPage = new TruckSendQuoteTricentisPage(driver);
		
		motorcycleEnterVehicleDataTricentisPage = new MotorcycleEnterVehicleDataTricentisPage(driver);
		motorcycleEnterInsurantDataTricentisPage = new MotorcycleEnterInsurantDataTricentisPage(driver);
		motorcycleEnterProductDataTricentisPage = new MotorcycleEnterProductDataTricentisPage(driver);
		motorcycleSelectPriceOptionTricentisPage = new MotorcycleSelectPriceOptionTricentisPage(driver);
		motorcycleSendQuoteTricentisPage = new MotorcycleSendQuoteTricentisPage(driver);
		
		camperEnterVehicleDataTricentisPage = new CamperEnterVehicleDataTricentisPage(driver);
		camperEnterInsurantDataTricentisPage = new CamperEnterInsurantDataTricentisPage(driver);
		camperEnterProductDataTricentisPage = new CamperEnterProductDataTricentisPage(driver);
		camperSelectPriceOptionTricentisPage = new CamperSelectPriceOptionTricentisPage(driver);
		camperSendQuoteTricentisPage = new CamperSendQuoteTricentisPage(driver);
		
		landingPageTricentisPage.openWebSite();

		System.out.println("SELENIUM AUTOMATION entered @BeforeMethod openBroser method..");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("SELENIUM AUTOMATION entered @AfterMethod closeBroser method..");
	}

}
