package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("-------------------- before class - executed");
	}

	@Parameters({ "URL", "APIKey/Username" })
	// it will check alphabetical order
	@Test
	public void weblogincarLoan(String urlName, String key) {
		// write selenium code
		System.out.println("Web Login Car");
		System.out.println(urlName);
		System.out.println(key);

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("--------------------before method executed");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("--------------------after method executed");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("-------------------After class - executed");
	}

	@Test(groups = { "Smoke" })
	public void mobileLogincarLoan() {
		// Appium
		System.out.println("Mobile login car loan");
	}

	@BeforeSuite
	public void bfSuite() {
		System.out.println("--------------------test before suite");
	}

	@Test(enabled = true)
	public void mobileSignINcarLoan() {
		// Appium
		System.out.println("Mobile Sign IN car loan");
	}

	@Test(dataProvider = "getData")
	// (timeOut=4000)
	public void mobileSignOUTcarLoan(String username, String password) {
		// Appium
		System.out.println("Mobile Sign Out car loan");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods = { "weblogincarLoan", "mobileSignOUTcarLoan" })
	public void APILoginCarLoan() {
		// REST API Code
		System.out.println("API login car Loan");
	}

	@DataProvider
	public Object[][] getData() {
		// 1st combination - username and password - having good credit history
		// 2nd - another user name and password - with no credit history
		// 3rd - fraudelent credit history

		// define multidimanetional array
		Object[][] data = new Object[3][2];

		// fill the 1st row - 1st set
		data[0][0] = "FirstSetUserName";
		data[0][1] = "FirstSetPassword";

		// column in the row are nothing but values for that particular combination(row)

		// 2nd set
		data[1][0] = "SecondSetUserName";
		data[1][1] = "SecondPassword";

		// 3rd set
		data[2][0] = "ThirdSetUserName";
		data[2][1] = "ThirdPassword";

		// trigger mobileSignOUTcarLoan test case with 1st data then 2nd and 3rd

		return data;

	}

}
