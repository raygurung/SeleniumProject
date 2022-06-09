package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class seleniumtutorials4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the browser
        driver.manage().window().maximize();

        driver.get("http://google.com");

     List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        //name of links

        for(WebElement l:link)
        {
            System.out.println(l.getText());
        }
    }
}
