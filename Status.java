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
		
        // ֱ����isEnabled����ȥ�жϸ�button�Ļ����صĻ���true
        // ������Ϊbutton��ʹ��css����ȥdisabled�ģ�������������disable
        // ��ʱ����Ҫ�ж���class���Ƿ���disabled��ֵ���ж����Ƿ���disable״̬

		System.out.println("btn isEnabled is "+dr.findElement(By.className("btn")).isEnabled());
		
        // ���ص�textField
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).hide()", textField);
		
		// �ж����Ƿ���ʾ
		System.out.println("user isDisplayed is "+textField.isDisplayed());
		
		// ʹ��click����ѡ��radio
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
