/**
 * 
 */
package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	
 String baseUrl="https://www.guru99.com/first-webdriver-script.html";
 String expectedTitle="First Selenium Webdriver Script: JAVA Code Example";

 String actualTitle;
 //launching Chrome driver
 driver.get(baseUrl);
 //getting the actual title
 	
 actualTitle= driver.getTitle();
  if(actualTitle.contentEquals(expectedTitle))
	  {
	  System.out.println("Test case Passed");
	  }
  else
	  {
	  System.out.println("Test case Failed" );
	  
	 
	  }
 
 
 driver.close();
	}
 
 
	
}	


