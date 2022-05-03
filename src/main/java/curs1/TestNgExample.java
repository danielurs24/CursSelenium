package curs1;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

public class TestNgExample {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
