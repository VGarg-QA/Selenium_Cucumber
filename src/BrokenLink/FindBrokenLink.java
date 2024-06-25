package BrokenLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class FindBrokenLink {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.co.in");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("total links are " + links.size());

        for( int i=0; i<links.size(); i++)
        {
            WebElement element =links.get(i);
            String url = element.getAttribute("href");
            verifylinkActive(url);
        }

    }

    public static void verifylinkActive(String linkUrl)
    {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection hc = (HttpURLConnection) url.openConnection();
            hc.setConnectTimeout(3000);
            hc.connect();

            if (hc.getResponseCode() == 200) {
                System.out.println(linkUrl + "-" + hc.getResponseMessage());
            }
            if (hc.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
                System.out.println(linkUrl + "-" + hc.getResponseMessage() + "-" + HttpURLConnection.HTTP_NOT_FOUND);
            }
        }
        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }

}
