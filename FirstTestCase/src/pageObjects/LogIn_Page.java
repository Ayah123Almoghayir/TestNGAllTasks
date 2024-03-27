package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static WebElement txtbx_UserEmail(WebDriver driver) {
		WebElement email= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		return email;
	}
	public static WebElement txtbx_Password(WebDriver driver) {
		WebElement password= driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		return password;
	}
	public static WebElement btn_LogIn(WebDriver driver) {
		WebElement signin= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/form/div/div[6]/button"));
		return signin;
	}
}
