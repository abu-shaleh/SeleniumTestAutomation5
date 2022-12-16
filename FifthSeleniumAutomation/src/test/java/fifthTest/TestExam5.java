package fifthTest;
import java.util.Arrays;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TestExam5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Prj\\selenium-java-4.7.2\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		        // Hide control by automation
				options.setExperimentalOption("useAutomationExtension", false);
				options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));  
				options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
				options.addArguments("disable-notifications");
				WebDriver driver = new ChromeDriver(options);
				// Maximize window size
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();  
				String url = "https://www.daraz.com.bd/?spm=a2o2r5.tm800117534.header.dhome.1ef87cd5aNfplK";
				driver.get(url);
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/div/div/ul/li[12]/a/span")).click();
				Thread.sleep(2000); 
				//Main Menu
				WebElement mainMenu = driver.findElement(By.xpath("//span[text()='Motorcycle Riding Gear']"));
				//Create object 'action' of an Actions class
				Actions action = new Actions(driver);
				//moving to the main menu and then sub menu and clicking on it using object of the Actions class
				action.moveToElement(mainMenu).perform();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("//span[text()='Helmet']")).click();
				driver.quit();

}
}
