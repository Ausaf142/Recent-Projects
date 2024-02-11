package Practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amar {
@Test
public void setup() {
	WebDriver driver = WebDriverManager.edgedriver().create();
}
}
