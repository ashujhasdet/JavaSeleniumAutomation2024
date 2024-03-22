package automationTaskSet1;
//Launch chrome browser and navigate to demo web shop application

import org.openqa.selenium.chrome.ChromeDriver;//import for chrome Driver
import org.openqa.selenium.WebDriver;//import for WebDriver

public class Task001 {
	public static void main(String [] args) {
		//create object of chrome and store in webdriver type ref variable
		WebDriver driver1 = new ChromeDriver();
		
		//maximize the chrome window using manage()->window()-->maximize()
		driver1.manage().window().maximize();	
		
		//use get() method to navigate to demo web shop
		driver1.get("https://demowebshop.tricentis.com/");
	}

}
