import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CreateAnAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Create an Account")).click();
		System.out.println(driver.findElement(By.className("base")).getText());
		
		//personal information
		System.out.println(driver.findElement(By.xpath("//fieldset[contains(@class,'info')]/legend/span")).getText());
		
		//by regular exp bcz value is tooo big
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'firstname')]")).getText());
		
		driver.findElement(By.id("firstname")).sendKeys("chandhu");
		
		//by CssSelector
		//driver.findElement(By.cssSelector("div[class='field field-name-lastname required']")).getText();
		
		//by regular exp xpath
		driver.findElement(By.xpath("//div[contains(@class,'lastname')")).getText();		
		driver.findElement(By.id("lastname")).sendKeys("venkatesh");
		
		//Sign-In information
		driver.findElement(By.cssSelector("fieldset[data-hasrequired='* Required Fields']")).getText();
		driver.findElement(By.id("email_address")).sendKeys("chandana@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Chandh@234566");
		//have to write conditions to check the password length
		
		//need to check how to write for popup notification
		driver.findElement(By.xpath("//div[@class='password-very-strong']")).getText();
		
		driver.findElement(By.id("password-confirmation")).sendKeys("Chandh@234566");
		//Assert.assertEquals(driver.findElement(By.id("password")).sendKeys("Chandh@234566"),By.id(("password-confirmation")).sendKeys("Chandh@234566"));
		driver.findElement(By.className("submit")).click();	
		
		
		

	}
}
