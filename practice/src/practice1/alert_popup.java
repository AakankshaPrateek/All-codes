package practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		String baseurl = "http://demo.guru99.com/test/delete_customer.php";
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		WebElement editbox=  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		editbox.sendKeys("53210");
		WebElement Submit= driver.findElement(By.name("submit"));
		Submit.click();
		
		//Switching to Alert
		Alert aler=driver.switchTo().alert();
		
		//Capturing alert message
		String alertmessage=driver.switchTo().alert().getText();
		//Displaying alert message
		System.out.println(alertmessage);
		
		Thread.sleep(10000);
		
		//Accepting alert
		aler.accept();
		
		//Switching to Alert
		Alert alerr=driver.switchTo().alert();
		
		//Capturing alert message
		String alertmessage1=driver.switchTo().alert().getText();
		//Displaying alert message
		System.out.println(alertmessage1);
		
		Thread.sleep(5000);
		
		//Accepting alert
				alerr.accept();
		
		
	}

}
