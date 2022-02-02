package test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserStory7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Basic d = new Basic();
		WebDriver driver = d.ChromeWebDriverFunction();
		
		
		driver.get("https://qa-tech-test-demo.intellihr.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("kieran.b");
		driver.findElement(By.id("password")).sendKeys("You-Sh4ll-Not-Pass-Th!s_P@ssword_L0tR-To-Anyone");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		WebDriverWait wait = new WebDriverWait (driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")));
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		  
		WebDriverWait waitJob = new WebDriverWait (driver, 15);
		 waitJob.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Job']")));
		
		driver.findElement(By.xpath("//a[normalize-space()='Job']")).click();
		
		WebDriverWait wait2 = new WebDriverWait (driver, 15);
		 wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='sc-VigVT kYRcMp']")));
		 
		WebElement remuneration_schedule = driver.findElement(By.cssSelector("span[class='sc-VigVT kYRcMp']")); 
	      ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView(true);", remuneration_schedule);
	      
	      
	     driver.findElement(By.cssSelector(".sc-TOsTZ.gJqvTC._2KJdFV_f2_YV_45PNtBoTY.small.neutral")).click();

	     WebElement salary_figure = driver.findElement(By.cssSelector("div[data-component-context='job-attribute-rem-record-Annual Package'] span[class='sc-VigVT gURwwy']")); 
	      ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView(true);", salary_figure);
	      

	      // Verify 'Download now' button is visible
	  
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