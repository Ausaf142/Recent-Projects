package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmtd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement ele = driver.findElement(By.id("oldSelectMenu"));
		Select s=new Select(ele);
		if(s.isMultiple()) {
			System.out.println("is multiple");
		}
		else {
			System.out.println("not multiple");
		}
		s.selectByIndex(0);
		s.selectByValue("1");
		s.selectByVisibleText("Purple");
		List<WebElement> opt = s.getOptions();
		for(WebElement app:opt) {
			System.out.println(app.getText());
			
		}
	
		
	
	}

}
