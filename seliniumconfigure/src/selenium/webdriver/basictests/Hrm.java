package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrm {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("httpSs://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	/*	driver.findElement(By.id("menu_admin_viewAdminmodule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();*/
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("EmployeeList")).click();
		
  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[2]/td[1]")).click();
		//System.out.println(rowcount);

	}

}
