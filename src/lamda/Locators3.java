package lamda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zainab\\Desktop\\test\\qa-test\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// parent to child '//header/div/button[1]' and sibling to sibling '/following-sibling::button[1]'
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		//traversing from child to parent
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		//navigating back and forth
		driver.navigate().back();
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.navigate().back();
		
		
		
	}

}
