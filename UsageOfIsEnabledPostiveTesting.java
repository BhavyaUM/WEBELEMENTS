package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfIsEnabledPostiveTesting {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
	WebElement AcceptTermsButton = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
	new Actions(driver).scrollToElement(AcceptTermsButton).perform();
	AcceptTermsButton.click();
	//click has default capability to scroll down
	WebElement AcceptTermsCheckBox = driver.findElement(By.id("confbtn"));
	Thread.sleep(5000);
	new Actions(driver).scrollToElement(AcceptTermsCheckBox).perform();
	AcceptTermsCheckBox.click();
	WebElement CloseButton = driver.findElement(By.xpath("//button[text()='Close']"));
	CloseButton.click();
    WebElement SubmitButton = driver.findElement(By.name("submit"));
    if(SubmitButton.isEnabled()) {
    	System.out.println("Boolean True");
    	System.out.println("+ve testing here Boolean true is true");
    	System.out.println("pass: the SubmitButton is in Enabled state after clicking the Accept and Terms CheckBox and it is verfied.");
    }else {
    	System.out.println("Boolean False");
    	System.out.println("+ve testing here Boolean false is false");
    	System.out.println("Fail: the SubmitButton is in Disabled state after Clicking the Accept and terms CheckBox and it is verfied.");
    }
    driver.manage().window().minimize();
    driver.quit();
}

}
