package assignmenttrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Flipkart 
{
	WebDriver driver;
	
	By Search=By.className("LM6RPg");
	By ClickforSearch=By.className("vh79eN");
	//By ClickButton=By.className("2AkmmA29YdH8");
	//By ClickOnImagesLink=By.partialLinkText("Apple iPhone XR (Yellow, 64 GB").click();
	public Flipkart(WebDriver driver)
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
		//System.out.println("Successful Search In Flipkart");
	}
	
	/*public void ClickButton()
	{
		driver.findElement(ClickButton).click();
	}
*/
	/*public void ClickOnImagesLink()
	{
		driver.findElement(ClickOnImagesLink).click();
	}*/
		
		

		//System.out.println("Successful Search In Flipkart");
			
}


