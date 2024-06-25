import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://gmail.com");

        driver.close(); // it close the current window only.

        driver.quit(); // it will close all the windows opened by the driver.

    }
}
