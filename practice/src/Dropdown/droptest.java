/**
 * 
 */
package Dropdown;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class droptest {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver","C://Users//Dell//Downloads//chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
String baseUrl=  "http://demo.guru99.com/test/newtours/register.php";
driver.manage().window().maximize();
driver.get(baseUrl);
Select drpcountry=new Select(driver.findElementByName("country"));
Thread.sleep(5000);
drpcountry.selectByVisibleText("INDIA");
Thread.sleep(50000);

	}

}
