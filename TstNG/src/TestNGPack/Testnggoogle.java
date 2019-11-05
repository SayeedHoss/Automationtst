package TestNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testnggoogle {
static WebDriver driver;

	@BeforeClass
	void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sydho\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.bing.com/");}
//			return Testnggoogle.driver=driver;
	
	@Test
	void googleTitle() {
			String title=driver.getTitle();
			System.out.println(title);}
	
	@Test
	void SimpleSearch() throws InterruptedException {
		driver.findElement(By.id("sb_form_q")).sendKeys("123abc");
		Thread.sleep(2000);
		driver.findElement(By.id("sb_form_go")).click();}
			
	@AfterClass
	void teardown() throws InterruptedException {
		System.out.println("---eor1---");
		Thread.sleep(4000);
		driver.quit();}
		
}
