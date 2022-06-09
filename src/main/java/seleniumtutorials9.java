import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorials9 {

    public static void main(String[] args) throws InterruptedException {


        //open the chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //navigate to the URL
        driver.get("https://demoqa.com/browser-windows");

        //max the browser
        driver.manage().window().maximize();

        // current url of the page
        String urlofthepage=driver.getCurrentUrl();
        System.out.println("The url of the page is " +urlofthepage);

        //verify the url of the page
        if(urlofthepage.equals("https://demoqa.com/browser-windows"))
        {

            System.out.println("the url is verified");
        }
        else   {
            System.out.println("the url is not verified");
        }

        //title of the page
        String title=driver.getTitle();
        System.out.println("The title of page is"+ title);

        //verify the title of the page
    if(title.equals("ToolsQA"))
    {
        System.out.println("The title is verified");
    }
    else  {
        System.out.println("The title is not verified.");
    }
        //length of title.
    int titlelength=driver.getTitle().length();
        System.out.println("The length of the title is"+ titlelength);

        //page source
        String ps=driver.getPageSource();
        System.out.println("The page source is" + ps);

        //page source length
        int pslength=driver.getPageSource().length();
        System.out.println("The length of the page source is"+pslength);

        //click
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();

        //close
       // Thread.sleep(5000);
       // driver.close();

        Thread.sleep(5000);
        driver.quit();
}

}
