package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath(".//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath(".//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().sendKeys("s1");
		driver.switchTo().alert().accept();
		String Exptitleok="Hello s1 How are you today";
		String acctitle=driver.findElement(By.xpath(".//p[@id='demo1']")).getText();
		
		if(Exptitleok.equals(acctitle)==true)
		{
			System.out.println("test is passed");
		}
		driver.findElement(By.xpath(".//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().sendKeys("s2");
		driver.switchTo().alert().accept();
		 String acctitle1=driver.findElement(By.xpath(".//p[@id='demo1']")).getText();
	  String Exptitleok1="Hello s2 How are you today";
	 if(Exptitleok1.equals(acctitle1)==true)
		{
			System.out.println("test is passed");
		}
		
		
		


	}

}
