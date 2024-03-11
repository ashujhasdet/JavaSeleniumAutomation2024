package automationProgramsset1;
// Automate some basic operations on a web application using WebDriver Methods
/* 
 LIST OF TASKS TO AUTOMATE
 1.LAUNCH CHROME BROWSER 
 2.OPEN HOME PAGE OF DEMOSHOPWEB APPLICATION
 3.MAXIMIZE THE CHROME BROWSER WINDOW
 4.WAIT FOR 2000 MILLI SECONDS
 5.GET THE TITLE OF CURRENT WEB PAGE
 6. NAVIGATE TO CART PAGE OF APPLICATION
 7. REFRESH THE WEB APPLICATION AND WAIT 2000 MILLI SECONDS
 8. NAVIGATE BACK TO PREVIOUS WEB PAGE OF BROWSER <--
 9. THEN GO TO NEXT WEB PAGE OF BROWSER --> AND WAIT 2000 MILLI SECONDS
 10. CLOSE ALL THE MAIN OPENED CHROME BROWSER TABS
 
 
 */
import org.openqa.selenium.WebDriver; //For WebDriver
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String [] args) throws InterruptedException {
		
		System.out.println("Main starts");
		//We will use WebDriver object for the purpose of generalization
		//OPERATION 1 = Open Chrome Browser
		WebDriver driver1 = new ChromeDriver();//UPCASTING
		//Open Home page of Web Application = Demo shop web
		//use get()
		driver1.get("https://demowebshop.tricentis.com/");
		//Maximize the Chrome window for above operation
		//use manage--> window --> maximize
		driver1.manage().window().maximize();
		//add some wait time 
		Thread.sleep(2000);//need to handle exception
		//Get the Current web Page Title and print on console
		//use getTitle();
		System.out.println(driver1.getTitle());
		//Navigate to cart  web page from current web page
		//use navigate().to()

		driver1.navigate().to("https://demowebshop.tricentis.com/cart");
		Thread.sleep(1500);
		//Refresh the current page
		//use navigate.refresh()
		driver1.navigate().refresh();
		Thread.sleep(2000);
		//using browser back button go back to previous page
		//navigate().back();
		driver1.navigate().back();
		Thread.sleep(2000);
		//Now navigate forward to next web page
		//navigate().forward();
		driver1.navigate().forward();
		Thread.sleep(2000);
		//Now close all the opened chrome tabs
		//use close()
		driver1.close();
		System.out.println("Main ends");
		
		
		
		
		
		
		
	}

}
