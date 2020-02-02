package assignmenttrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.testng.annotations.Test;

public class VerifyAmazonLogin 
{
	
	@Test(priority=1)
	public void verifyvalidlogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Amazon am=new Amazon(driver);
		am.Search();
		am.ClickforSearch();
		System.out.println("Successful Search In Amazon");
		Thread.sleep(3000);
	}
	
	@Test(priority=0)
	public void verifyvalidlogin1() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Flipkart ft=new Flipkart(driver);
		ft.Search();
		ft.ClickforSearch();
		//ft.ClickButton();
		System.out.println("Successful Search In Flipkart");
		Thread.sleep(1000);
		
	}
	
	@Test(priority=2)
	public void FinalAmazonPage() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Amazon am=new Amazon(driver);
		am.Search();
		am.ClickforSearch();
		System.out.println("Final Price In Amazon");
		
	}
	
	
	
	
	
	

}
