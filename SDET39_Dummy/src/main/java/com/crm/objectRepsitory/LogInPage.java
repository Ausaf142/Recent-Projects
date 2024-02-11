package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	//Initialisation
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Declaration
	@FindBy (name="user_name")
		private WebElement username;
		
	
	@FindBy (name="user_password")
	private WebElement password;
	
	@FindBy (id="submitButton")
	private WebElement submit;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	//Buisness Logic
	/**
	 * @used for LogIn to the Login page
	 * @param userName
	 * @param Password
	 * @author Ausaf
	 */
	public void LogIn(String userName,String Password) {
		username.sendKeys(userName);
		 password.sendKeys(Password);
		 submit.click();
	}
	
	
	

}
