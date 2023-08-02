package Retailer_Domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void TC_1234_MeeshowTC() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https:/www.meesho.com/");
	  Reporter.log("Meesho URL HIt",true);
	  driver.manage().window().maximize();
	  
	  Thread.sleep(3000);
	  driver.close();
  }
}
