package lamda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class labrat2 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zainab\\Desktop\\test\\qa-test\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
        Integer counter=0;
        Integer page=0;
        driver.get("https://www.etsy.com/?ref=lgo");
        Thread.sleep(10000);
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("cloth");
        driver.findElement(By.xpath("//button[@value='Search']")).click();
        List<WebElement> listImages=driver.findElements(By.tagName("img"));
        for(WebElement image:listImages)
        {
            if(image.isDisplayed())
            {
                counter++;
            }
        }
        System.out.println("No. of total Displayed images on Page 1: "+counter);
        Thread.sleep(10000);

        while (page < 4)
        {
            driver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[1]/div[1]/div[4]/div[5]/div[3]/div[13]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[11]/a[1]")).click();
            Thread.sleep(5000);
            counter=0;
            List<WebElement> listImage=driver.findElements(By.tagName("img"));
            for(WebElement image:listImage)
            {
                if(image.isDisplayed())
                {
                    counter++;
                }
            }
            System.out.println("No. of total Displayed images on Page "+(page+2)+": "+counter);
            page++;

        }
        System.out.println("Test is completed.");
        driver.quit();

    }

}



