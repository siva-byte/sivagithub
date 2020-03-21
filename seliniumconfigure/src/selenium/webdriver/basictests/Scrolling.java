package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,2500)","");
	//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  WebElement flag=driver.findElement(By.xpath(".//h2[contains(text(),'Professional audio equipment')]"));
  js.executeScript("arguments[0].scrollIntoView();",flag);
  
}
}
