package automationTaskSet1;
/* Automate the following Task
 * Launch FireFox Browser
 * Maximize the window
 * Navigate to Myntra Web Application Home page
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task007 {
	public static void main(String[] args) {
		// create an object of fire fox browser
		WebDriver driver = new FirefoxDriver();//upcast
		//maximize the window
		driver.manage().window().maximize();
		//navigate to myntra web application using url
		driver.get("https://myntra.com/");
	}

}
