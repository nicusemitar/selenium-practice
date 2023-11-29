package section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PopUpHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://automationtesting.co.uk/popups.html");

        webDriver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();

        String mainWindow = webDriver.getWindowHandle();
        Set<String> windowNames = webDriver.getWindowHandles();

        for(String child : windowNames){
            if(!mainWindow.equalsIgnoreCase(child)){
                webDriver.switchTo().window(child);
                Thread.sleep(2000);
                webDriver.close();
            }
        }
        webDriver.switchTo().window(mainWindow);
    }
}
