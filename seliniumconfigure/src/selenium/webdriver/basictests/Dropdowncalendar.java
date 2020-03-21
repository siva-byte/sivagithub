package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowncalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fs2.formsite.com/R1Tuim/form1/index.html");
		driver.findElement(By.xpath(".//form[@id='FSForm']")).click();
		Select y= new Select(driver.findElement(By.xpath(".//select[@class='ui-datepicker-year']")));
		y.selectByVisibleText("2020");

	}

}
