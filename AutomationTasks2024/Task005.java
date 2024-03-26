package automationTaskSet1;
/* Automate The following :
 * Open Firefox browser 
 * maximize the window 
 * navigate to demo web Shop application using URL 

*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class Task005 {
	public static void main (String [] args) {
		//create an object for fireFox browser 
		WebDriver driver1 = new FirefoxDriver();//up cast 
		//maximize the window
		driver1.manage().window().maximize();
		//navigate to demo shop web
		driver1.get("https://demowebshop.tricentis.com/");
	}

}
