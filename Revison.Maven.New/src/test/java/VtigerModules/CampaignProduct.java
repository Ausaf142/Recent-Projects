package VtigerModules;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CampaignProduct {
	public static void main(String[] args) {
		Random random=new Random();
		int key = random.nextInt(100);
		String name = "DON"+key;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
		//creation product
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(name);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		//Campaign
		driver.findElement(By.xpath("//a[text()='More']")).click();
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		String mainUrl = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		Set<String> url = driver.getWindowHandles();
		for(String IDS:url) {
			if(!IDS.equalsIgnoreCase(mainUrl)) {
				driver.switchTo().window(IDS);
				driver.findElement(By.id("search_txt")).sendKeys(name);
				driver.findElement(By.xpath("//input[@name='search']")).click();
				driver.findElement(By.xpath("//a[text()='"+name+"']")).click();
				break;
			}
		}
		driver.switchTo().window(mainUrl);
		driver.findElement(By.name("campaignname")).sendKeys("CampProd"+key);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		driver.quit();
		
	}

}
