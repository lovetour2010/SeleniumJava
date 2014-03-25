package Selenium_Test;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver dr=new ChromeDriver();
		File file=new File("src/wait.html");
		String filePath="file:///"+file.getAbsolutePath();
		
		System.out.printf("now access %s \n", filePath);
		dr.get(filePath);
		Thread.sleep(1000);
		
		dr.findElement(By.id("btn")).click();
		
		(new WebDriverWait(dr,10)).until(new ExpectedCondition<Boolean>(){
			
			public Boolean apply(WebDriver d){
				return d.findElement(By.className("label")).isDisplayed();
			}
		}
				);
		
		Thread.sleep(2000);
		System.out.println("browser will close");
		dr.quit();
	}

}
