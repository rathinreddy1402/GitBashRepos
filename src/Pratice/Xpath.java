package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//xpath by Attribute
             //htmltag[@AttributeName='AttributeValue']
	//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	//	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		
		//xpath by visibleText()
		    //htmltag[text()='AttributeValue']
	//	driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		//xpath by contains Attribute
	/*	  //htmltag[contains(@AttributeNAme,'AttributeValue')]
		driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("manager");
	driver.findElement(By.xpath("//td[contains(@id,'loginB')]")).click();
	
	Thread.sleep(1000);
	//xpath by visible text
	//driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
	
	//xpath by contains visible text
	  //htmltag[contains(text(),'AttributeValue')]
	driver.findElement(By.xpath("//a[contains(text(),'Vie')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Ap')]")).click();*/
	
		//using multipleAttribute
		driver.findElement(By.xpath("//input[@id=\"username\" and @class=\"textField\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder=\"Password\" or @name=\"pwd\"]")).sendKeys("manager");
	//driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//a[text()='View Time-Track' and @class='item']")).click();
	
	//fontsize
	WebElement ele = driver.findElement(By.xpath("//div[@class='atProductName']"));
	String size = ele.getCssValue("font-size");
	System.out.println(size);
	}

}
