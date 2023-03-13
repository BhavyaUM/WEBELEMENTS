package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
public static void main(String[] args) throws Throwable {
	//instantiate the browser specfic class
	WebDriver driver=new ChromeDriver();
	//post condtion maximize the zpplication
	driver.manage().window().maximize();
	//trigger the main URL the appliction
	driver.get("https://canarabank.com/");
	//Identify the Instagram option in canarabank application and click on
	WebElement Instgram = driver.findElement(By.xpath("//a[text()='Instagram']"));
	Instgram.click();
	Thread.sleep(5000);
	//pre condition
	driver.manage().window().minimize();
	driver.quit();
}
}
