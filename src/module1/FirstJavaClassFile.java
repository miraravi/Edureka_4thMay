package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstJavaClassFile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Installation Stuff\\Exe Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String Expected = "https://www.facebook.com/";
		String actual = "";
		driver.get("https://www.facebook.com/");
		actual = driver.getCurrentUrl();
		if(actual.contentEquals(Expected))
		{
			System.out.println("Testpassed");
		}
		else
		{
			System.out.println("Test failed");
		}
		driver.close();
	}
	private static XXSFSheet ExcelWSheet;

}

