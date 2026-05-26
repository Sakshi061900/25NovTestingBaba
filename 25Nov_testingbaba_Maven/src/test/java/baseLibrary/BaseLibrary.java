package baseLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BaseLibrary {
	
	@Test
	public void launchurl()
	{
		WebDriver driver = new ChromeDriver();
	}

}
