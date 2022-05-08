import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestarSelenium {

    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver", "C:\\myWebProject\\jar\\geckodriver.exe");

        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.nfl.com/");

        WebElement header = driver.findElement(By.id("site-header"));

            if(header.isDisplayed()){
                System.out.println("The header was displayed");
            }
            else if(!header.isDisplayed()){
                System.out.println("The header was not displayed");
            }
    }

}
