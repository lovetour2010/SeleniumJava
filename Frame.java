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
		
		//�ȵ�f1�ٵ�f2
		dr.switchTo().frame("f1");
		dr.switchTo().frame("f2");
		
		//��f2�еİٶȹؼ����ı�������������
		dr.findElement(By.id("kw1")).sendKeys("watir-webdriver");
		Thread.sleep(2000);
		
		//ֱ����������frame
		dr.switchTo().defaultContent();
		
		//�ٵ�f1
		dr.switchTo().frame("f1");
		
		//���click
		dr.findElement(By.linkText("click")).click();
		Thread.sleep(2000);
		
		System.out.println("browser will close");
		dr.quit();
		
	}

}
