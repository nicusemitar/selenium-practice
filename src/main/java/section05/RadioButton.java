package section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://automationtesting.co.uk/dropdown.html");

        webDriver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
        Thread.sleep(3000);
        webDriver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();


    }
}
