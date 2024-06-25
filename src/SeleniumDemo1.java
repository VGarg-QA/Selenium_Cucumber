import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");

        System.out.println(driver.getTitle()); // to get the page tittle
        System.out.println(driver.getCurrentUrl()); // to get the current url





    }
}
