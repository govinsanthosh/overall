package overall;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Sample1\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement sdown = driver.findElement(By.xpath("//img[@alt=' No Cost EMI ']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", sdown);
		System.out.println("downsuccessfully");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("motorola");
		WebElement submit = driver.findElement(By.xpath("//input[@value='Go']"));
		submit.click();
		WebElement mobile = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
		mobile.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File des=new File("f://amazonmoto.jpg");
		Files.copy(src,des);
		System.out.println("sucess");
		}

}
