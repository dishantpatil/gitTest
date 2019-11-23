package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExcel extends TestXL {

	public static void main(String[] args) throws InterruptedException {
		
		TestXL objtestXL = new TestXL();
		
		By txtgooglesearch = By.xpath("//*[contains(@name,'q')]");
		By btnGoogleSearch = By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input");
		By btnGooglesecond = By.xpath("//*[contains(@data-ved,'0ahUKEwi1paWdnoflAhVHfSsKHSQoB7gQ4dUDCAs')]");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\workspace\\simple\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		
		String value1 = objtestXL.tc1();
		driver.findElement(btnGooglesecond).sendKeys(value1);
		
	}
}
