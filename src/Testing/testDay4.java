package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// click()
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("Mayuri");
//		driver.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys("Katwe");
//		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("mayurimkatwe@gmail.com");
//		driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys("I am learning javascript");
//
//		driver.findElement(By.id("contact_form")).submit();
//		boolean avail = driver.findElement(By.tagName("h1")).isDisplayed();
//		if (avail) {
//			System.out.println("Test Case pass");
//		} else {
//			System.out.println("Test Case Fail");
//		}
//		driver.close();
		
		//=======================================================================================
		
		//getTagName()
//		String a1=driver.findElement(By.cssSelector("textarea[name=\"message\"]")).getTagName();
//		if(a1.equals("textarea")) {
//			System.out.println("Test case 2 pass");
//		}
//		else {
//			System.out.println("test case 2 fail");
//		}
//		
		
		//========================================================================================
		
		//getCssvalue()
//		String a=driver.findElement(By.cssSelector("textarea[name=\"message\"]")).getCssValue("font-weight");
//		System.out.println(a);
//		if(a.equals("500")) {
//			System.out.println("TC 3 PASS");
//		}
//		else {
//			System.out.println("TC 3 fail");
//		}
//		
		
		//=========================================================================================
		
		//getLocation()
		Point p=driver.findElement(By.id("contact_form")).getLocation();
		System.out.println(p);
		
		//==============================================================================
		
		//Size()
		List<WebElement> contact_btn=driver.findElements(By.cssSelector(".contact_button"));
		
		int aa=contact_btn.size();
		System.out.println(aa);
		if(aa==2) {
			System.out.println("TC 4 pass");
		}
		else {
			System.out.println("Tc 4 fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
