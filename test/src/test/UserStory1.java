package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserStory1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		/*
As an anonymous User
When I visit https://www.intellihr.com
Then I should see the intelliHR public homepage
Verify intelliHR logo is visible
When I scroll to the bottom and select 'Case Studies'
Then I should see multiple Case Studies
When I select 'Fujitsu General'
Then I should see a Case Study for Fujitsu
Verify 'Download now' button is visible
		 */
		
		Basic d = new Basic();
		WebDriver driver = d.ChromeWebDriverFunction();
		
		
		
		// When I visit https://www.intellihr.com
		
		driver.get("https://www.intellihr.com");
		driver.manage().window().maximize();
		
		// Verify intelliHR logo is visible
		
		WebElement logoPresent = driver.findElement(By.cssSelector("img[class='header-logo-img header-logo-img-normal active']"));		
	    Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", logoPresent);
	      if (p) {
	         System.out.println("inteliHR Logo is present");
	      } else {
	         System.out.println("inteliHR Logo not present");
	      }
	      
	      
	      // When I scroll to the bottom and select 'Case Studies'
	      
	      WebElement case_study = driver.findElement(By.cssSelector("a[href='https://intellihr.com/case-studies']")); 
	      ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView(true);", case_study);
	      Thread.sleep(1000);
	      
	      driver.findElement(By.cssSelector("a[href='https://intellihr.com/case-studies']")).click();
	      
	      
	      // Then I should see multiple Case Studies
	      //When I select 'Fujitsu General'
	      
	      WebElement fujitsu_general = driver.findElement(By.cssSelector("a[href='https://intellihr.com/case-studies/fujitsu-general']")); 
	      ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView(true);", fujitsu_general);
	      Thread.sleep(1000);
	      
	      driver.findElement(By.cssSelector("a[href='https://intellihr.com/case-studies/fujitsu-general']")).click();
	      
	      
	      // Then I should see a Case Study for Fujitsu
	     
	      
	      WebElement downloadNow_button = driver.findElement(By.cssSelector("form[id='mktoForm_1136'] button[type='submit']")); 
	      ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView(true);", downloadNow_button);
	      

	      // Verify 'Download now' button is visible
	      
    	  if(downloadNow_button.isDisplayed() == true)
    	  {
    		  System.out.println("Download Now button is present");
    	  }
    	  
    	  driver.quit();
	      
	}


}

