package SeleniumTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class GoogleLanguages_PM {
	public WebDriver driver;
	public void clicklinks(String str) {
		driver.findElement(By.xpath(str)).click();
		driver.findElement(By.linkText("English")).click();
		
	}
  @Test
  public void GoogleLanguages() {
	  clicklinks(".//*[@id='SIvCob']/a[1]"); //Hindi
	  clicklinks(".//*[@id='SIvCob']/a[2]"); //Bengali
	  clicklinks(".//*[@id='SIvCob']/a[3]"); //Telugu
	  clicklinks(".//*[@id='SIvCob']/a[4]"); // Marathi
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
	  
  }

}
