import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCrypages {
	
	public void launchingBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gangana.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.firstcry.com/");    
		
		
	}

}
