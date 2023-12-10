package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDay5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumMayuri271123\\\\chromedriver\\\\chromedriver\\\\chromedriver.exe\\");
		WebDriver d=new ChromeDriver();
//		d.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		
		//GetText()
//		String textA=d.findElement(By.className("section_header")).getText();
//		if(textA.equals("CONTACT US")) {
//			System.out.println("TC pass");
//		}
//		else {
//			System.out.println("TC fail");
//		}
		
		//ISDISPLAYED()
//		
//		boolean val=d.findElement(By.id("form_buttons")).isDisplayed();
//		if(val) {
//			System.out.println("TC1 pass");
//		}
//		else {
//			System.out.println("TC1 Fail");
//		}
		
		//ISENABLE()
		d.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		boolean s1=d.findElement(By.cssSelector("input[value=\"cabbage\"]")).isEnabled();
		if(s1) {
			System.out.println("Tc2 fail");
		}
		else {
			System.out.println("TC2 pass");
		}
		
		
		//ISSELECTED()
		boolean s2=d.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isSelected();
		if(s2) {
			System.out.println("Tc3 pass");
		}
		else {
			System.out.println("TC3 fail");
		}
	}

}
