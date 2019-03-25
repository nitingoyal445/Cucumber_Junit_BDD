package com.capgemini.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.TestBase;

public class ProjectDetails extends TestBase {
	
	@FindBy(id="projectName")
	WebElement projectName;
	
	@FindBy(name="Platform")
	List<WebElement> platform;
	
	@FindBy(id="register")
	WebElement register;
	
	public ProjectDetails()
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName1) {
		projectName.sendKeys(projectName1);
	}

	public List<WebElement> getPlatform() {
		return platform;
	}

	public void setPlatform(String platform1) {
		int size = platform.size();
		for (int i = 0; i < size; i++) {
			String value = platform.get(i).getAttribute("value");
			if (value.equalsIgnoreCase(platform1)) {
				platform.get(i).click();
				break;
			}
		} 
	}

	public WebElement getRegister() {
		return register;
	}

	public void setRegister(WebElement register) {
		register.click();
	}
	
	
}
