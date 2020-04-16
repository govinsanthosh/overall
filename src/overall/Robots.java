package overall;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.io.Files;



public class Robots {
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Sample1\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("govin");
			Actions a=new Actions(driver);
			Robot r=new Robot();
			a.doubleClick(email).perform();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			WebElement pass = driver.findElement(By.id("pass"));
			pass.click();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			TakesScreenshot tk=(TakesScreenshot)driver;
			File src=tk.getScreenshotAs(OutputType.FILE);
			File  des=new File("F:\\fb.jpeg");
			Files.copy(src, des);
			System.out.println("success");
			
			
			
	}
}
