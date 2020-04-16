package overall;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.out.println("1.continue with cusid");
		System.out.println("2.Continue without cusid");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandy\\eclipse-workspace\\overall\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		switch (s) {
		case 1:
			d.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
			List<WebElement> frme = d.findElements(By.tagName("frame"));
			int si=frme.size();
			System.out.println(si);
			d.switchTo().frame(0);
			WebElement cusid = d.findElement(By.xpath("//input[@name='fldLoginUserId']"));
			cusid.sendKeys("12345");
			WebElement conti = d.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
			conti.click();
			WebElement pass = d.findElement(By.xpath("//input[@name='fldPassword']"));
			pass.sendKeys("govinsanthosh");
			WebElement login = d.findElement(By.xpath("//img[@alt='Login']"));
			login.click();
			break;
			case 2:
				d.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
				List<WebElement> frme1 = d.findElements(By.tagName("frame"));
				int si1=frme1.size();
				System.out.println(si1);
				d.switchTo().frame(0);
				//WebElement cusid1 = d.findElement(By.xpath("//input[@name='fldLoginUserId']"));
				//cusid1.sendKeys("12345");
				WebElement conti1 = d.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
				conti1.click();
				Alert a=d.switchTo().alert();
				a.accept();
			break;	
			
		default:
			System.out.println("done sucessfully by default");
			break;
		}
		List<WebElement> frme1 = d.findElements(By.tagName("frame"));
		int si1=frme1.size();
		System.out.println(si1);
		System.out.println("done sucessfully");
	}
}
