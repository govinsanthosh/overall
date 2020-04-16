package overall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandy\\eclipse-workspace\\overall\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		 WebElement day = d.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByVisibleText("18");
		List<WebElement> op = s.getOptions();
		for(int i=0;i<op.size();i++)
		{
			if(i%2==0)
			{
		WebElement ele = op.get(i);
		String val = ele.getText();
		System.out.println(val);
			}
		
		}
		
		
		

	}

}
