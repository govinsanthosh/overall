package overall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Sample1\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		WebElement contin = driver.findElement(By.id("continents"));
		Select s=new Select(contin);
		List<WebElement> op = s.getOptions();
		for (int i=0;i<op.size();i++)
		{
			WebElement ele = op.get(i);
			if(i%2==0)
			{
				String txt = ele.getText();
				System.out.println(txt);
			}
			}
	WebElement multi = driver.findElement(By.id("continentsmultiple"));
	Select s1=new Select(multi);
	s1.selectByVisibleText("Asia");
	s1.selectByVisibleText("Africa");
	System.out.println("done multiselect");
	List<WebElement> op1 = s1.getOptions();
	for(int i=0;i<op1.size();i++)
	{
		WebElement el = op1.get(i);
		String val = el.getText();
		System.out.println(val);
	}
	}	
	}


