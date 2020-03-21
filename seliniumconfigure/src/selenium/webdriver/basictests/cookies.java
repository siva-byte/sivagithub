package selenium.webdriver.basictests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {



	public static void main(String[] args) {
		
		//Cookie cobj=new Cookie("mycookie1235","12345678");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in//");
		
		
	Set <Cookie> cookies=driver.manage().getCookies();
	System.out.println("size of cookies:"+cookies.size());
		driver.manage().deleteAllCookies();
		 Set <Cookie> cookie=driver.manage().getCookies();
		System.out.println("size of cookie:"+cookie.size());
		//Cookie cookie= driver.manage().getCookieNamed("session-id-time");
		//System.out.println(cookie);
		/*for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}*/
	}

	

}
