package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.RegisterPage;

public class RegisterTest {

	static WebDriver driver;
	static RegisterPage registerPage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		registerPage = new RegisterPage(driver);
	
		
	}


	@Test
	public void test() throws InterruptedException {

		registerPage.TryEmailValidation();
		registerPage.FillFields();
			
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


}
