package webtesting1pck;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtesting1clb {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();

		//Applied wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();

		//open browser with desried URL
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		//input email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("babarahmat@gmail.com");
		
		//input password
		WebElement passkey = driver.findElement(By.id("passwd"));
		passkey.sendKeys("babatestingweb123");
		
		//click sign in
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		
		String actualUrl="http://automationpractice.com/index.php?controller=my-account";
		String expectedUrl= driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl);

		//closing the browser
		driver.close();
		
	}
}
