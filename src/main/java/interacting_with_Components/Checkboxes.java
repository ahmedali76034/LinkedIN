package interacting_with_Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/checkbox");

		// locating element by TAG and ID via CSS SELECTOR
		WebElement checkbox1 = driver.findElement(By.cssSelector("input#checkbox-1"));
		checkbox1.click();

		Thread.sleep(2000);

		// locating element by TAG and ATTRIBUTE via CSS SELECTOR
		WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
		checkbox2.click();

		Thread.sleep(2000);

		// locating element by ID
		WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
		checkbox3.click();

		Thread.sleep(2000);

		driver.quit();
	}

}
