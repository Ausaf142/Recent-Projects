package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDynXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.flipkart.com/search?q=iphone+15&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&as-pos=1&as-type=RECENT&suggestionId=iphone+15%7CMobiles&requestId=636e8c76-1548-4ffb-a5fe-952000652e7c&as-searchtext=iphone");
     String apple = driver.findElement(By.xpath("(//div[@class=\"col col-7-12\"]/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()=\"₹72,999\"])[1]")).getText();
	System.out.println(apple);
	}

}
