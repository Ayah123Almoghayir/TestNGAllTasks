package Automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Homework1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\zaytona\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://epallet.com/");
		WebElement logo= driver.findElement(By.cssSelector("#__next > header > div.styles_navbarWrapper__g5UD9.bg-grey > div > div.styles_firstContainer__NHygn > a > span > img"));
		if(logo.isDisplayed()) {
			System.out.println("Logo displayed successfully.");
		}
		else {
			System.out.println("No Logo Appears.");	
		}
		
		WebElement signinbtn=driver.findElement(By.cssSelector("#__next > header > div.styles_navbarWrapper__g5UD9.bg-grey > div > div.styles_secondContainer__uXZ1K.false > div.styles_itemsWrapper__EolXq > a:nth-child(1) > button > span"));
		signinbtn.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement welcome=driver.findElement(By.cssSelector("#__next > div.ant-row.bg-white.text-oxfordBlue.container-fluid.p-0.styles_outer-container__pWsD3.css-38819d > div.ant-col.styles_left_container__2sL9e.px-0.ant-col-xs-0.ant-col-sm-0.ant-col-md-0.ant-col-lg-10.css-38819d > div > div > div"));
		if(welcome.isDisplayed()) {
			System.out.println("Sign in Page opend successfully.");
		}
		else {
			System.out.println("Sign in Page doesn't open");	
		}
		WebElement email= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		email.sendKeys("shurooq.ghaith97@gmail.com");
		WebElement password= driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		password.sendKeys("Pal@211Fgg");
		WebElement signin= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/form/div/div[6]/button"));
		signin.click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement epalletimg= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/a/span/img"));
		epalletimg.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement profile= driver.findElement(By.xpath("/html/body/div[1]/footer/div[2]/div/div[2]/div/div[3]/ul/li[1]/a"));
		if(profile.isDisplayed()) {
			System.out.println("Sign in successfully.");
		}
		else {
			System.out.println("Didn't sign in.");	
		}
		profile.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement cancel= driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[1]/span"));
		cancel.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement dashboard=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/section/div/div/aside/div/ul/li[1]/span"));
		dashboard.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement EmailCheck=driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/section/section/main/div/div/div[2]/div[1]/div/form/div/div[2]/span/span/input"));
	   Assert.assertEquals(EmailCheck.getAttribute("value").toString(), "shurooq.ghaith97@gmail.com");
		
     driver.quit();
	}
	
	

}
