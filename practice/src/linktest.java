import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktest {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Dell//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl="http://demo.guru99.com/test/link.html";
		driver.manage().window().maximize();
		//driver getting the base url
		driver.get(baseurl);
		WebElement linktext=driver.findElement(By.linkText("click here"));
		linktext.click();
        //driver will find the  WebElements from xpath
		//WebElement linktext=driver.findElement(By.xpath("/html/body/a[1]"));
		//linktext.click();
		
	driver.navigate().back();
	WebElement linktext1=driver.findElement(By.xpath("/html/body/a[2]"));
    linktext1.click();
	}

}
