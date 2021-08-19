package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("yes")).click();
		String T = driver.findElementByXPath("//label[@for='Unchecked']").getAttribute("for");
		System.out.println(T);
		WebElement Text = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]");
		if (!Text.isSelected()) {
			Text.isSelected();
		} else {
			System.out.println("The age group is selected");
		}

	}

}
