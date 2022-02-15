package org.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c j kevin\\eclipse-workspace\\Selenium-class-4\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.google.co.in/webhp ");
		
		
         WebElement txt = driver.findElement(By.name("q"));	
         
         Thread.sleep(5000);
		
         txt.sendKeys("Kevin");
         
         Robot r = new Robot();
         
         r.keyPress(KeyEvent.VK_DOWN);
         r.keyRelease(KeyEvent.VK_DOWN);
         
         Thread.sleep(3000);
         
         r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_ENTER);
         
         WebElement txt2 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
         
         Actions act = new Actions(driver);
         Thread.sleep(7000);
         
         act.doubleClick(txt2).perform();
         Thread.sleep(3000);
         
         act.contextClick(txt2).perform();
         
         Robot s = new Robot();
         
         
         
  for (int i = 0; i <=5; i++) {
	

         
         s.keyPress(KeyEvent.VK_DOWN);
         s.keyRelease(KeyEvent.VK_DOWN);
         Thread.sleep(2000);
  }      
  
  s.keyPress(KeyEvent.VK_ENTER);
  s.keyRelease(KeyEvent.VK_ENTER);
  Thread.sleep(2000);
  
  s.keyPress(KeyEvent.VK_CONTROL);
  s.keyPress(KeyEvent.VK_V);
  
  s.keyRelease(KeyEvent.VK_CONTROL);
  s.keyRelease(KeyEvent.VK_V);
         
      
		
		
		
	}

}
