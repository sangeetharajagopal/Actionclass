package com.programs;

import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
@Test
public class SendClear {
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
	
	public void sendKeysClear() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		WebElement e1=driver.findElement(By.xpath("//input[@name='email']"));
		e1.sendKeys("sangeetha.gopal@a-cti.com");
		Thread.sleep(2000);
		e1.clear();
		e1.sendKeys("sangee");
		Thread.sleep(2000);
		e1.clear();
		e1.sendKeys("sangeetha.gopal");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sangeetha"); 
//		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	}

}
