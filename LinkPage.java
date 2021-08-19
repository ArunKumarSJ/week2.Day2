package week2.Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		String TEXT = driver.findElementByLinkText("Find where am supposed to go without clicking me?")
				.getAttribute("href");
		System.out.println(TEXT);
		driver.findElementByLinkText("Verify am I broken?").click();
		String Title = driver.getTitle();
		if (Title.contains("Not Found")) {
			System.out.println("The Link is Broken");
		} else {
			System.out.println("The Link is not Broken");
		}
		driver.navigate().back();
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		List<WebElement> mul=driver.findElements(By.tagName("a"));
		int size = mul.size();
		System.out.println("The number of links is:"+ size);

	}

}
