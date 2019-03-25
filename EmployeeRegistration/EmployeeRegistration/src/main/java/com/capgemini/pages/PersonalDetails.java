package com.capgemini.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capgemini.base.TestBase;

public class PersonalDetails extends TestBase{
	
	@FindBy(id="empNo")
	WebElement employeeNumber;
	
	@FindBy(id="empName")
	WebElement employeeName;
	
	@FindBy(xpath="//*[@id=\"sts\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement city;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[6]/td/input")
	WebElement next;
	
	 public PersonalDetails() {
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber1) {
		employeeNumber.sendKeys(employeeNumber1);
	}

	public WebElement getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName1) {
		employeeName.sendKeys(employeeName1);
	}

	public WebElement getState() {
		return state;
	}

	public void setState(String stateName) {
		Select state1 = new Select(state);
		state1.selectByVisibleText(stateName);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String cityName) {
		Select city1 = new Select(city);
		city1.selectByVisibleText(cityName);
	}

	public WebElement getNext() {
		return next;
	}

	public void setNext(WebElement next) {
		next.click();
	}
	
	public String getTitles()
	{
		return driver.getTitle();
	}
}
