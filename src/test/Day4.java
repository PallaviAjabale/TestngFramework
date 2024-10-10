package test;

import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void webloginHomeLoan() {
		// write Selenium code
		System.out.println("Web Login Home");

	}

	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLoan() {
		// Appium
		System.out.println("Mobile login Home loan");
	}

	@Test
	public void LoginAPIHomeLoan() {
		// REST API Code
		System.out.println("API login Home Loan");
	}
}
