import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Seleniumtutorials7 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rayki\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //navigate to the URL
        driver.get("https://money.rediff.com/gainers");

        //max the browser
        driver.manage().window().maximize();

        //xpath axes
        //self node
      String selfnode= driver.findElement(By.xpath("//a[contains(.,'Cambridge Technology')]/self::a")).getText();
        System.out.println("The self node is" + selfnode);

        //parent node
       String parentnode=driver.findElement(By.xpath("//a[contains(.,'Cambridge Technology')]/parent::td")).getText();
        System.out.println("The parent node is" +parentnode);

        //child elements
      List <WebElement> childnode= driver.findElements(By.xpath("//a[contains(.,'Cambridge Technology')]/ancestor::tr/child::*"));
        System.out.println("THe no of child nodes are" + childnode.size());

        //ancestor node

    String ancestornode=driver.findElement(By.xpath("//a[contains(.,'Cambridge Technology')]/ancestor::tr")).getText();
        System.out.println("The ancestor node is" + ancestornode);


//following
        List<WebElement> followingtag=driver.findElements(By.xpath("//a[contains(.,'Cambridge Technology')]/following::*"));
        System.out.println("The no of following elements forom the current HTML tag are"+followingtag.size());

        //following-siblings
        List<WebElement> followingsib=driver.findElements(By.xpath("//a[contains(.,'Cambridge Technology')]/ancestor::tr/following-sibling::*"));
        System.out.println("The no of following sibling of the current HTML tag are"+followingsib.size());


        //precedding siblings
        List<WebElement> pre=driver.findElements(By.xpath("//a[contains(.,'Cambridge Technology')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("The no of preceding of the current HTML tag area ara"+pre.size());

        driver.close();

    }
}

