package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxtest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl=("http://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		driver.get(baseurl);
		WebElement chckbx = driver.findElement(By.id("persist_box"));
		chckbx.click();
		
		Thread.sleep(50000);
		
		if(chckbx.isSelected())
		{System.out.println("Checkbox is selected");
		}
		else
		{ System.out.println("Checkbox is not selected");
		}
		
		for (int i = 0;i<2;i++)
		{
			chckbx.click();
			System.out.println("Guru99 checkbox is selected  "+chckbx.isSelected());
		}
		
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
