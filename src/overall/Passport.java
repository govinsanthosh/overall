package overall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Passport {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Sample1\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement loca = driver.findElement(By.xpath("//select[@id='dcdrLocation']"));
		Select s=new Select(loca);
		s.selectByVisibleText("Chennai");
		WebElement givenname = driver.findElement(By.xpath("//input[@id='givenName']"));
		givenname.sendKeys("Santhosh");
		WebElement surname = driver.findElement(By.xpath("//input[@id='surname']"));
		surname.sendKeys("govin");
		WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
		dob.sendKeys("18/02/1991");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("govinsanthosh@gmail.com");
		WebElement emailid = driver.findElement(By.xpath("//input[@id='emailloginSameyes']"));
		emailid.click();
		WebElement loginid = driver.findElement(By.xpath("//input[@id='loginId']"));
		loginid.sendKeys("govinsanthosh@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pwd']"));
		password.sendKeys("8056560315");
		WebElement conpassword = driver.findElement(By.xpath("//input[@id='confirmPwd']"));
		conpassword.sendKeys("8056560315");
		WebElement hint = driver.findElement(By.xpath("//select[@id='hintQues']"));
		Select s1=new Select(hint);
		List<WebElement> opt = s1.getOptions();
		for(int i=0;i<opt.size();i++)
		{
			WebElement qt = opt.get(i);
			String val = qt.getText();
			System.out.println(val);
		}
		s1.selectByVisibleText("First School");
		WebElement hintans = driver.findElement(By.xpath("//input[@id='hintAns']"));
		hintans.sendKeys("Kalaivani");
	}
}
