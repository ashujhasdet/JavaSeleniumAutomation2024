package automationTaskSet1;
//Launch Chrome Browser and open zomato application
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Task004 {
	public static void main(String [] args) {
		//create chrome driver object and upcast to web driver type
		WebDriver driver1 = new ChromeDriver();
		//maximize the chorme window
		driver1.manage().window().maximize();
		//using get() navigate to Zomato application
		driver1.get("https://zomato.com/");
	}

}
