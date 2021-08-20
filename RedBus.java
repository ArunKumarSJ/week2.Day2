package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Depart = driver.findElement(By.id("src"));
		Depart.sendKeys("chennai");
		Thread.sleep(10000);
		Depart.sendKeys(Keys.ENTER);
		WebElement Destination = driver.findElement(By.id("dest"));
		Destination.sendKeys("bengaluru");
		Thread.sleep(10000);
		Destination.click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElementByXPath("//td[@class='current day']").click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(10000);
		driver.findElementByXPath("//div[@class='close']").click();
		Thread.sleep(10000);
		driver.findElementByXPath("//div[@class='close-primo']/i").click();
		// to Find the No.of Busses Available
		
		WebElement Result = driver
				.findElementByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/span[1]/span[1]");
		System.out.println(Result.getText());
		Thread.sleep(10000);
		//Scroll down for to select Sleeper Bus
		JavascriptExecutor kse = (JavascriptExecutor) driver;
		kse.executeScript("window.scrollBy(0,400)");
		
		// to click sleeper bus and check availability of sleeper bus
		driver.findElementByXPath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[2]/label[1]").click();
		WebElement NoofSleeperBus = driver.findElementByXPath("//span[@class='f-bold busFound']");
		System.out.println("The No.of Sleeper Bus :" + NoofSleeperBus.getText());
		Thread.sleep(20000);
		kse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(10000);
		//unselect sleeper bus and click Ac Bus and check availabilty of Ac Bus
		driver.findElementByXPath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[2]/label[1]").click();
		Thread.sleep(10000);
		kse.executeScript("window.scrollBy(0,400)");
		driver.findElementByXPath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[3]/label[1]").click();
		WebElement NoofAcSleeperBus = driver
				.findElementByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[1]/span[1]/span");
		System.out.println("The No.of AcSleeper Bus:" + NoofAcSleeperBus.getText());
		//Now to select Non-Ac bus and Ac Bus and print the number of avalability
		Thread.sleep(50000);
		driver.findElementByXPath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[4]/label[1]").click();
		WebElement ACandNONAC = driver
				.findElementByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[1]/span[1]/span");
		System.out.println("The No.of AcSleeper and NON-Ac Sleeper Bus:" + ACandNONAC.getText());
	}

}
/*
 *
 *
 * *
 */
