package lamda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zainab\\Desktop\\test\\qa-test\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String name = "rahul";
		
		String password = getPassword(driver);
		try {
			Thread.sleep(1000);
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			Thread.sleep(1000);
			driver.findElement(By.id("inputUsername")).sendKeys(name);
			Thread.sleep(1000);
			driver.findElement(By.name("inputPassword")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.className("signInBtn")).click();
			Thread.sleep(1000);
			System.out.println(driver.findElement(By.tagName("p")).getText());
			Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
			Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
			driver.findElement(By.xpath("//button[text()='Log Out']")).click();
			
		}
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public static String getPassword(WebDriver driver) {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String passwordArray[] = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
		
		
		
	}
	
}
