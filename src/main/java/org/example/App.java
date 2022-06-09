package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //navigate to the URL
        driver.get("https://www.google.com");

        //3.close the browser

        driver.close();

        //1.open the firefox browser
        System.setProperty("webdriver.gecko.driver","C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\geckodriver.exe");
        WebDriver driver2= new FirefoxDriver();
        driver2.get("https://www.google.com");

        driver2.close();

    }
}
