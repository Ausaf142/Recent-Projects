package GenericCampaign;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.FileUtility;
import GenericUtility.JavaUtility;
import ObjectRepository.Campaign;
import ObjectRepository.HomePage;


public class createCampaign extends BaseClass  {
	@Test (retryAnalyzer=GenericUtility.ReTryImpClass.class)
public void campaign() throws Throwable {
	JavaUtility jlib=new JavaUtility();

	HomePage home=new HomePage(driver);
	home.more();
	home.Campaign();
	Campaign camp=new Campaign(driver);
	camp.addCampaign();
	camp.campaignName("ME"+jlib.randomNo());
	camp.saveCampaign();
	Assert.assertEquals(false, true);
	
	
	
	
}	

}
