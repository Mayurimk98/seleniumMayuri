package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumMayuri271123\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		WebElement first_name = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
		WebElement last_name = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement message = driver.findElement(By.cssSelector("textarea[name=\"message\"]"));
		WebElement submit = driver.findElement(By.cssSelector("input[value=\"SUBMIT\"]"));
		WebElement form = driver.findElement(By.cssSelector("#contact_form"));

		first_name.sendKeys("mayuri");
		last_name.sendKeys("katwe");
		email.sendKeys("mayurikatwe@gmail.com");
		message.sendKeys("i am learning javascript");
		// submit.click();
		form.submit();

		WebElement msg = driver.findElement(By.tagName("h1"));
		boolean available = msg.isDisplayed();
		if (available) {
			System.out.println("TestCase Pass");
		} else {
			System.out.println("TestCase Fail");
		}

	}

}
