package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iFrames {

	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//a[.='Documents']")).click();
		driver.findElement(By.xpath("//img[@title='Create Document...']")).click();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("first doc");
       //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@tabindex='0']")));
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_show_borders']")).sendKeys("hi hello");

	}

}
