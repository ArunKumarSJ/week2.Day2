package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageFile {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("(//img)[2]").click();
		driver.navigate().back();
		WebElement img = driver.findElementByXPath("//label[@for='position']/following-sibling::img");
		if (img.getAttribute("href") == null) {
			System.out.println("The image is broken");
		} else {
			System.out.println("The image is not broken");
		}
	}

}
