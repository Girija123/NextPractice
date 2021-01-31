package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    public static WebDriver driver;

    public void openBrowser()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public void waitForTime(int waittime)
    {
        driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
    }

    public void keyEnter() throws Exception
    {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        waitForTime(2);
    }
}
