package assignmenttrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Amazon 
{
	WebDriver driver;
	
           
	
	    By Search=By.id("twotabsearchtextbox");
	    By ClickforSearch=By.className("nav-search-submit");
		public Amazon(WebDriver driver)
		{
			this.driver=driver;
		}
		
        public void Search()
        {
        	
			driver.findElement(Search).sendKeys("Apple iphone xr64GB yellow");
        }
        
        public void ClickforSearch()
        {
        	
			driver.findElement(ClickforSearch).click();
			
			 //System.out.println("Successfull Search in Amajon");
        }
	
		
		
	    // System.out.println("Successfull Search in Amajon");
		
		//Thread.sleep(3000);
	}
	


