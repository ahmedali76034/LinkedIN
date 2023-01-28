package interacting_with_Components;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/newtours/register.php");

//		WebElement dropDownButton = driver.findElement(By.id("dropdownMenuButton"));
//		dropDownButton.click();
//
//		Select dd = new Select(dropDownButton);
//		dd.selectByIndex(3);
		
		WebElement dropDownButton = driver.findElement(By.cssSelector("select[name='country']"));
		dropDownButton.click();
		
		Select dd = new Select(dropDownButton);
		dd.selectByVisibleText("AUSTRIA");
		
		
		Thread.sleep(2000);

		driver.quit();

	}

}
