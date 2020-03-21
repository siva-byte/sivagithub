package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwithokandcancel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath(".//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath(".//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().accept();
		String acctitle=driver.findElement(By.xpath(".//p[@id='demo']")).getText();
		String Exptitleok="You pressed Ok";
		String Exptitlecancel="You Pressed Cancel";
		
		if(Exptitleok.equals(acctitle))
		{
			System.out.println("test is passed");
		}
		
		driver.findElement(By.xpath(".//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		 acctitle=driver.findElement(By.xpath(".//p[@id='demo']")).getText();
		if(Exptitlecancel.equals(acctitle))
		{
			System.out.println("test is passed");
		}
	}

}
