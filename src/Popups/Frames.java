package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		Thread.sleep(5000);
		
		
		
	}

}
