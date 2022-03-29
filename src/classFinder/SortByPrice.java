package classFinder;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortByPrice {

	public static void main(String[] args) throws Throwable {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITH\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://yocket.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'College Finder')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Masters')]")).click();
		
		boolean header =driver.findElement(By.xpath("//div[contains(text(),'DREAM EDUCATION')]")).isDisplayed();
		
		System.out.println(header);
		
		boolean miniheader=driver.findElement(By.xpath("//label[contains(text(),'Where do you want to study')]")).isDisplayed();
		System.out.println(miniheader);
		boolean step1=driver.findElement(By.xpath("//div[contains(text(),'Step 1 of 4')]")).isDisplayed();
		System.out.println(step1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		boolean requiredMsg=driver.findElement(By.xpath("(//span[contains(text(),'Required field')])[1]")).isDisplayed();
		System.out.println(requiredMsg);
		driver.findElement(By.xpath("//div[@name=\"country\"]//following-sibling::div//*[@class='vs__open-indicator']")).click();
		
		driver.findElement(By.xpath("//input[@type='search' and @placeholder='Select Country']")).sendKeys("United States");
				
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//div[@id='area_of_study']//following-sibling::div//*[@class='vs__open-indicator']")).click();
		driver.findElement(By.xpath("//input[@type='search' and @placeholder='Select Major']")).sendKeys("Computer Science");
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[@id='college']//following-sibling::div//*[@class='vs__open-indicator']")).click();
		driver.findElement(By.xpath("//input[@type='search' and @placeholder='Select College']")).sendKeys("Apex Group of Institutions");
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//div[@id='major']//following-sibling::div//*[@class='vs__open-indicator']")).click();
		driver.findElement(By.xpath("//input[@type='search' and @placeholder='Select Major']")).sendKeys("Computer Science");
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("//input[@id='marks']")).sendKeys("9");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='PTE']")).click();
		driver.findElement(By.xpath("//input[@id='pte_overall_score']")).sendKeys("90");
		
		driver.findElement(By.xpath("//div[text()='GMAT']")).click();
		driver.findElement(By.xpath("//input[@id='total_gmat_score']")).sendKeys("790");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue with Email')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumarranjith590@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
				
		Thread.sleep(5000);
		driver.quit();

	}

}
