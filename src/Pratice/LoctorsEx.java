package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctorsEx {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		/*WebElement data = driver.findElement(By.name("field-keywords"));
		data.sendKeys("bluetooth earbuds");
		data.submit();*/
	
		
    /*  WebElement data = driver.findElement(By.name("field-keywords"));
      data.sendKeys("bluetooth earbuds");
      data.click();*/
		
		//linktext() ex
	//driver.findElement(By.linkText("Amazon miniTV")).click();
	//driver.findElement(By.partialLinkText("Amazon m")).click();
	
	
	}

}
