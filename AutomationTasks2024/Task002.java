package automationTaskSet1;
// Launch chrome browser and navigate to Facebook application

import org.openqa.selenium.WebDriver;//For webdriver
import org.openqa.selenium.chrome.ChromeDriver;//For ChromeDriver
public class Task002 {
	public static void main(String[] args) {
		//create object of chrome and store in Webdriver type ref variable
		WebDriver driver1 = new ChromeDriver();//Upcasting
		//maximize the chrome window using manage().window().maximize()
		driver1.manage().window().maximize();
		//using get() navigate to facebook application
		driver1.get("https://facebook.com/");
		
	}

}
