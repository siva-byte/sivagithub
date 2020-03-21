package selenium.webdriver.basictests;

import org.apache.commons.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Decoding {

	public static void main(String[] args) {
	String str="test234";
	byte[] encodedString=Base64.encodeBase64(str.getBytes());
	System.out.println("encoded string:"+encodedString);
	
	byte[] decodedString=Base64.decodeBase64(encodedString);
	System.out.println("decoded string:"+decodedString);
	
	

	}

}
