package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement email=driver.findElement(By.xpath(".//*[@id='email']"));
		 WebElement pass=driver.findElement(By.xpath(".//*[@id='pass']"));
		 if(email.isDisplayed()&& email.isEnabled())
		 {
			 email.sendKeys("siva1111");
		 }
		 if(pass.isDisplayed()&& pass.isEnabled())
		 {
			 pass.sendKeys("ABHIRAMM");
		 }
		 System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/span[1]/span[2]/input[1]")).isSelected());
		
		 if(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/span[1]/span[2]/input[1]")).isSelected()==false)
		 {
			 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/span[1]/span[2]/input[1]")).click();
		 }
		 

	}

}
