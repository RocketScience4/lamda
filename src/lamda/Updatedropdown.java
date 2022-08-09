package lamda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updatedropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zainab\\Desktop\\test\\qa-test\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		
		// int i = 1;
		//while (i<5) {
			//driver.findElement(By.cssSelector("#hrefIncAdt")).click();	
			//i++;
		//}
		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
