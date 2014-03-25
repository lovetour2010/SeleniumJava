package Selenium_Test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navs {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		File file=new File("src/navs.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n", filePath);
		
		dr.get(filePath);
		Thread.sleep(2000);
		
//  方法一：层级定位，先定位ul再定位li
		dr.findElement(By.className("nav")).findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		
//  方法二：直接定位link
		dr.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		
		System.out.println("browse will be close");
		dr.quit();
	}

}
