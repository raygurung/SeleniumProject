import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorial8 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //navigate to the URL
        driver.get("https://books-pwakit.appspot.com");

        //max the browser
        driver.manage().window().maximize();


    //host
        WebElement host=driver.findElement(By.tagName("book-app"));
//shadowdom
        JavascriptExecutor j= (JavascriptExecutor) driver;
        WebElement shadowndom=(WebElement) j.executeScript("return arguments[0].shadowRoot",host);
        //app-header
        WebElement appheader=shadowndom.findElement(By.tagName("app-header"));
        //app-toolbar
        WebElement apptool=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));

        //book-input
        WebElement book=apptool.findElement(By.tagName("book-input-decorator"));

        //input tag

        book.findElement(By.cssSelector("input#input")).sendKeys("SeleniumDriver");




    }


}
