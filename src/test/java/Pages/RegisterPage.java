package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	static WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void TryEmailValidation() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("emailtest@test.com");

		WebElement submitButton = driver.findElement(By.xpath(".//*[@id='enterimg']"));
		submitButton.click();
	}

	public void FillFields() throws InterruptedException {
		

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
		firstName.sendKeys("First Name Test");

		Thread.sleep(500);
		WebElement lastName = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));
		lastName.sendKeys("Last Name Test");

		Thread.sleep(500);
		WebElement address = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
		address.sendKeys("Test street n 123");

		Thread.sleep(500);
		WebElement emailAddress = driver.findElement(By.xpath(".//*[@id='eid']/input"));
		emailAddress.sendKeys("emailtest@test.com");

		Thread.sleep(500);
		WebElement phoneNumber = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[4]/div/input"));
		phoneNumber.sendKeys("9999999999");

		Thread.sleep(500);
		WebElement genderSelect = driver
				.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));
		genderSelect.click();

		Thread.sleep(500);
		WebElement hobbiesCricket = driver.findElement(By.xpath(".//*[@id='checkbox1']"));
		hobbiesCricket.click();

		Thread.sleep(500);
		WebElement hobbiesHockey = driver.findElement(By.xpath(".//*[@id='checkbox3']"));
		hobbiesHockey.click();

		Thread.sleep(500);
		WebElement languageSelect = driver.findElement(By.id("msdd"));
		languageSelect.click();
		
		Thread.sleep(500);
		WebElement languageSelectPortuguese = driver
				.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[29]")); 
		languageSelectPortuguese.click();

		Thread.sleep(500);
		WebElement languageDeselect = driver.findElement(By.xpath(".//*[@id='section']"));
		languageDeselect.click();

		Thread.sleep(500);
		WebElement skills = driver.findElement(By.xpath(".//*[@id='Skills']"));
		skills.click();

		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Skills']/option[39]")));
		WebElement skillsSelect = driver.findElement(By.xpath(".//*[@id='Skills']/option[39]"));
		skillsSelect.click();

		Thread.sleep(500);
		WebElement skillsDeselect = driver.findElement(By.xpath(".//*[@id='section']"));
		skillsDeselect.click();

		Thread.sleep(500);
		WebElement countries = driver.findElement(By.xpath(".//*[@id='countries']"));
		countries.click();
		
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='countries']/option[33]")));
		WebElement countryBrazil = driver.findElement(By.xpath(".//*[@id='countries']/option[33]"));
		countryBrazil.click();
		
		Thread.sleep(500);
		WebElement countryDeselect = driver.findElement(By.xpath(".//*[@id='section']"));
		countryDeselect.click();
		
		Thread.sleep(500);
		WebElement countriesSelect = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span"));
		countriesSelect.click();
				
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='country']/option[9]")));
		WebElement countrySelectNewZaeland = driver.findElement(By.xpath(".//*[@id='country']/option[9]"));
		countrySelectNewZaeland.click();
		
		Thread.sleep(500);
		WebElement yearBox = driver.findElement(By.id("yearbox"));
		yearBox.click();
		
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='yearbox']/option[72]")));
		WebElement year = driver.findElement(By.xpath(".//*[@id='yearbox']/option[72]"));
		year.click();
		
		Thread.sleep(500);
		WebElement monthBox = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));
		monthBox.click();
		
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[4]")));
		WebElement month = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[4]"));
		month.click();
		
		Thread.sleep(500);
		WebElement dayBox = driver.findElement(By.id("daybox"));
		dayBox.click();
		
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='daybox']/option[5]")));
		WebElement day = driver.findElement(By.xpath(".//*[@id='daybox']/option[5]"));
		day.click();
		
		Thread.sleep(500);
		WebElement fisrtPwd = driver.findElement(By.id("firstpassword"));
		fisrtPwd.sendKeys("Testpawd124");
		
		Thread.sleep(500);
		WebElement secondPwd = driver.findElement(By.id("secondpassword"));
		secondPwd.sendKeys("Testpawd124");
		
		Thread.sleep(500);
		WebElement submitButton = driver.findElement(By.xpath(".//*[@id='submitbtn']"));
		submitButton.click();			
		

	}
}
