package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPage {

	
	public static WebDriver driver;
	// locator
	private By opentab = By.id("opentab");
   private By cc=By.xpath("//div[@class='cont']//span[contains(text(),'info@qaclickacademy.com')]");

	public  WindowsPage(WebDriver driver) {
		WindowsPage.driver = driver;
		}
	
	

	
	public void opentab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(opentab).click();
		
		//get parent
				String parent=driver.getWindowHandle();
				System.out.println(parent);
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> iterator=allwh.iterator();
		
		while(iterator.hasNext()) {
			String childwindow=iterator.next();
			
							
				if(!parent.equalsIgnoreCase(childwindow)) {
					driver.switchTo().window(childwindow);
					
					
					
					
						}
					}
		}
	
	public String getTextsss() {

		return driver.findElement(cc).getText();

		}
}
