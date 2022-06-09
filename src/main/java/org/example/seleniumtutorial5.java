package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class seleniumtutorial5 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to url

        driver.get("https://opensource-demo.orangehrmlive.com/");

        //max the browser
        driver.manage().window().maximize();


        //enter valid username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");


        //enter valid password
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

        //login in button
        driver.findElement(By.id("btnLogin")).click();


        //verify the URL
        //getCurrentURL()
        //
        String act_url= driver.getCurrentUrl();
        System.out.println(act_url);

        //verify
        String desired_url= "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
        if (act_url.equals(desired_url))

        {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }

        //verify title
        //gettitle()

        String act_title= driver.getTitle();
        System.out.println(act_title);
        String desired_title= "OrangeHRM";
        if (act_title.equals(desired_title))
        {
            System.out.println("pass");
        }
       else     {

            System.out.println("fail");

        }

       String ps=driver.getPageSource();

        System.out.println(ps);
//close the browser
       driver.close();

    }
}
