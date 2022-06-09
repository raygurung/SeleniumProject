import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumprojects10 {

    public static void main(String[] args) throws InterruptedException {


        //open the chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //navigate to the URL
        driver.get("https://amazon.com");
        System.out.println("opening the amazon page thourhg driver.get");

        //maximize the browser
        driver.manage().window().maximize();

        //Navigate to the ebay page
        driver.navigate().to("https://ebay.com");
        System.out.println("opening the ebay page through driver.get()");

       driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Jordan shoes");

       //refresh the page
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("refresh the browser");

        //back to amazon
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("The page is navigated back to amazon");


        //driver.quit only closes the current browser

        //back to ebay
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println(" going back to Ebay");

        //close all the browsers
        Thread.sleep(5000);
        driver.close();

    }

}
