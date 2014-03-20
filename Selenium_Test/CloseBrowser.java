package Selenium_Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {
	public static void main(String[] args){
		WebDriver dr=new ChromeDriver();
		System.out.println("broswer will be closed");
		dr.quit();
		System.out.println("broswer is closed");
	}

}
