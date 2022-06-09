package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtutorials3 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        WebDriver driver2= new ChromeDriver();

        //max the browser
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");

        //driver.findElement(By.linkText("Printed Chiffon Dress")).click();

        driver.findElement(By.partialLinkText( "Chiffon Dress")).click();

        driver.close();



    }

}
