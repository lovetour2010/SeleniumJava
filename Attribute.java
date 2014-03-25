package Selenium_Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		
		File file=new File("src/attribute.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n", filePath);
		
		dr.get(filePath);
		Thread.sleep(2000);
		
		WebElement link=dr.findElement(By.id("tooltip"));
		
//获得tooltip的内容
		System.out.println(link.getAttribute("data-original-title"));
		
//获得该链接的text
		System.out.println(link.getText());
		
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
	}

}
