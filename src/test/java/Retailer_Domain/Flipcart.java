package Retailer_Domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipcart {
  @Test
  public void flipcart_test() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(1500);
	  driver.close();
  }
}
