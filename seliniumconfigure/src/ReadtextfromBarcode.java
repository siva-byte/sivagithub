import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadtextfromBarcode {

	public static void main(String[] args) throws IOException, NotFoundException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 siva/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.barcodesinc.com/generator/image.php?code=sivaparvathanaeni&style=197&type=C128B&width=271&height=50&xres=1&font=3/");
		String barcodeurl=driver.findElement(By.xpath("./html[1]/body[1]/img[1]")).getAttribute("src");
		//driver.get("search-ms:displayname=Search%20Results%20in%20Downloads&crumb=System.Generic.String%3As23&crumb=location:C%3A%5CUsers%5CDELL%5CDownloads");
		//String barcodeurl=driver.findElement(By.xpath("./html[1]/body[1]/div[1]/md-content[1]/ng-view[1]/div[1]/div[1]/div[1]/div[1]/div[2]/canvas[1]")).getAttribute("qr-content");
		
		
		System.out.println(barcodeurl);
		URL url=new URL(barcodeurl);
		BufferedImage bufferedimage=ImageIO.read(url);
		LuminanceSource luminancesource=new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminancesource));
		Result result=new MultiFormatReader().decode(binaryBitmap);
		System.out.println(result.getText());
	}
	
		
		
		

	}


