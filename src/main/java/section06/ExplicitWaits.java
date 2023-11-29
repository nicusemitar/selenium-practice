package section06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://automationtesting.co.uk/loader.html");

        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#loaderBtn")));

        webDriver.findElement(By.cssSelector("button#loaderBtn")).click();
        webDriver.quit();
    }
}
