package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDay6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver",
//				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe\\");
//		WebDriver d = new ChromeDriver();
//		d.get("https://www.saucedemo.com/");
//		d.findElement(By.id("user-name")).sendKeys("standard_user");
//		d.findElement(By.id("password")).sendKeys("secret_sauce");
//		d.findElement(By.id("login-button")).click();

		// Test Case One
		// getCurrentURL()
//		String a1 = d.getCurrentUrl();
//		System.out.println(a1);
//
//		if (a1.contains("inventory")) {
//			System.out.println("TC1 Pass");
//		} else {
//			System.out.println("Tc1 Fail");
//		}
//		d.close();

		// Test Case two
//		d.findElement(By.id("user-name")).sendKeys("standard_user");
//		d.findElement(By.id("password")).sendKeys("secret_sauce");
//		d.findElement(By.id("login-button")).click();
//		String a2 = d.getTitle();
//		if (a2.equals("Swag Labs")) {
//			System.out.println("TC2  pass");
//		} else {
//			System.out.println("TC2 fail");
//		}

		// Test Case three
		// maximize the window
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe\\");
//		WebDriver d = new ChromeDriver();
//		d.get("https://www.saucedemo.com/");
//		d.manage().window().maximize();
//		Thread.sleep(5000);
//		d.quit();

		// Test Case four
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe\\");
//		WebDriver d = new ChromeDriver();
//		d.get("https://www.saucedemo.com/");
//		d.manage().window().maximize();
//		System.out.println(d.getCurrentUrl());
//		d.get("https://www.google.co.in/");
//		System.out.println(d.getCurrentUrl());
//		d.navigate().back();
//		System.out.println(d.getCurrentUrl());
//		if(d.getCurrentUrl().contains("https://www.saucedemo.com/")) {
//			System.out.println("TC pass");
//		}
//		else {
//			System.out.println("Tc Fail");
//		}
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe\\");
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
		System.out.println(d.getCurrentUrl());
		d.get("https://www.google.co.in/");
		System.out.println(d.getCurrentUrl());
		d.navigate().back();
		
		System.out.println(d.getCurrentUrl());
		d.navigate().forward();
		System.out.println(d.getCurrentUrl());
		if(d.getCurrentUrl().contains("google")) {
			System.out.println("TC pass");
		}
		else {
			System.out.println("Tc Fail");
		}

	}

}
