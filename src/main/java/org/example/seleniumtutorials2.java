package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorials2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //max the browser
        driver.manage().window().maximize();

        //navigate to the URL
        driver.get("https://automationpractice.com/index.php");


      //  driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");

      //WebElement search =  driver.findElement(By.id("search_query_top"));
     // search.sendKeys("T-shirts");

        driver.findElement(By.name("search_query")).sendKeys("Shirts");


    }
}
