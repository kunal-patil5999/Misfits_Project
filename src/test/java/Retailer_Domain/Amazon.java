package Retailer_Domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazon_test() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  Thread.sleep(1500);
	  driver.close();
  }
}
