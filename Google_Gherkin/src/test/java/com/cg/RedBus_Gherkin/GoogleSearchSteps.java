package com.cg.RedBus_Gherkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	private WebDriver driver;	
	
	@Given("^a website is opened with the name \"(.*?)\"$")
	public void a_website_is_opened_with_the_name(String arg1) throws Throwable {
		ChromeOptions options = new ChromeOptions(); 
		// options.addArguments("-incognito");
		options.addArguments("--disable-popup-blocking");

		driver = new ChromeDriver(options);

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://"+arg1);
	}

	@Given("^I clicked on the search box$")
	public void i_clicked_on_the_search_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).click();
	}

	@When("^I type \"(.*?)\" in the search box$")
	public void i_type_in_the_search_box(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(arg1);
	}

	@When("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
	}

	@Then("^a new Page is opened$")
	public void a_new_Page_is_opened() throws Throwable {
		
	}
	
}
