

package overall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tnpsc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Sample1\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://tspsconetimereg.tspsc.gov.in/oneTimeRegistration.tspsc");
		d.manage().window().maximize();
		WebElement aadharno = d.findElement(By.xpath("//input[@id='aadhdarNo']"));
		WebElement aadharname = d.findElement(By.xpath("//input[@id='aadhdarName']"));
		WebElement name = d.findElement(By.xpath("//input[@id='candidateName']"));
		WebElement gender = d.findElement(By.xpath("(//input[@id='gender'])[1]"));
		WebElement dob = d.findElement(By.xpath("//input[@id='dob']"));
		WebElement district = d.findElement(By.xpath("//Select[@id='nativeDistrict']"));
		aadharno.sendKeys("123456789");
		aadharname.sendKeys("santhosh");
		name.sendKeys("santhosh G");
		gender.click();
		dob.sendKeys("18/02/1992");
		Select s=new Select(district);
		s.selectByIndex(2);
		List<WebElement> op = s.getOptions();
		for(int i=0;i<op.size();i++)
		{
			WebElement val = op.get(i);
			String opt = val.getText();
			System.out.println(opt);
		}	
	}
}
