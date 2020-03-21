package selenium.webdriver.basictests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingwiindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath(".//a[contains(text(),'Open New Tabbed Windows')]")).click();
		driver.findElement(By.xpath(".//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		Set <String>s=driver.getWindowHandles();
		for(String i:s)
		{
			String t=driver.switchTo().window(i).getTitle();
			if(t.contains("Sakinalium")==true)
			{
				System.out.println(t);
				driver.close();
			}
		}
		

	}

}
