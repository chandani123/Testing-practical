package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserStory8 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Basic d = new Basic();
		WebDriver driver = d.ChromeWebDriverFunction();
		
		
		driver.get("https://qa-tech-test-demo.intellihr.net/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("sara.h");
		driver.findElement(By.id("password")).sendKeys("9876-Admin-Power-Comes-With-Great-Responsibility!!!");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		WebDriverWait wait = new WebDriverWait (driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")));	
		driver.findElement(By.xpath("//body/div/div/div/div/ul[@role='tree']/li[5]/a[1]")).click();
		
		WebDriverWait wait2 = new WebDriverWait (driver, 15);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("filterControllerSearchInput")));	
		driver.findElement(By.id("filterControllerSearchInput")).sendKeys("Lyanna");
		
	
		WebDriverWait wait3 = new WebDriverWait (driver, 15);
		wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/spa/people/a51eebec-033e-42ca-ac1b-7e937bf47580']")));	
		driver.findElement(By.cssSelector("div[data-component-type='avatar_tile'] a div")).click();
		
		WebDriverWait waitJob = new WebDriverWait (driver, 15);
		 waitJob.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Job']")));
		driver.findElement(By.xpath("//a[normalize-space()='Job']")).click();

		WebDriverWait waitThomas = new WebDriverWait (driver, 15);
		waitThomas.until(ExpectedConditions.elementToBeClickable(By.linkText("Reassign Direct Reports")));
	
	     String PeopleName = driver.findElement(By.xpath("//p[normalize-space()='Thomas Mason']")).getText();
	     
	    	 System.out.println("Yes,"+PeopleName+"is shown");
	    
	     
	   driver.quit();		
	}

}