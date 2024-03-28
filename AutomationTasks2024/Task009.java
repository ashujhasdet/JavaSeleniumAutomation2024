package automationTaskSet1;
/* Automate the following
 * Launch Microsoft Edge Browser
 * Maximize the window
 * Navigate to Demo Web Shop Application Home Page
 *  */
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
public class Task009 {
	public static void main(String[] args) {
		//Create an Edge object
		WebDriver driver = new EdgeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		//Navigate to Demo Web Shop Home Page
		driver.get("https://demowebshop.tricentis.com/");
	}

}
