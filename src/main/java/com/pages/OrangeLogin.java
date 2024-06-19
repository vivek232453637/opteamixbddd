package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeLogin {
	
	public static  WebDriver driver;
	
	// locators 

		private By usernm = By.xpath("//input[@name = 'username']");

		private By password = By.xpath("//input[@name = 'password']");

		private By login = By.xpath("//button[@type = 'submit']");
		
		
		public OrangeLogin(WebDriver driver) {

			this.driver = driver;

			}
		

		public void enterUserName(String username) throws InterruptedException {

		Thread.sleep(4000);

		driver.findElement(usernm).sendKeys(username);

		}
		
		
		public void enterPassword(String pwd) throws InterruptedException {

			Thread.sleep(4000);

			driver.findElement(password).sendKeys(pwd);

			}
		
		
		public void clickOnLogin() {

			driver.findElement(login).click();

			}


}
