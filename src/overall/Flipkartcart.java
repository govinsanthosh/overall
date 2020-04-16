package overall;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartcart {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Sample1\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("http://www.flipkart.in");
			driver.manage().window().maximize();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			Actions a=new Actions(driver);
			WebElement menu = driver.findElement(By.xpath("(//li[@class='Wbt_B2 _1YVU3_'])[6]"));
			a.moveToElement(menu).perform();
			WebElement chair = driver.findElement(By.xpath("//a[@title='Dining Tables & Chairs']"));
			chair.click();
			
			Thread.sleep(20000);
			List<WebElement> products = driver.findElements(By.xpath("//a[@class='_2cLu-l']"));

			//a.moveToElement(klik).click().perform();
			//klik.click();
			int all=products.size();
			for(int i=0;i<all;i++)
				
			{
				System.out.println(products.get(i).getText()); 
			}
			System.out.println(all);
			}
}
