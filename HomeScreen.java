import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//implicit wait for default welcome msg
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		
		System.out.println(driver.findElement(By.cssSelector(".demo")).getText());
		
			
        driver.findElement(By.linkText("Sign In")).getText();
        
        //u can use click for below
		driver.findElement(By.linkText("Create an Account"));
		
         driver.findElements(By.xpath("//image[@src='https://magento.softwaretestingboard.com/pub/static/version1678540400/frontend/Magento/luma/en_US/images/logo.svg']"));
         
         driver.findElement(By.id("search")).sendKeys("pants");
         //cart need to be defined
         
		
		System.out.print(driver.findElement(By.xpath("//div[@class='sections nav-sections']")).getText());
		 
		 System.out.println(driver.findElement(By.id("ui-id-4")).getText());
		 System.out.println(driver.findElement(By.id("ui-id-5")).getText());
		 System.out.println(driver.findElement(By.id("ui-id-6")).getText());
		 System.out.println(driver.findElement(By.id("ui-id-7")).getText());
		 System.out.println(driver.findElement(By.id("ui-id-8")).getText());
		 //driver.close();
		 
		 driver.findElement(By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/media/wysiwyg/home/home-main.jpg']")).click();
	}
}
