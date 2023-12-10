package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// Locator
		// 1. By id ==*
		// 2. By className ==> *
		// 3. By TagName ==> *
		// 4. By CssSelector ==> *
		// 5. BY XPath  ==> *
		// 6. By linkedText
		// 7. BY PartialLinkText
		// 8. By Name => *

		// Single Element
		// By CssSelector
//		boolean val=driver.findElement(By.cssSelector("h2[name=\"contactme\"]")).isDisplayed();
//		if(val) {
//			System.out.println("Test case 1 Pass");
//		}
//		else {
//			System.out.println("Test Case 1 Fail");
//		}

		// multipleElement
		// By className
//		int sizeEle=driver.findElements(By.className("feedback-input")).size();
//		if(sizeEle==4) {
//			System.out.println("Test Case 2Pass");
//		}
//		else {
//			System.out.println("Test Case 2 Fail");
//		}

		// By Id
//		boolean a1=driver.findElement(By.id("contact_form")).isDisplayed();
//		if(a1) {
//			System.out.println("test Case 3 pass");
//		}
//		else {
//			System.out.println("test case 3 fail");
//		}

		// by tagName
//		boolean a2=driver.findElement(By.tagName("h2")).isDisplayed();
//		if(a2) {
//			System.out.println("Test case 4 pass");
//		}
//		else {
//			System.out.println("test case 4 fail");
//		}

		// by name
//		boolean a3=driver.findElement(By.name("contactme")).isDisplayed();
//		if(a3) {
//			System.out.println("Test case 5 pass");
//		}
//		else {
//			System.out.println("test case 5 fail");
//		}

		// By xpath
//		boolean a4 = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).isDisplayed();
//		if (a4) {
//			System.out.println("Test case 6 pass");
//		} else {
//			System.out.println("test case 6 fail");
//		}
		
		//By linkedText
		driver.get("https://www.webdriveruniversity.com/");
		WebElement linkText=driver.findElement(By.linkText("Cypress with Cucumber BDD - Beginner to Expert in 9 Hours!"));
		if(linkText.isDisplayed()) {
			System.out.println("Test Case 7 pass");
		}
		else {
			System.out.println("Test Case 7 fail");
		}
		
		boolean s1=driver.findElement(By.partialLinkText("Cypress with Cucumber")).isDisplayed();
		if(s1) {
			System.out.println("Test Case 8 pass");
		}
		else {
			System.out.println("Test case 8 fail");
		}
		
		
		//cssSelector
		//=>id #
		//tagName => h1
		//class => .
		//CF ==> tagName[attribute="value"]
		
		//<h1 id="std" class="mk" para="p1" name="katwe">Mayuri</h1>
//		driver.findElement(By.cssSelector("#std"));
//		driver.findElement(By.cssSelector(".mk"));
//		driver.findElement(By.cssSelector("h1"));
//		driver.findElement(By.cssSelector("h1[para='p1']"));
		
		//ctrl+shift+o => automatically import
		

	}

}
