package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserStory7 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 As an authenticated user <Manager>
When I visit my profile page (left-hand side)
Then I should see a 'Job' tab
When I click on that tab
Then I should see 'Remuneration Schedule' section
Then I select "Show Content" button within the 'Remuneration Schedule' section
Verify that a salary figure is visible
		 */
		
		Basic d = new Basic();
		WebDriver driver = d.ChromeWebDriverFunction();
		
		
		driver.get("https://qa-tech-test-demo.intellihr.net/");
		driver.manage().window().maximize();
		
		//As an authenticated user <Manager>
		driver.findElement(By.id("username")).sendKeys("kieran.b");
		driver.findElement(By.id("password")).sendKeys("You-Sh4ll-Not-Pass-Th!s_P@ssword_L0tR-To-Anyone");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//When I visit my profile page (left-hand side)
		WebDriverWait waitProfile = new WebDriverWait (driver, 15);
		waitProfile.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		
		//Then I should see a 'Job' tab, When I click on that tab
		WebDriverWait waitJob = new WebDriverWait (driver, 15);
		waitJob.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Job']")));
		driver.findElement(By.xpath("//a[normalize-space()='Job']")).click();
		
		//Then I should see 'Remuneration Schedule' section
		WebDriverWait waitSchedule = new WebDriverWait (driver, 15);
		waitSchedule.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='sc-VigVT kYRcMp']")));
		WebElement remuneration_schedule = driver.findElement(By.cssSelector("span[class='sc-VigVT kYRcMp']")); 
	      ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView(true);", remuneration_schedule);
	      
	     //Then I select "Show Content" button within the 'Remuneration Schedule' section
	     driver.findElement(By.cssSelector(".sc-TOsTZ.gJqvTC._2KJdFV_f2_YV_45PNtBoTY.small.neutral")).click();
	     WebElement salary_figure = driver.findElement(By.cssSelector("div[data-component-context='job-attribute-rem-record-Annual Package'] span[class='sc-VigVT gURwwy']")); 
	      ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView(true);", salary_figure);
	      

	      // Verify that a salary figure is visible
	  
   	  if(salary_figure.isDisplayed() == true)
   	  {
   		  System.out.println("Salary Figure is  Visible");
   	  }
   	  else
   	  {
   		System.out.println("Salary Figure is not Visible");  
   	  }
		
   	  driver.quit();
	}

}