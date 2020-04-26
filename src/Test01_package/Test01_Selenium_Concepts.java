package Test01_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01_Selenium_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //System.setProperty("webdriver.chrome.driver","C:\\Users\\Sujay\\Desktop\\SeleniumDrivers\\chromedriver.exe");
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sujay\\eclipse-workspace\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.google.com");
  //WebElement searchbox = driver.findElement(By.name("q"));
 // searchbox.sendKeys("Corona");
 // searchbox.submit();
  driver.manage().window().maximize();
  WebElement gm = driver.findElement(By.partialLinkText("Ima"));
   gm.click();
  //driver.navigate().back();
 // driver.navigate().forward();
 //driver.navigate().refresh();
  
 //driver.quit();

  
  
		  
	}

}
