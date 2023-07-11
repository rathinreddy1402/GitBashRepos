package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
  /*  driver.get("https://www.facebook.com/login/");
    Thread.sleep(1000);
	WebElement element = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	 Thread.sleep(1000);
	Point text = element.getLocation();
	 Thread.sleep(1000);
	System.out.println(text);
	//driver.quit();*/
    
    
    
    driver.get("https://www.facebook.com/login/");
	/*WebElement element = driver.findElement(By.xpath("//button[@id='loginbutton']"));
	String text = element.getText();
	System.out.println(text);
	//driver.quit();*/
	
	/*WebElement element = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	String fs = element.getCssValue("font-size");
	System.out.println(fs);*/
    
  /*  WebElement element = driver.findElement(By.xpath("//img[@class='_97vu img']"));
	Dimension size = element.getSize();
	int h = size.getHeight();
	int w = size.getWidth();
	System.out.println(h);
	System.out.println(w);
	*/
	
	
	

}
}
