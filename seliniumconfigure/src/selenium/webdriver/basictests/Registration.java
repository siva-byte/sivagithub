package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath(".//input[@placeholder='First Name']")).sendKeys("siva");
		driver.findElement(By.xpath(".//input[@placeholder='Last Name']")).sendKeys("p");
		driver.findElement(By.xpath(".//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("gudivada");
		driver.findElement(By.xpath(".//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("sivaparvath@gmail.com");
		driver.findElement(By.xpath(".//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("7396477237");
		
		driver.findElement(By.xpath("./html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
		driver.findElement(By.xpath("./html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("./html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[2]/input[1]")).click();
		
		driver.findElement(By.xpath(".//div[starts-with(@class,'ui-autocomplete-multiselect ui-state-default ui-widget')]")).sendKeys("English");
		Select x=new Select(driver.findElement(By.xpath(".//select[@id='Skills']")));
		x.selectByVisibleText("C");
		

	Select y=new Select(driver.findElement(By.xpath(".//select[@id='countries']")));
	y.selectByVisibleText("India");
	
	Select z=new Select(driver.findElement(By.xpath(".//select[@id='yearbox']")));
	z.selectByVisibleText("1997");
	
	Select a=new Select(driver.findElement(By.xpath("./html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")));
	
	a.selectByVisibleText("July");
	Select b=new Select(driver.findElement(By.xpath("./html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[11]/div[3]/select[1]")));
	
	b.selectByVisibleText("10");
	driver.findElement(By.xpath("./html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[12]/div[1]/input[1]")).sendKeys("Abhiramm@7");
	driver.findElement(By.xpath(".//input[@id='secondpassword']")).sendKeys("Abhiramm@7");
	driver.findElement(By.xpath(".//button[@id='submitbtn']")).click();
	
	
	
	}
	
	
	
	
	

}
