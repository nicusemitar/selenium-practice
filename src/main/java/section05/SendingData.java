package section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://automationtesting.co.uk/contactForm.html");
        webDriver.findElement(By.cssSelector("form#contact_form > input[name='first_name']")).sendKeys("Name Input");
    }
}
