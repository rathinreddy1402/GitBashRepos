package AdvanceScenarios;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("li"));
		
		for(WebElement wb:list)
		{
			if(wb.getText().contains("m testing"))
			{
				System.out.println(wb.getText());
				Thread.sleep(1000);
				wb.click();
				break;
			}
		}
		
		//svg Example
		//driver.findElement(By.xpath("//*[name()='svg' and @class='gb_1e']")).click();
	}

}
