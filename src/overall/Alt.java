package overall;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alt {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Sample1\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		Alert a=driver.switchTo().alert();
		a.accept();
		System.out.println("done");	
		Thread.sleep(2000);
		WebElement canc = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		canc.click();
		WebElement canc1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		canc1.click();
		Alert a1=driver.switchTo().alert();
		a1.dismiss();
		System.out.println("cancel pressed");
		WebElement promp = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promp.click();	
		WebElement promp1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promp1.click();
		Alert a3=driver.switchTo().alert();
		String s1=a3.getText();
		a3.sendKeys("santhosh");
		System.out.println(s1);
		a3.accept();
		System.out.println("accepted");
		driver.navigate().back();
		System.out.println("backward success");
		driver.navigate().forward();
		System.out.println("forward success");
		driver.navigate().refresh();
		System.out.println("refreshed");
		driver.navigate().to("https://www.google.com");		
	}
}
