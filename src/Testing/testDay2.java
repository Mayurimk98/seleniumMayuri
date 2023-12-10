package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumMayuri271123\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		WebElement loginCredential = driver.findElement(By.id("login_credentials"));

		// WebElements methods

		// 1. SendKeys()
		userName.sendKeys("standard_user");
		passWord.sendKeys("secret_sauce");

		// 2. Click()
		loginButton.click();

		// 3. Clear()
		userName.clear();
		passWord.clear();

		// 4. getAttribute()
		// <input class="input_error form_input" placeholder="Username" type="text"
		// data-test="username" id="user-name" name="user-name" autocorrect="off"
		// autocapitalize="none" value="" fdprocessedid="ttcz9">

		String getAttribute = userName.getAttribute("class");
		System.out.println(getAttribute);

		// 5. getTagName()
		String tagName = userName.getTagName();
		System.out.println(tagName);

		// 6. getText()
		String getText = loginCredential.getText();
		System.out.println(getText);
	}

}
