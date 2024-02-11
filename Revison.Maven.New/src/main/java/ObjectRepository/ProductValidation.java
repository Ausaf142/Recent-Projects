package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductValidation {
	public ProductValidation(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement actualProductName;
	
	public WebElement getactualProductName() {
		return actualProductName;
	}
	
	public String ActualProductName() {
		return actualProductName.getText();
	}
}
