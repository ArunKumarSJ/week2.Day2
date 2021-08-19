package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Dimension Size = driver.findElementById("position").getSize();
		System.out.println("The Size is:" + Size);
		String color=driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Color of that Element is:"+color);
		int Size1=driver.findElement(By.id("size")).getSize().getHeight();
		System.out.println("The height of that Element is:"+Size1);
		int Size2=driver.findElement(By.id("size")).getSize().getWidth();
		System.out.println("The width of that Element is:"+Size2);
		
		driver.findElement(By.id("home")).click();
		driver.close();


	}

}
