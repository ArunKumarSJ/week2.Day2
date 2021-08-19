package week2.Day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");

		driver.findElementByXPath("//input[@type='checkbox']").click();
		boolean t = driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
		System.out.println(t);
		driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();

		driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();

		String txt1 = driver.findElementByXPath("//label[@for='java']").getText();
		System.out.println(txt1);
		String txt2 = driver.findElementByXPath("(//label[@for='java'])[2]").getText();
		System.out.println(txt2);
		String txt3 = driver.findElementByXPath("(//label[@for='java'])[3]").getText();
		System.out.println(txt3);
		String txt4 = driver.findElementByXPath("(//label[@for='java'])[4]").getText();
		System.out.println(txt4);
		

	}

}
