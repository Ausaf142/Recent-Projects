package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;

public class LOGIN_PAGE {
	
	public LOGIN_PAGE(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(name="user_name")
	public WebElement username;

@FindBy(name="user_password")
private WebElement userpwd;

//public WebElement getusername() {
//	return username;
//}
public WebElement getuserpwd() {
	return username;
}

public void Login() {
	username.sendKeys("admin");
	userpwd.sendKeys("root");
	userpwd.sendKeys(Keys.ENTER);
	
}






}
