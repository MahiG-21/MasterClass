package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePage {
	
	
	public static WebDriver driver;
	
	@BeforeClass
			public static void setup()
			{
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().deleteAllCookies();  // delete cookies on the browser
	    driver.manage().window().maximize();
	    driver.get("https://www.wikipedia.org/");
				
				}
	@Parameters({"inputdata"})
	@Test
	public void homapge(String inputdata) throws InterruptedException
	{
		//Test Step 1: locate the textbox and enter data in the text box

		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys(inputdata);

		Thread.sleep(2000);

//Test Step 2: Locate the button and click on it
		
		driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/button")).click();
		
	    Thread.sleep(2000);	
	    
	    driver.close();
	}

}
