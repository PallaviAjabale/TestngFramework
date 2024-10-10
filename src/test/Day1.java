package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	//post request activity
	public void lastexecution() {
		System.out.println("------------------I will execute last");
	
	}

	@Test
	public void Demo() {
		System.out.println("HELLO");
		
	}

	@AfterSuite
	public void afsuite() {
		System.out.println("----------------After suite - executed");

	}

	@Test
	public void Test1() {
		System.out.println("Bye");
		Assert.assertTrue(false);
	}
}

//public static void main(String[] args) - not needed in TestNG
//if we can incorporate the TestNG framework and testNG library into test cases
//need not to depend upon the java compiler
//testNG act as java compiler

//to execute test TestNG depends upon java
//to execute TestNG need to create method first
//testNG execute all test cases in method
