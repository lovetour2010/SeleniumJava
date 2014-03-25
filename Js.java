package Selenium_Test;

import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr =new ChromeDriver();
		File file=new File("src/js.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n", filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
		
		//在页面上直接执行js
		((JavascriptExecutor)dr).executeScript("$('#tooltip').fadeOut();");
		Thread.sleep(1000);
		
		//在已经定位的元素上执行js
		WebElement button=dr.findElement(By.className("btn"));
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut;",button);
		Thread.sleep(2000);
		
		System.out.println("browser will close");
		dr.quit();
	}
}
