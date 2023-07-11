package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassEx {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
		//selectByIndex
		WebElement daylist = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		Select sel=new Select(daylist);
		sel.selectByIndex(10);//0
		//sel.selectByValue("20");
		
		//selectByValue
		WebElement monthList = driver.findElement(By.id("month"));
		Select sele=new Select(monthList);
	//	sele.selectByValue("9");
		sele.selectByVisibleText("Oct");
		
		//SelectByVisibleText
		WebElement yearlist = driver.findElement(By.id("year"));
		Select selec=new Select(yearlist);
		selec.selectByVisibleText("2018");
	}

}
