import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorial11 {

    public static void main(String[] args) throws InterruptedException {


        //open the chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to the URL
        driver.get("https://opensource-demo.orangehrmlive.com");

        //maximize the browser
        driver.manage().window().maximize();

        //enter username and password
        driver.findElement(By.id("txtUsername]")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        //clear the username and password
        driver.findElement(By.id("txtUsername")).clear();
        driver.findElement(By.id("txtPassword")).clear();
    }

}
