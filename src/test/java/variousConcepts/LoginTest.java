package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) {
		
	
		
		//different ways to set System Property
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		//Launch browser chrome
		WebDriver driver = new ChromeDriver();
		
		
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		//go to website
		driver.get("https://codefios.com/ebilling/login");
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//positive login
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
		
		
		
	}

}
