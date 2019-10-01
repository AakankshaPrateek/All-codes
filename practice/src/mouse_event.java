import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouse_event {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseurl="http://demo.guru99.com/test/newtours/";
		driver.manage().window().maximize();
		driver.get(baseurl);
        //driver.findElements(By.className("mouseOut"));
        //Initialising  first webelement from the webtable
		
		WebElement home= driver.findElement(By.linkText("Home"));
		
		//this xpath has been taken according to the application,may be application has been made this way
		
        WebElement webe = driver.findElement(By.xpath("//html/body/div"+"/table/tbody/tr/td"+"/table/tbody/tr/td"+"/table/tbody/tr/td"+"/table/tbody/tr"));
        //+"/table/tbody/tr/td"+"/table/tbody/tr/td"+"/table/tbody/tr"));
        //+"table/tbody/tr/td"+"table/tbody/tr/td"+"/table/tbody/tr/td"+"/table/tbody/tr"
        
        
        //Creating object for action class
        
        Actions ommg=new Actions(driver);
        Action mouse_hover=ommg.moveToElement(home).build();
        Thread.sleep(10000);
        
        String bgcolor= webe.getCssValue("background-color");
        System.out.println("Before hover ="+bgcolor);
        
        mouse_hover.perform();
        //Thread.sleep(10000);
        
        bgcolor= webe.getCssValue(("background-color"));
        System.out.println("After hover ="+bgcolor);
        
       
        
        Thread.sleep(20000);
	}

}
