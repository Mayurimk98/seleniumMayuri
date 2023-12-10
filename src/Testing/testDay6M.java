package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class testDay6M {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Test Case 1
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();

		// getCurrentURL()
//		String URL=driver.getCurrentUrl();
//		System.out.println(URL);
//		if(URL.contains("inventory")) {
//			System.out.println("Test Case 1 pass");
//		}
//		else {
//			System.out.println("Test Case 1 Fail");
//		}
//		driver.close();

		// Test Case 2

//		System.setProperty("webdriver.chrome.driver",
//				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
////		driver.findElement(By.id("user-name")).sendKeys("standard_user");
////		driver.findElement(By.id("password")).sendKeys("secret_sauce");
////		driver.findElement(By.id("login-button")).click();
//		
//		//getTitle()
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		if(title.equals("Swag Labs")) {
//			System.out.println("Test Case 2 pass");
//		}
//		else {
//			System.out.println("Test Case 2 Fail");
//		}

		// Test case 3
//		
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.quit();

		// Test case 4
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		System.out.println(driver.getCurrentUrl());
//		driver.get("https://www.google.com/");
//		System.out.println(driver.getCurrentUrl());
//		driver.navigate().back();
//		if(driver.getCurrentUrl().contains("saucedemo")) {
//			System.out.println("Test Case 4 pass");
//		}
//		else {
//			System.out.println("Test Case 4 fail");
//		}
		
		//test Case 5
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();//saucedemo
		Thread.sleep(3000);
		driver.navigate().forward();//google
		if(driver.getCurrentUrl().contains("google")) {
			System.out.println("Test Case 5 pass");
		}
		else {
			System.out.println("Test Case 5 Fail");
		}
		
	}

}
