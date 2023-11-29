package section05;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertion_1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://automationtesting.co.uk/accordion.html");

        String pageTitle = webDriver.getTitle();
        Assert.assertEquals("Accordion", pageTitle);

    }
}
