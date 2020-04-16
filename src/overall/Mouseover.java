package overall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\overall\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://www.amazon.in");
	Actions a=new Actions(d);
	WebElement menu = d.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	menu.click();
	Thread.sleep(30000);
	WebElement Mble = d.findElement(By.xpath("(//a[@class='hmenu-item'])[10]"));
	a.moveToElement(Mble).click().perform();
	Thread.sleep(30000);
	WebElement power = d.findElement(By.xpath("(//a[@href='/gp/browse.html?node=6612025031&ref_=nav_em_0_2_7_6_sbc_mobcomp_powerbank'])"));
	a.moveToElement(power).click().perform();
	
	}

}
