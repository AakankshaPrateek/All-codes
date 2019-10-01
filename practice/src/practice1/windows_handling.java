package practice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "http://demo.guru99.com/popup.php";
		driver.get(baseurl);
		driver.manage().window().maximize();
		WebElement Click1 = driver.findElement(By.xpath("/html/body/p/a"));
		Click1.click();

		String Mainwindow = driver.getWindowHandle();

		// To handle all new opened window

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!Mainwindow.equalsIgnoreCase(ChildWindow)) {
				// Switching to Child window

				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("aa@we.com");
				driver.findElement(By.name("btnLogin")).click();
				// Closing Child window
				driver.close();

				// Switching to Main Window
				driver.switchTo().window(Mainwindow);

			}

		}

		driver.quit();

	}

}
