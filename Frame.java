package Selenium_Test;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		
		File file =new File("src/frame.html");
		String filePath="file:///"+file.getAbsolutePath();
		
		System.out.printf("now access %s \n",filePath);
		dr.get(filePath);
		Thread.sleep(1000);
		
		//先到f1再到f2
		dr.switchTo().frame("f1");
		dr.switchTo().frame("f2");
		
		//往f2中的百度关键字文本框中输入内容
		dr.findElement(By.id("kw1")).sendKeys("watir-webdriver");
		Thread.sleep(2000);
		
		//直接跳出所有frame
		dr.switchTo().defaultContent();
		
		//再到f1
		dr.switchTo().frame("f1");
		
		//点击click
		dr.findElement(By.linkText("click")).click();
		Thread.sleep(2000);
		
		System.out.println("browser will close");
		dr.quit();
		
	}

}
