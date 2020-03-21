package selenium.webdriver.basictests;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Capturelogoimage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrm.live.com/");
		WebElement logoImageElement=driver.findElement(By.xpath("//*[name()='image' and contains(@overflow,'visible')]"));
	
		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver,logoImageElement);
		
		ImageIO.write(logoImageScreenshot.getImage(),"png",new File("C:/Users/DELL/Pictures"));
		File f=new File("C:/Users/DELL/Pictures");
		if(f.exists())
		{
			System.out.println("Image is captured");
		}
		
		

		else
		{
			System.out.println("Image file not exist");
		}
	}

}
