package tema1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homework1 {
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
	public void checkIfLoginIsDisplayed() {
		
		WebElement loginElement = driver.findElement(By.id("log"));
		WebElement passwordElement = driver.findElement(By.id("password"));
		WebElement loginButtonElement = driver.findElement(By.className("menu_user_login"));
		
		if (!loginElement.isDisplayed() && !passwordElement.isDisplayed()) {
			loginButtonElement.click();
		}
		assertTrue(loginElement.isDisplayed());
		assertTrue(passwordElement.isDisplayed());

	}
	
}
