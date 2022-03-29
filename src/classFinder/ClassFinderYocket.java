package classFinder;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class ClassFinderYocket {

	WebDriver driver;
	@Test
	public void shortlistUniversity() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITH\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://yocket.com");
		driver.manage().window().maximize();
	}
	
}
