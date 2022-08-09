package lamda;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;





public class Selftest {



public static void main(String[] args) {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zainab\\Desktop\\test\\qa-test\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://s2.yap.co/admin-web/#!/home");

System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

driver.close();

//driver.quit();



}



}

