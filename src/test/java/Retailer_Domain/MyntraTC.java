package Retailer_Domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyntraTC {
  @Test
  public void TC_1234_MyntraTS() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https:/www.myntra.com/");
	  Reporter.log("Myntra TS",true);
	  driver.manage().window().maximize();
	  
	  
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
