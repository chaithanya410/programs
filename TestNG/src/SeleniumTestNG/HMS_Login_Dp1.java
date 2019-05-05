package SeleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Login_Dp1 {
	public WebDriver driver;
	
	
	 @Test(dataProvider = "Authentication")

	  public void verifyLogin(String uname,String pwd) throws Exception{

		  driver.findElement(By.name("username")).sendKeys(uname);
		  driver.findElement(By.name("password")).sendKeys(pwd);
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(5000);
		  
	  }

	  @DataProvider(name="Authentication")
	  public Object[][] credentials() {
	    return new Object[][] {{"admin","admin"},{"user","user"},{"admin","admin"}};
	    
	    }
	     
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver=new FirefoxDriver();
		  driver.get("http://seleniumbymahesh/HMS");
		  driver.manage().window().maximize();
		  
	  }

	}