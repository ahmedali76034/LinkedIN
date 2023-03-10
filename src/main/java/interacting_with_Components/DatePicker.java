package interacting_with_Components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/datepicker");

		WebElement dateFeild = driver.findElement(By.cssSelector("input[type='text']"));
		dateFeild.sendKeys("01/01/2050");
		dateFeild.sendKeys(Keys.RETURN);

		Thread.sleep(2000);

		driver.quit();

	}

}
