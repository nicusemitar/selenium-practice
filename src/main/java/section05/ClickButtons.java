package section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://automationtesting.co.uk/actions.html");

        // Find the element to double-click
        WebElement elementToDoubleClick = webDriver.findElement(By.cssSelector("[ondblclick] #doubClickStartText"));
        // Create an Actions object
        Actions actions = new Actions(webDriver);
        // Perform double-click on the element
        actions.doubleClick(elementToDoubleClick).perform();
    }
}
