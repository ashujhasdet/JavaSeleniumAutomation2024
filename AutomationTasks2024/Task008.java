package automationTaskSet1;
/* Automate the following 
 * Launch Firfox Browser
 * Maximize the browser window
 * Navigate to Zomato web Application home page
 * 
 * */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task008 {
	public static void main(String[] args) {
		//Launch fire fox browser
		WebDriver driver = new FirefoxDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//navigate to Zomato web application Home Page
		driver.get("https://zomato.com/");
	}

}
