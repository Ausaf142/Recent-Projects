package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	public Product(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement plusProduct;
	
	@FindBy(name="productname")
	private WebElement productName;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement productSave;

	public WebElement getPlusProduct() {
		return plusProduct;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProductSave() {
		return productSave;
	}
	
	public void addProduct() {
		plusProduct.click();
	}
	public void productName(String name)
	{
		productName.sendKeys(name);
	
}	
	public void saveProduct() {
		productSave.click();
	}
	
	
	
	
	
	
	

}
