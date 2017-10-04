package com.programs;

import java.awt.Toolkit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Priorityinvocation {
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
	@Test(priority=2,invocationCount=4, invocationTimeOut=3000)
	public void run() throws InterruptedException{
		Thread.sleep(2000);
		driver.get("https://www.yocoboard.com/");
		
		
	}
	@Test(priority=1,invocationCount=2)
	public void nextRun(){
		driver.get("https://www.jabong.com/");
	}

}
