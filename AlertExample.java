package Selenium_Test;

import java.io.File;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertExample {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		File file=new File("src/alert.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n", filePath);
		dr.get(filePath);
		Thread.sleep(1000);
		
		dr.findElement(By.id("tooltip")).click();
		Thread.sleep(2000);
		
		Alert alert=dr.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		System.out.println("browser will close");
		dr.quit();
		
	}

}
