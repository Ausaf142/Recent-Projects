package Modules;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CampaignWithProduct {
	public static void main(String[] args) throws InterruptedException {
		Random random=new Random();
		int key1 = random.nextInt(1000);
		String prod="iphone"+key1;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(prod);
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		WebElement more = driver.findElement(By.linkText("More"));
		Actions act=new Actions(driver);
		act.moveToElement(more).perform();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		driver.findElement(By.name("campaignname")).sendKeys("Job"+key1);
		String win = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		Set<String> windos = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String Ids:windos) {
			driver.switchTo().window(Ids);
			
		 String url = driver.getCurrentUrl();
		 //System.out.println(url);
		if(url.contains("Products&action")) {
			
			driver.findElement(By.id("search_txt")).sendKeys(prod);
			driver.findElement(By.name("search")).click();
			driver.findElement(By.xpath("//a[text()='"+prod+"']")).click();
			break;
		}
		}
		

		
		driver.switchTo().window(win);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
		
		
		
		
		
		
	}

}
