package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TravelWebsiteSearchForm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://www.easyjet.com/en");
        webDriver.findElement(By.id("ensCloseBanner")).click();

        webDriver.findElement(By.cssSelector("input[name='origin']")).click();
        webDriver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");


        List<WebElement> originsFrom = webDriver.findElements(By.cssSelector("#ui-id-1 li>a>span"));
        for (WebElement origin : originsFrom) {
            if (origin.getText().contains("Gatwick")) {
                origin.click();
            }
        }

        webDriver.findElement(By.cssSelector("input[name='destination']")).click();
        webDriver.findElement(By.cssSelector("input[name='destination']")).sendKeys("Paris");

        List<WebElement> originsTo = webDriver.findElements(By.cssSelector("#ui-id-2 li>a>span"));
        for (WebElement origin : originsTo) {
            if (origin.getText().contains("Paris Charles de Gaulle")) {
                origin.click();
            }
        }


    }
}
