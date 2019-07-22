package cas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.When;
  
public class register {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	
	//case1
	
	
	@When("I type the url and homepage is displayed")
	public void i_type_the_url_and_homepage_is_displayed()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://192.168.40.4:8083/TestMeApp1/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,120);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		
	}

	@When("I click the signup link")
	public void i_click_the_signup_link() {
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("I enter username")
	public void i_enter_username() {
		driver.findElement(By.id("userName")).sendKeys("deepika");
	}

	@When("I enter firstname")
	public void i_enter_firstname() {
		driver.findElement(By.id("firstName")).sendKeys("deepika");
	}

	@When("I enter lastname")
	public void i_enter_lastname() {
		driver.findElement(By.id("lastName")).sendKeys("balamurugan");
	}

	@When("I enter password and confirm password")
	public void i_enter_password_and_confirm_password() {
		driver.findElement(By.id("password")).sendKeys("deepika");
		driver.findElement(By.id("pass_confirmation")).sendKeys("deepika");
	}

	@When("I enter gender")
	public void i_enter_gender() {
		driver.findElement(By.xpath(".//span[text()='Female']")).click();
	}

	@When("I enter email mobile no and DOB")
	public void i_enter_email_mobile_no_and_DOB() {
		driver.findElement(By.id("emailAddress")).sendKeys("deepika@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("7958738917");
		driver.findElement(By.id("dob")).sendKeys("28/11/1997");
	}

	@When("I enter Address")
	public void i_enter_Address() {
		driver.findElement(By.id("address")).sendKeys("45 virugambakkam");
	}

	@When("I enter security question and answer")
	public void i_enter_security_question_and_answer() {
		Select qn= new Select(driver.findElement(By.id("securityQuestion")));
		qn.selectByVisibleText("What is your Birth Place?");
		driver.findElement(By.id("answer")).sendKeys("chennai");
	}

	
	@When("I click the register link")
	public void i_click_the_register_link() {
		driver.findElement(By.xpath(".//input[@value='Register']")).click();
	}
	
	
	
	
	//case2
	
}
