package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		

		WebElement drop1 =driver.findElement(By.id("dropdown1"));
		Select drpDwn=new Select(drop1);
		drpDwn.selectByIndex(1);
		

		WebElement drop2 =driver.findElementByXPath("//select[@name='dropdown2']");
		Select drpDwn1=new Select(drop2);
		drpDwn1.selectByIndex(1);

		WebElement drop3 =driver.findElement(By.id("dropdown3"));
		Select drpDwn2=new Select(drop3);
		drpDwn2.selectByIndex(1);

		WebElement drop4 =driver.findElementByClassName("dropdown");
		Select drpDwn3=new Select(drop4);
		drpDwn3.selectByIndex(1);
		

		WebElement drop5 =driver.findElementByXPath("(//div[@class='example'])[5]/select");
		Select drpDwn4=new Select(drop5);
		drpDwn4.selectByIndex(drpDwn4.getOptions().size()-1);
	}

}
