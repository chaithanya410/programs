package SeleniumTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class HMS_Login_Logout_XML {
	public WebDriver driver;
	
	@Parameters ({"username", "password"})
  @Test
  public void verifylogin(String uname, String pwd) throws Exception {
		

		  driver.findElement(By.name("username")).sendKeys(uname);
		  driver.findElement(By.name("password")).sendKeys(pwd);
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh/HMS");
	  driver.manage().window().maximize();
	  
  }

}
