package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://automationtesting.co.uk/contactForm.html");
        webDriver.findElement(By.name("first_name")).sendKeys("Name");

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("document.querySelector('input[type=submit]').click();");

    }
}
