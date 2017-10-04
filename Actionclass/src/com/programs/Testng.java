package com.programs;



import java.awt.Toolkit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class Testng {
	public static WebDriver driver;
	static{
	System.setProperty("webdriver.chrome.driver","/Users/sangeetha/Downloads/chromedriver");
	ChromeOptions cOptions = new ChromeOptions();
	cOptions.addArguments("--disable-default-apps"); 
	cOptions.addArguments("disable-infobars");
	driver = new ChromeDriver(cOptions); 
	int width1 = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	int height1 = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	driver.manage().window().setPosition(new Point(0, 0));
	driver.manage().window().setSize(new Dimension(width1,height1));
	
	}
		@Test(priority=-1)
		public void first(){
		driver.get("https://www.flipkart.com/");
		}

		@Test(priority=2)
		public void second(){
        driver.get("https://www.setmore.com/");
		driver.quit();
		
		}

		@Test(priority=1)
		public void third(){
        driver.get("https://github.com/");
		}


}
