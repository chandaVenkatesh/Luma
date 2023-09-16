import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		//driver.findElement((By.linkText("Forgot your password?")),By.className("action remind")).click();
		//System.out.println(driver.findElement(By.className("action remind")).getText());
		driver.findElement(By.cssSelector(".remind")).click();
		driver.findElement(By.id("email_address")).sendKeys("chandanakv211@gmail.com");
		//driver.findElement(By.className("action submit primary")).click();
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
	}

	public class getPassword(WebDriver driver)
	{
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		driver.fi
	}
}
