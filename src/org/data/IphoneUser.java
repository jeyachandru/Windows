package org.data;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneUser {
	public static void main(String[] args) {

		System.setProperty("WebDriver.Chrome.Driver",
				"C:\\Users\\sanka\\eclipse-workspace\\WindowsHandling\\driver\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement textsearchbox = driver.findElement(By.id("twotabsearchtextbox"));
		textsearchbox.sendKeys("iphone 13 pro max",Keys.ENTER);
		
		WebElement clicktophone = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro Max 128GB Space Black']"));
		clicktophone.click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		
		for(String winid:allwindow) {
			if(!parentwindow.equals(winid)) {
				driver.switchTo().window(winid);
			}
		}
		WebElement clickaddtocart = driver.findElement(By.id("add-to-cart-button"));
		clickaddtocart.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
