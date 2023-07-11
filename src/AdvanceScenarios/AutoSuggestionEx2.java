package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionEx2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("puma",Keys.ENTER);
		
	/*	Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("li"));
		
		for(WebElement wb:list)
		{
			if(wb.getText().contains(" sneakers men"))
			{
				System.out.println(wb.getText());
				Thread.sleep(1000);
				wb.click();
				break;
			}
		}*/
		
		
	}

}
