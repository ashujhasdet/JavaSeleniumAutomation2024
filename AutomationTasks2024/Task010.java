package automationTaskSet1;
/* Automate the following Task
 * Launch Edge Browser
 * Maximize the window
 * Navigate to FaceBook web Application Home Page
 * 
 * */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Task010 {
	public static void main(String[] args) {
		//Create Edge Object
		WebDriver driver = new EdgeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Navigate to FaceBook Web Application Home page
		driver.get("https://Facebook.com/");
	}

}
