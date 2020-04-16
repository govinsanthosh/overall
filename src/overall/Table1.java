package overall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Sample1\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/automation-practice-table/");
		d.manage().window().minimize();
		List<WebElement> allrow = d.findElements(By.tagName("tr"));
		int s=allrow.size();
		for(int i=3;i<s;i++)
		{
			WebElement eachrow = allrow.get(i);
		 List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
		 for(int j=0;j<alldata.size();j++)
		 {
			 WebElement eachdat= alldata.get(j);
			 String val = eachdat.getText();
			 // System.out.println(val);
			 
			 if(val.equals("China"))
			 {
				 String val1 = eachrow.getText();
				 System.out.println(val1);
		     }
		 
		}
	}
	}
}
