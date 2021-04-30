package project101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testcase1 {

	@BeforeTest
	public void getDriver()

	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	@Test
	public void nowClick() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();

	}
	
	@Test
	public void nowClick2() {
		
		System.out.println("Passed");

	}
	
	@AfterTest
	public void closing() {
		
		WebDriver driver = new ChromeDriver();
		driver.quit();
		
	}

}
