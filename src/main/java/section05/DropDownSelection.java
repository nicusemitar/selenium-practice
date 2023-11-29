package section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class DropDownSelection {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicolae.semitar\\OneDrive - R Systems\\Documents\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://automationtesting.co.uk/dropdown.html");

        //select Ford car from the dropdown list
        Select menuItem = new Select(webDriver.findElement(By.cssSelector("select#cars")));
//        menuItem.selectByVisibleText("Ford");
//        menuItem.selectByValue("ford");

        //indexes starting from 0 as in ArrayList
        menuItem.selectByIndex(1);
    }
}
