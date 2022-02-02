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
		
		
		// When I visit https://www.intellihr.com
		
		driver.get("https://qa-tech-test-demo.intellihr.net/");
		driver.manage().window().maximize();
		
		//As an authenticated user <Admin>
		driver.findElement(By.id("username")).sendKeys("sara.h");
		driver.findElement(By.id("password")).sendKeys("9876-Admin-Power-Comes-With-Great-Responsibility!!!");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//When I select People link from the left-hand side
		WebDriverWait waitLeft = new WebDriverWait (driver, 15);
		waitLeft.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")));	
		driver.findElement(By.xpath("//body/div/div/div/div/ul[@role='tree']/li[5]/a[1]")).click();
		
		//Then I should see People page
		//When I input "Lyanna" into the Search field
		WebDriverWait waitSearch = new WebDriverWait (driver, 15);
		waitSearch.until(ExpectedConditions.elementToBeClickable(By.id("filterControllerSearchInput")));	
		driver.findElement(By.id("filterControllerSearchInput")).sendKeys("Lyanna");
		
		//Then I should I see "Lyanna" as the only result, When I select "Lyanna"
		WebDriverWait waitLyanna = new WebDriverWait (driver, 15);
		waitLyanna.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/spa/people/a51eebec-033e-42ca-ac1b-7e937bf47580']")));	
		driver.findElement(By.cssSelector("div[data-component-type='avatar_tile'] a div")).click();
		
		//Then I select 'Job' tab
		WebDriverWait waitJob = new WebDriverWait (driver, 15);
		 waitJob.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Job']")));
		driver.findElement(By.xpath("//a[normalize-space()='Job']")).click();

		//Then I should 'Reporting' section
		WebDriverWait waitThomas = new WebDriverWait (driver, 15);
		waitThomas.until(ExpectedConditions.elementToBeClickable(By.linkText("Reassign Direct Reports")));
	
		//Verify that Thomas Mason is shown under 'Direct Reports'
	     String PeopleName = driver.findElement(By.xpath("//p[normalize-space()='Thomas Mason']")).getText();
	    System.out.println("Yes,"+PeopleName+"is show");
	    
	     
	   driver.quit();		
	}

}