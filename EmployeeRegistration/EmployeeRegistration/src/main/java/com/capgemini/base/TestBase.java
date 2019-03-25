package com.capgemini.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("C:\\Users\\NITIGOYA\\Downloads\\EmployeeRegistration\\EmployeeRegistration\\WebContent\\index.html");

	}

}
