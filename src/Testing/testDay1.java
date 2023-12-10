package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.chrome.driver",
				"D:\\SeleniumMayuri271123\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		String URL = driver.getCurrentUrl();
		if (URL.contains("inventory")) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

	}

}
