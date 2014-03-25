package Selenium_Test;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Status {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr =new ChromeDriver();
		
		File file=new File("src/status.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n", filePath);
		
		dr.get(filePath);
		Thread.sleep(2000);
		
		WebElement textField=dr.findElement(By.name("user"));
		System.out.println("user isEnabled is "+textField.isEnabled());
		
        // 直接用isEnabled方法去判断该button的话返回的会是true
        // 这是因为button是使用css方法去disabled的，并不是真正的disable
        // 这时候需要判断其class里是否有disabled这值来判断其是否处于disable状态

		System.out.println("btn isEnabled is "+dr.findElement(By.className("btn")).isEnabled());
		
        // 隐藏掉textField
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).hide()", textField);
		
		// 判断其是否显示
		System.out.println("user isDisplayed is "+textField.isDisplayed());
		
		// 使用click方法选择radio
		WebElement radio=dr.findElement(By.name("radio"));
		radio.click();
		System.out.println("radion isSelected is "+radio.isSelected());
		
		try{
			dr.findElement(By.id("none"));
		}catch(NoSuchElementException e){
			System.out.println("element does not exist");
		}
		
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
		
	}

}
