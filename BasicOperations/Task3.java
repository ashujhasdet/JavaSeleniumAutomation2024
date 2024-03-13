package automationProgramsset1;
// AUTOMATE THE FOLLOWING TASK
/* 
 1. LAUNCH CHROME BROWSER AND OPEN A WEB APPLICATION USING URL
 2. FETCH THE CURRENT URL AND SOURCE CODE FOR CURRENT WEB PAGE
 3. DISPLAY CURRENT URL AND SOURCE CODE ON CONSOLE
 
 **/
import org.openqa.selenium.WebDriver;//For WebDriver 
import org.openqa.selenium.chrome.ChromeDriver;
public class Task3 {
	public static void main(String [] args) throws InterruptedException {
		System.out.println("Main Starts");
		// launch chrome browser
		WebDriver driver1 = new ChromeDriver();//Up-casting 
		//maximize the browser window
		driver1.manage().window().maximize();
		//Navigate to URL of WebApplication
		driver1.get("https://demowebshop.tricentis.com/");
		// wait for 2000 ms
		Thread.sleep(2000);//handle exception
		//fetch the current URL
		System.out.println(driver1.getCurrentUrl());
		//Fetch the source code 
		System.out.println(driver1.getPageSource());
		//close all the open browser window
		driver1.close();
		
		System.out.println("Main Ends");
	}
	

}
