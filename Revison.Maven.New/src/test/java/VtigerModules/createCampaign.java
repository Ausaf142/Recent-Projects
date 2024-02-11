package VtigerModules;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.Campaign;
import ObjectRepository.HomePage;
import ObjectRepository.LogIn;

public class createCampaign extends BaseClass {
@Test
public void campaign() {
	HomePage home=new HomePage(driver);
	home.Campaign();
	Campaign campaign=new Campaign(driver);
	campaign.addCampaign();
	campaign.campaignName("gyt");
	campaign.saveCampaign();
	
}
}
