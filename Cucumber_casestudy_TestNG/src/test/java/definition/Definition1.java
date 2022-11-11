package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition1 {
	WebDriver driver;
	

	@Given("I should be in demo99 login page")
	public void i_should_be_in_demo99_login_page() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	@When("Enter username {string}")
	public void enter_username(String string) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(string);

	}
	@When("Enter password {string}")
	public void enter_password(String string) throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(string);
	}
	@When("Click on login button")
	public void click_on_login_button() {
		
		driver.findElement(By.xpath("//*[@name='submit']")).click();
	}
	@Then("I should see a message {string}")
	public void i_should_see_a_message(String string) throws InterruptedException {
		
		Thread.sleep(1000);
		String t=driver.getTitle();
		System.out.println(t);

	} 
	}
