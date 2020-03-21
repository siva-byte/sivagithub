package gmail;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
           driver.findElement(By.name("Email")).sendKeys("sivaparvathaneni69@gmail.com");
         
           
           driver.findElement(By.name("Password")).sendKeys("abhiramm");
          driver.findElement(By.xpath(".//INPUT[@class='button-1 login-button']")).click();
          //String exptitle="nopCommerce demo store";
        //  String acctitle=driver.getTitle();
          /*System.out.println(acctitle);
          if(exptitle.equals(acctitle)==true)
          {
        	  System.out.println("test is passed");
        	  
          }
          else
          {
        	  System.out.println("test is failed");
          }*/
          System.out.println(driver.getTitle());
          System.out.println(driver.getCurrentUrl()); 
         // String text=driver.findElement(By.xpath(".(//H1[text()='Welcome, Please Sign In!'])[1]")).getText();
          System.out.println(driver.getPageSource());
          
        		//driver.close();
        		
           		
          
           
	}

}
