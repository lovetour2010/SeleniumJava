package Selenium_Test;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		
		File file=new File("src/upload_file.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n", filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
		
		File file2=new File("src/navs.html");
		String filePath2=file2.getAbsolutePath();
		
		dr.findElement(By.cssSelector("input[type=file]")).sendKeys(filePath2);
		Thread.sleep(2000);
		
		System.out.println("browser will close");
		dr.quit();
	}

}
