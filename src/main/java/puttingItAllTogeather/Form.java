package puttingItAllTogeather;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import puttingItAllTogeather.pages.ConfirmationPage;
import puttingItAllTogeather.pages.FormPage;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/form");

		FormPage formPage = new FormPage();
		formPage.submitForm(driver);

		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForAlertMessage(driver);

		assertEquals("The form was successfully submitted!", confirmationPage.getAlertText(driver));
		System.out.println("Assertion Complete!");

		driver.quit();

	}

	

	

}
