package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups= {"Smoke"})
	public void personalLoan() {
		System.out.println("Good");
	}
	@BeforeTest
	public void prerequest()
	{
		System.out.println("---------------i will execute first");
	}

}
