package puttingItAllTogeather.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

	public static void submitForm(WebDriver driver) {
		driver.findElement(By.id("first-name")).sendKeys("Ahmed");
		driver.findElement(By.id("last-name")).sendKeys("Ali");
		driver.findElement(By.id("job-title")).sendKeys("QA Automation Engineer");
		driver.findElement(By.id("radio-button-1")).click();
		driver.findElement(By.cssSelector("input[value ='checkbox-1']")).click();

		WebElement yearsOfExperiance = driver.findElement(By.id("select-menu"));
		yearsOfExperiance.click();
		Select dd = new Select(yearsOfExperiance);
		dd.selectByVisibleText("5-9");

		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("01/01/2030");
		datePicker.sendKeys(Keys.RETURN);

		WebElement submitButton = driver.findElement(By.cssSelector("a[class= 'btn btn-lg btn-primary']"));
		submitButton.click();
	}

}
