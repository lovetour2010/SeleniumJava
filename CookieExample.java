package Selenium_Test;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieExample {

	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		
		String url="http://www.baidu.com";
		System.out.printf("now access %s \n", url);
		dr.get(url);
		Thread.sleep(1000);
		
		System.out.println(dr.manage().getCookies());
		dr.manage().deleteAllCookies();
		
		Cookie c1=new Cookie("BAIDUID","xxx");
		Cookie c2=new Cookie("BDUSS","xxx");
		
		dr.manage().addCookie(c1);
	    dr.manage().addCookie(c2);
		
		System.out.println("browser will close");
		dr.quit();
	}
}
