package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Checkbox {

	WebDriver driver;
	JavascriptExecutor js;

	@BeforeClass
	public void setBrowser() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@AfterClass
	public void closeDriver() {
		driver.close();
	}

	@Test
	public void test1() {

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement chk_sunday = driver.findElement(By.xpath("//*[@id='sunday']"));

		System.out.println("Is sunday selected? : " + chk_sunday.isSelected());
		chk_sunday.click();
		System.out.println("Now is sunday selected? : " + chk_sunday.isSelected());

		List<WebElement> days = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		int totalDays = days.size();
		System.out.println("Days : " + totalDays);

		System.out.println("Is initially selected? : ");

		for (WebElement d : days) {
			System.out.println(d.getAttribute("value") + " : " + d.isSelected());
		}

		String day = "Friday";
		switch (day) {
		case "Sunday":
			driver.findElement(By.xpath("//input[@id='sunday']")).click();
			break;
		case "Monday":
			driver.findElement(By.xpath("//input[@id='monday']")).click();
			break;
		case "Tuesday":
			driver.findElement(By.xpath("//input[@id='tuesday']")).click();
			break;
		case "Wednesday":
			driver.findElement(By.xpath("//input[@id='wednesday']")).click();
			break;
		case "Thursday":
			driver.findElement(By.xpath("//input[@id='thursday']")).click();
			break;
		case "Friday":
			driver.findElement(By.xpath("//input[@id='friday']")).click();
			break;
		case "Saturday":
			driver.findElement(By.xpath("//input[@id='saturday']")).click();
			break;
		default:
			System.out.println("Invalid day...");
			break;
		}

	}

}
