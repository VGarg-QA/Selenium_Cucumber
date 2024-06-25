import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");

        driver.navigate().to("http://gmail.com"); // to navigate to differnet URL in same tab.
        // Navigate reember brower history.

        Thread.sleep(4000);
        driver.navigate().back();

        Thread.sleep(4000);
        driver.navigate().forward();

        Thread.sleep(4000);
        driver.navigate().refresh();









    }
}
