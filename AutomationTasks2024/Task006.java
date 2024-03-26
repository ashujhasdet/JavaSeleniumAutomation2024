package automationTaskSet1;
/* Automate the following :
 * Open FireFox browser
 * Maximize the browser window
 * navigate to home page of face book application using URL 
 * 
 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Task006 {
	public static void  main (String[] args) {
		//create an object of FireFox driver 
		WebDriver driver1 = new FirefoxDriver();
		//Maximize the browser window
		driver1.manage().window().maximize();
		//navigate to facebook application
		driver1.get("https://facebook.com/");
		
	}

}
