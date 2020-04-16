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
public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Sample1\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Src=ts.getScreenshotAs(OutputType.FILE);
		File des= new File("F://greensdown.jpg");
		Files.copy(Src,des);
		WebElement up = driver.findElement(By.xpath("//a[text()='HOME']"));
		js.executeScript("arguments[0].scrollIntoView(false)",up);
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File des1=new File("F://greenstop.jpg");
		Files.copy(src1, des1);
		
	}

}
