package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwithokbuttton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath(".//li[@class='active']//a[@class='analystic'][contains(text(),'Alert with OK')]")).click();
		
		driver.findElement(By.xpath(".//button[@class='btn btn-danger']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

}
