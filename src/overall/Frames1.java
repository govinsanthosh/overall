package overall;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandy\\eclipse-workspace\\overall\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		/* d.get("https://www.sprint.com/");
		WebElement signin = d.findElement(By.xpath("//p[text()='Sign In']"));
		signin.click();
		Thread.sleep(2000);
		WebElement submit = d.findElement(By.id("loginHeaderUsername"));
		submit.sendKeys("welcome");
		//Alert a=d.switchTo().alert();
		//a.accept();
		 * 
		 */
		
		
		d.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_primer_login_btn_desk&_ga=2.98856734.1868413007.1586625258-390900317.1586625258");
	
		WebElement userid = d.findElement(By.xpath("//input[@id='DUMMY1']"));
		//Thread.sleep(20000);
	//userid.click();
		//Thread.sleep(20000);
		userid.sendKeys("welcome");
		
	}
}
