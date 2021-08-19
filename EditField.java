package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("sarva@gmail.com");
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("SELENIUM");
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys(Keys.TAB);
		String Text = driver.findElementByName("username").getAttribute("value");
		System.out.println(Text);
		driver.findElementByXPath("(//input[@type='text'])[4]").clear();
		boolean t=driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled();
		System.out.println(t);
	}

}
