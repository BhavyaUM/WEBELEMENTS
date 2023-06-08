package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfIsEnabledNegativeTesting {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
	WebElement SubmitButton = driver.findElement(By.name("submit"));
	Thread.sleep(5000);
	new Actions(driver).scrollToElement(SubmitButton).perform();
	Thread.sleep(5000);
	if(SubmitButton.isEnabled()) {
		System.out.println("Boolean True");
		System.out.println("-ve testing here Boolean True is False");
		System.out.println("fail: the SubmitButton is in enabled state after clicking the accept terms CheckBox and it is verified.");
	}else {
		System.out.println("Boolean False");
		System.out.println("-ve testing here Boolean False is True");
		System.out.println("pass: the SubmitButton is in disabled state be before clicking the accept terms CheckBox and it is verfied.");
	}
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
