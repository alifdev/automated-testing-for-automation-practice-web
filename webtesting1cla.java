package webtesting1pck;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;

public class webtesting1cla {
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
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("babarahmat@gmail.com");
		
		//click login
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		
		//YOUR PERSONAL INFORMATION
	
		//select title
		WebElement title1 = driver.findElement(By.id("id_gender1"));
		title1.click();
		
		//input first name
		WebElement custFirstName = driver.findElement(By.id("customer_firstname"));
		custFirstName.sendKeys("Baba");
		
		//input last name
		WebElement custLastName = driver.findElement(By.id("customer_lastname"));
		custLastName.sendKeys("Rahmat");
		
		//input password
		WebElement custPassword = driver.findElement(By.id("passwd"));
		custPassword.sendKeys("babatestingweb123");
		
		//select day
		Select dd = new Select(driver.findElement(By.id("days")));
		dd.selectByIndex(1);
		
		//select month
		Select mm = new Select(driver.findElement(By.id("months")));
		mm.selectByIndex(2);
		
		//select year
		Select yy = new Select(driver.findElement(By.id("years")));
		yy.selectByIndex(3);
		
		//select newsletter
		WebElement newsletter = driver.findElement(By.id("newsletter"));
		newsletter.click();
		
		//YOUR ADDRESS
		
		//input company
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Testing");
		
		//input address
		WebElement adrs1 = driver.findElement(By.id("address1"));
		adrs1.sendKeys("Testing Street no. 158");
		
		//input city
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("New York");
		
		//select state
		new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Alabama");
		
		//input postal code
		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("15151");
		
		//select country
		new Select(driver.findElement(By.id("id_country"))).selectByVisibleText("United States");
		
		//input mobile phone
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		mobile.sendKeys("089677554499");
		
		//click register
		WebElement regis = driver.findElement(By.id("submitAccount"));
		regis.click();
		
		String actualUrl="http://automationpractice.com/index.php?controller=my-account";
		String expectedUrl= driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl);

		//closing the browser
		driver.close();

		}
}