package Automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\zaytona\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.petermillar.com/");
      WebElement logo=driver.findElement(By.xpath("/html/body/div[2]/header/nav/div[1]/div/div/div/div[2]/a/div[1]"));
      if (logo.isDisplayed()) {
          System.out.println("Logo is displayed.");
      } else {
          System.out.println("Logo is not displayed.");
      }
     WebElement my_account=driver.findElement(By.xpath("/html/body/div[2]/header/nav/div[1]/div/div/div/div[3]/ul/li/a/span[1]"));
     if (my_account.isDisplayed()) {
         System.out.println("My Account is displayed.");
     } else {
         System.out.println("My Account is not displayed.");
     }
     WebElement cart=driver.findElement(By.xpath("/html/body/div[2]/header/nav/div[1]/div/div/div/div[3]/div[3]/div[1]/a/span[1]"));
     if (cart.isDisplayed()) {
         System.out.println("Cart is displayed.");
     } else {
         System.out.println("Cart is not displayed.");
     }
     my_account.click();
     WebElement loginFormTitle = driver.findElement(By.id("loginTabHeader"));
     if(loginFormTitle.getText().equals("Returning Customers")) {
    	 System.out.println("Correct login title is displayed."); 
     }
     else {
    	 System.out.println("Correct login title is not displayed."); 
     }
     WebElement emailInput = driver.findElement(By.id("login-form-email"));
     emailInput.sendKeys("shurooq.ghaith97@gmail.com");
     WebElement passwordInput = driver.findElement(By.id("login-form-password"));
     passwordInput.sendKeys("Test@1234");

     WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/button"));
     loginButton.click();
     
     
     WebElement accountNavigationLink = driver.findElement(By.xpath("/html/body/div[2]/header/nav/div[1]/div/div/div/div[3]/ul/li/a/span[1]"));
     if (accountNavigationLink.isDisplayed()) {
         accountNavigationLink.click();
     } else {
         System.out.println("User is not logged in successfully.");
     }
     
     WebElement signout = driver.findElement(By.xpath("/html/body/div[2]/header/nav/div[1]/div/div/div/div[3]/ul/li/ul/li[3]/a"));
     if (signout.isDisplayed()) {
         System.out.println("User is logged in successfully.");
  
     } else {
         System.out.println("User is not logged in successfully.");
     }
     
      driver.quit();
	}

}
