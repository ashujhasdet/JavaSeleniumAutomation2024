package automationTaskSet1;
//Launch Chrome Browser and Open Myntra application
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task003 {
	public static void main(String[] args) {
		//create chrome driver object and perform upcasting using web driver reference variable
		WebDriver driver1 = new ChromeDriver();//upcasting
		//maximize chrome window
		driver1.manage().window().maximize();
		//using get() navigate to myntra application
		driver1.get("https://myntra.com/");
	}

}
