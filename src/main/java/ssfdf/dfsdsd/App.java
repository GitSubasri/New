package ssfdf.dfsdsd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\neweclipse\\dfsdsd\\src\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();    
driver.get("http://www.facebook.com/");
    	System.out.println( "Hello World!" );
    }
}
