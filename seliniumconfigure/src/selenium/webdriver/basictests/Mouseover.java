package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Actions act=new Actions(driver);
		WebElement admin=driver.findElement(By.xpath(".//b[contains(text(),'Admin')]"));
		WebElement usermg=driver.findElement(By.xpath(".//a[@id='menu_admin_UserManagement']"));
		WebElement users=driver.findElement(By.xpath(".//a[@id='menu_admin_viewSystemUsers']"));
		act.moveToElement(admin).build().perform();
		act.moveToElement(usermg).build().perform();
		act.moveToElement(users).click().build().perform();
		//act.moveToElement(admin).moveToElement(usermg).moveToElement(users).click().build().perform();*/
		
		int rowcount=driver.findElements(By.xpath("./html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]")).size();
		System.out.println(rowcount);

	}

}
