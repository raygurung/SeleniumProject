package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorials6 {

    public static void main(String[] args) {
//open the crhomeBrowser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to url

        driver.get("https://ebay.com/");

        //max the browser
        driver.manage().window().maximize();

        //absolute x path
       // driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T shirts");
       // driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();


        
//relative x path
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Shirts");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();



    }

}
