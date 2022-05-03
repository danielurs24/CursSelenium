package curs2;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FindElementsExample extends BaseTest{
	
	@Test
	public void findElementsExample() {
		List<WebElement> bookList = driver.findElements(By.cssSelector("h3[class*='sc_title']"));
		System.out.println(bookList.size());
		bookList.get(2).click();
		
		
		
		String expectedUrl = "https://keybooks.ro/shop/life-in-the-garden/";
		assertEquals(expectedUrl, driver.getCurrentUrl());
	}

}
