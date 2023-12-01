package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class BrowserTab {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://automationtesting.co.uk/browserTabs.html");

        for (int i = 0; i < 3; i++) {
            webDriver.findElement(By.cssSelector("form[target='_blank'] > input[value='Open Tab']")).click();
        }

        List<String> openedTabList = new ArrayList<>(webDriver.getWindowHandles());
        for (String openTab : openedTabList) {
            Thread.sleep(2000);
            webDriver.switchTo().window(openTab);
        }

        webDriver.switchTo().window(openedTabList.get(0));
    }
}
