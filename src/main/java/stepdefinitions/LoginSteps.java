package stepdefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class LoginSteps {
	WebDriver driver;
	@Before
	public void setup(){
		driver = new ChromeDriver();
		}
	
	
	@After
	public void teardown() {
		driver.close();
	}
	
//	Hooks in cucumber
	
	@Before("@test")
	public void test() {
		System.out.println("this is before method for test tags");
	}
	
	@After("@test")
	public void after() {
		System.out.println("After methos for test tag");
	}
	
	@Given("User lands on Login page")
	public void user_lands_on_login_page() {
//		driver = new ChromeDriver();
	    
	    driver.get("https://login.salesforce.com");
	}

	
	@When("user enters valid username")
	public void user_enters_valid_username() {
	    driver.findElement(By.id("username")).sendKeys("sheetalg@tek.com");
	}

	@When("enters valid password")
	public void enters_valid_password() {
	    driver.findElement(By.id("password")).sendKeys("test1234");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("Login")).click();
	}

	@Then("user should see homepage")
	public void user_should_see_homepage(DataTable table) {
		List<Map<String, Integer>> accountstatus = table.asMaps(String.class, Integer.class);
		System.out.println(accountstatus.get(0).get("AccountStatus"));
//		for (Map<String, Integer> map: accountstatus) {
//			System.out.println(map.get("AccountStatus"));
//			System.out.println(map.get("Price"));
//		}
	   driver.getPageSource().contains("Home Page");
//	   driver.close();
	}

	@When("I check for the  sheetal@tek.com")
	public void i_check_for_the_sheetal_tek_com() {
		driver.findElement(By.id("username")).sendKeys("sheetal@tek.com");
	}

	@When("for the  test1234")
	public void for_the_test1234() {
		 driver.findElement(By.id("password")).sendKeys("test1234");
	}

	@Then("I verify the Please check your username and password. If you still can't log in, contact your Salesforce administrator.")
	public void i_verify_the_please_check_your_username_and_password_if_you_still_can_t_log_in_contact_your_salesforce_administrator() {
	   String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		System.out.println(driver.findElement(By.id("error")).getText());
	   Assert.assertTrue(driver.findElement(By.id("error")).getText().contains(expected), "Error message is displayed");
//	    driver.close();
	}

	@When("I check for the  sheetalg@tek.com")
	public void i_check_for_the_sheetalg_tek_com() {
		driver.findElement(By.id("username")).sendKeys("sheetalg@tek.com");
	}

	@When("for the  test123")
	public void for_the_test123() {
		 driver.findElement(By.id("password")).sendKeys("test123");
	}
	
	
}
