package interacting_with_Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropboxMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
		dropDownMenu.click();
		
		
		
		
		Thread.sleep(2000);

		driver.quit();

	}

}
