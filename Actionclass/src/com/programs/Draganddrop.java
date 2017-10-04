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
public class Draganddrop {
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
	
	public void demo(){
	driver.get("http://jqueryui.com/droppable/");
	WebElement e1=driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
	driver.switchTo().frame(e1);
	Actions a1=new Actions(driver);
	WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
	a1.clickAndHold(source).perform();
	a1.moveToElement(destination).perform();
	a1.release(source).perform();
	driver.quit();
	}


}
