package com.programs;

import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class Mousemove {
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
	public void testMouse() throws InterruptedException{
		driver.get("http://www.bdu.ac.in/");
		Actions a1=new Actions(driver);
		WebElement element=driver.findElement(By.linkText("Administration"));
		a1.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Syndicate")).click();
		
	}

}
