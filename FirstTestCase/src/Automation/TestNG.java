package Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNG {
	public String baseUrl = "https://www.itgsoftware.com/quality-assurance";
    String driverPath = "C:\\Users\\zaytona\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe";
    public WebDriver driver ; 

  @Test
  public void f() {
      System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver",       driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Quality Assurance";
      String actualTitle = driver.findElement(By.cssSelector(".quality-assurance-header>h3")).toString();
      Assert.assertEquals(actualTitle, expectedTitle,"Actual: " +actualTitle );
      driver.close();

  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
