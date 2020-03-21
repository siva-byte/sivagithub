package sel.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//
//import org.openqa.selenium.firefox.FirefoxDriver;//
public class Thirdtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//DELL//Downloads//chromedriver_win32 siva//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\DELL\\Downloads\\geckodriver-v0.25.0-win64 siva1//geckodriver.exe");//
	//WebDriver driver= new FirefoxDriver();//
		
	driver.get("http://www.google.com/");
	driver.close();
	

	}

}
