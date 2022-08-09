package lamda;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implicit wait
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zainab\\Desktop\\test\\qa-test\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		try {
			Thread.sleep(1000);
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			Thread.sleep(1000);
			driver.findElement(By.id("inputUsername")).sendKeys("rahul");
			Thread.sleep(1000);
			driver.findElement(By.name("inputPassword")).sendKeys("helo123");
			Thread.sleep(1000);
			driver.findElement(By.className("signInBtn")).click();
			Thread.sleep(1000);
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			Thread.sleep(1000);
			driver.findElement(By.linkText("Forgot your password?")).click();		
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("john");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("55644646");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.cssSelector("form p")).getText());
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#chkboxOne")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("signInBtn")).click();
			Thread.sleep(1000);
            System.out.println("All Done So FAR.");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
		

		
		
	}

}
