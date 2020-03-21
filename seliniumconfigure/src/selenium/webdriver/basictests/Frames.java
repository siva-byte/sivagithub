package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath(".//iframe[@id='singleframe']")).click();
		
		driver.switchTo().frame("single frame");
		driver.findElement(By.xpath(".//iframe[@id='singleframe']")).click();
		
		

	}

}
