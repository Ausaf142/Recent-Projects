package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOME_PAGE {
	public HOME_PAGE (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy (linkText = "Leads")
public WebElement lead;

public void Lead() {
	lead.click();
}

@FindBy (xpath = "(//a[text()='Organizations'])[1]")
public WebElement org;


public void Org() {
	org.click();
}

@FindBy (linkText = "Products")
public WebElement products;

public void Prdct() {
	products.click();
}

	
	

}
