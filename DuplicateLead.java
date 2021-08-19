package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		driver.findElement(By.name("emailAddress")).sendKeys("arun@gmail.com");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(20000);
		WebElement Name = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a");
		String text1 = Name.getText();
		Name.click();
		driver.findElementByXPath("(//div[@class='frameSectionExtra'])[2]/a[1]").click();
		System.out.println("Title is:"+ driver.getTitle());
		String text2 = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		driver.findElementByClassName("smallSubmit").click();
		if (text1.equals(text2)) {
			System.out.println("The lead is duplicate");
		}
		driver.close();

	}

}
