package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public   WebDriver ChromeWebDriverFunction()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/chandanibhalala/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver();
		return driver;
	}


}
