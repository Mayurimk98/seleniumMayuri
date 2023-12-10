package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDay4M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe\\");
		WebDriver d=new ChromeDriver();
		d.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//1. Click()
		//2. Submit()
		//3. isDisplay()
		//4. sendKeys()
		
//		d.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Mayuri");
//		d.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys("Katwe");
//		d.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("mk@gmail.com");
//		d.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys("learning selenium");
////		d.findElement(By.cssSelector("input[type=\"submit\"]")).click();
//		WebElement submitBtn=d.findElement(By.id("contact_form"));
//		submitBtn.submit();
//		
//		boolean val=d.findElement(By.tagName("h1")).isDisplayed();
//		if(val) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
		
		//5. getTagname()
		
//		String val=d.findElement(By.cssSelector("textarea[name=\"message\"]")).getTagName();
//		if(val.equals("textarea")) {
//			System.out.println("Test Case 2 pass");
//		}
//		else {
//			System.out.println("Test Case 2 fail");
//		}
		
		//6. getCssValue()
//		String aa=d.findElement(By.cssSelector("textarea[name=\"message\"]")).getCssValue("font-weight");
//		System.out.println(aa);
//		if(aa.equals("500")) {
//			System.out.println("Tc 3 pass");
//		}
//		else {
//			System.out.println("Tc 3 fail");
//		}
		
		//7. getLocation()
//		Point s=d.findElement(By.cssSelector("textarea[name=\"message\"]")).getLocation();
//		System.out.println(s);
		
		//8.size()
		List<WebElement> ele=d.findElements(By.className("contact_button"));
		System.out.println(ele.size());
		if(ele.size()==2) {
			System.out.println("Test case 4 pass");
		}
		else {
			System.out.println("Test Cae 4 fail");
		}
		
		

	}

}
