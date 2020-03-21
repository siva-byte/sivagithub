package selenium.webdriver.basictests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firsttest {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C://Users//DELL//Downloads//geckodriver-v0.26.0-win64//");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		
		

	}

}
