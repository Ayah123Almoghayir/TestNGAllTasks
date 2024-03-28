package homework2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestNGHomework2 {
  @Test
  public void f() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\zaytona\\\\Downloads\\\\geckodriver-v0.34.0-win64\\\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        FileInputStream fis= new FileInputStream(Home2Constants.Path_TestData+Home2Constants.File_TestData);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        int RowCount=sheet.getLastRowNum();
        for(int i=1; i<=RowCount;i++) {
        	String Email=sheet.getRow(i).getCell(0).getStringCellValue();
        	String Password=sheet.getRow(i).getCell(1).getStringCellValue();
        	driver.get(Home2Constants.URL);
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	WebElement signin=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[2]/div[2]/a[1]/button"));
        	signin.click();
        	WebElement email=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        	email.sendKeys(Email);
        	WebElement password=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        	password.sendKeys(Password);
        	WebElement signinbtn=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/form/div/div[6]/button"));
        	signinbtn.click();
        	
        	if(i==1) {
        		WebElement errormsg=driver.findElement(By.xpath("//*[@id=\"Email_help\"]/div"));
        		WebElement errormsg2=driver.findElement(By.xpath("//*[@id=\"Password_help\"]/div"));
        		try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		if(errormsg.isDisplayed() && errormsg2.isDisplayed())
        			System.out.println("The Test Case is Sucessed");
        		else
        			System.out.println("The Test Case is Failed");
        	}
        	else if(i==2) {
        		WebElement errormsg=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/form/div/div[4]/div[2]"));
        		try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		if(errormsg.isDisplayed())
        			System.out.println("The Test Case is Sucessed");
        		else
        			System.out.println("The Test Case is Failed");	
        	}
        	else {
        		WebElement successmsg=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[3]/div/div/a/span/img"));
    			if(successmsg.isDisplayed())
        			System.out.println("The Test Case is Sucessed");
        		else
        			System.out.println("The Test Case is Failed");		
        	}
        }
        driver.quit();
	}
  }

