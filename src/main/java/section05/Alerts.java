package section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://automationtesting.co.uk/popups.html");

        webDriver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
        Thread.sleep(3000);
//        webDriver.switchTo().alert().accept();
        webDriver.switchTo().alert().dismiss();


    }
}
