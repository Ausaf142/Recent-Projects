package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationValidation {
	 public OrganisationValidation(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(css="span.dvHeaderText")
	 private WebElement actualOrganisationData;

	 public WebElement getActualProductData() {
	  return actualOrganisationData;
	 }

	 public String actualOrganisationName()
	 {
	  return actualOrganisationData.getText();
	 }
}
