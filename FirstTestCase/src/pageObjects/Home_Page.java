package pageObjects;
import org.openqa.selenium.*;

public class Home_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static WebElement lnk_MyAccount(WebDriver driver) {
		WebElement signinoption= driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[2]/div[2]/a[1]/button/span"));
		return signinoption;
	}
	public static WebElement lnk_LogOut(WebDriver driver) {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement epalletimg= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/a/span/img"));
		epalletimg.click();
		WebElement profile= driver.findElement(By.xpath("/html/body/div[1]/footer/div[2]/div/div[2]/div/div[3]/ul/li[1]/a"));
		profile.click();
		//WebElement profile2= driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[2]/div[2]/button[1]/a/div/svg"));
		//profile2.click();
		WebElement cancel= driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[1]/span"));
		cancel.click();
		WebElement logout= driver.findElement(By.xpath("//*[@id=\"root-page\"]/div/section/div/div/aside/div/ul/li[7]/span"));
		return logout;
	}

}
