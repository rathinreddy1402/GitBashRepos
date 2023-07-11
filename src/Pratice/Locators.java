package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//Locators using id()
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//Loctors using name()
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.className("textField pwdfield")).sendKeys("manager");
	
        //driver.findElement(By.id("loginButtonContainer")).click();
		driver.findElement(By.id("loginButton")).click();
		
		//Locators using classname()
	   //driver.findElement(By.className("initial")).click();
		
		Thread.sleep(1000);
		//linkText()
		//driver.findElement(By.linkText("View Time-Track")).click();
		
		//partialLinktext()
		driver.findElement(By.partialLinkText("View Time")).click();
		
		
	}

}
