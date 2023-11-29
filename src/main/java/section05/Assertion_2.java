package section05;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertion_2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://teststore.automationtesting.co.uk/");

        webDriver.findElement(By.cssSelector("[alt='Hummingbird printed t-shirt']")).click();
        webDriver.findElement(By.cssSelector("[data-button-action]")).click();

        Thread.sleep(2000);

        String productPrice = webDriver.findElement(By.cssSelector(".product-total .value")).getText();
        Assert.assertEquals("$26.12", productPrice);

    }
}
