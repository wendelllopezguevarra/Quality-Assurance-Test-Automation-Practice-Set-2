package TestCases;

import org.testng.annotations.Test;

import BaseTest.BaseTestTricentis;

public class TricentisRegistrationPositiveFlowTestCase extends BaseTestTricentis{
	@Test
	public void testRegistrationPositiveFlow() throws InterruptedException {

		landingPageTricentisPage.nav_automobileButtonWebElementClick();
		
		automobileEnterVehicleDataTricentisPage.inputAutomobileEnterVehicleDataTricentisPage();
		automobileEnterInsurantDataTricentisPage.inputAutomobileEnterInsurantDataTricentisPage();
		automobileEnterProductDataTricentisPage.inputAutomobileEnterProductDataTricentisPage();
		automobileSelectPriceOptionTricentisPage.inputAutomobileSelectPriceOptionTricentisPage();
		automobileSendQuoteTricentisPage.inputAutomobileSendQuoteTricentisPage();
		
		landingPageTricentisPage.nav_truckButtonWebElementClick();
		
		truckEnterVehicleDataTricentisPage.inputTruckEnterVehicleDataTricentisPage();
		truckEnterInsurantDataTricentisPage.inputTruckEnterInsurantDataTricentisPage();
		truckEnterProductDataTricentisPage.inputTruckEnterProductDataTricentisPage();
		truckSelectPriceOptionTricentisPage.inputTruckSelectPriceOptionTricentisPage();
		truckSendQuoteTricentisPage.inputTruckSendQuoteTricentisPage();
		
		landingPageTricentisPage.nav_motorcycleButtonWebElementClick();
		
		motorcycleEnterVehicleDataTricentisPage.inputMotorcycleEnterVehicleDataTricentisPage();
		motorcycleEnterInsurantDataTricentisPage.inputMotorcycleEnterInsurantDataTricentisPage();
		motorcycleEnterProductDataTricentisPage.inputMotorcycleEnterProductDataTricentisPage();
		motorcycleSelectPriceOptionTricentisPage.inputMotorcycleSelectPriceOptionTricentisPage();
		motorcycleSendQuoteTricentisPage.inputMotorcycleSendQuoteTricentisPage();
		
		landingPageTricentisPage.nav_camperButtonWebElementClick();
		
		camperEnterVehicleDataTricentisPage.inputCamperEnterVehicleDataTricentisPage();
		camperEnterInsurantDataTricentisPage.inputCamperEnterInsurantDataTricentisPage();
		camperEnterProductDataTricentisPage.inputCamperEnterProductDataTricentisPage();
		camperSelectPriceOptionTricentisPage.inputCamperSelectPriceOptionTricentisPage();
		camperSendQuoteTricentisPage.inputCamperSendQuoteTricentisPage();

		System.out.println("SELENIUM AUTOMATION entered testRegistrationPositiveFlow..");
	}
	
}
