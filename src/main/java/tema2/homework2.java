package tema2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homework2 {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");
	}
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	
	@Test
	public void findTheBook() throws InterruptedException {
		List<WebElement> categoryList = driver.findElements(By.cssSelector("li[class*='sc_tabs_title']"));
		List<WebElement> booksList = driver.findElements(By.cssSelector("div[class*='columns_wrap'] h3[class*='sc_title']"));
		int counter = 0;
		for(WebElement categ : categoryList) {
			categ.click();
			counter++;
			System.out.println(counter);
			for(WebElement book : booksList) {
				if(book.getText().contains("The forest") && book.isDisplayed()) {
					System.out.println("Cartea este vizibila");
					if(counter == categoryList.size())
					{
						book.click();
						//System.out.println(driver.getCurrentUrl().contains("keybooks.ro/shop/the-forest/"));
						assertTrue(driver.getCurrentUrl().contains("keybooks.ro/shop/the-forest/"));
						break;
					}
				}
				
			}
				Thread.sleep(2000);
		}
	}
}
