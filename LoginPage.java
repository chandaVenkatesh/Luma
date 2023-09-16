import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\0027RA744\\Desktop\\chrome-win64\\chrome-win64");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait - 5 seconds timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		driver.findElement(By.id("email")).sendKeys("chandanakv211@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Chandana@123");
		//driver.findElement(By.id("send2")).click();
		driver.findElement(By.name("send")).click();
	//driver.findElement(By.xpath("//button[@class='action login primary']")).getText();
		
	   System.out.println(driver.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")).getText());
		
		//driver.findElement(By.cssSelector("button[class='action login primary']")).getText();
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.cssSelector("input#email_address")).sendKeys("chandhu");
		//driver.findElement(By.id("email_address")).sendKeys("chandanakv79@gmail.com");
		
		}

}
