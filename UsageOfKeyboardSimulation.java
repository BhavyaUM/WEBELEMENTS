package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfKeyboardSimulation {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement Usernametextfield = driver.findElement(By.id("email"));
	Usernametextfield.sendKeys("1234");
	Thread.sleep(5000);
	Usernametextfield.clear();
	Thread.sleep(2000);
	Usernametextfield.sendKeys("bhavyaum");
	Thread.sleep(5000);
	Usernametextfield.sendKeys(Keys.CONTROL+"a");
	Usernametextfield.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	Usernametextfield.sendKeys("bbhavv7");
}
}
