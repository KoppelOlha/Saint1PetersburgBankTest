package framework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    public static void waitForElementVisible(WebElement someelement) {
        new WebDriverWait(BrowserManager.browser, 3).until(ExpectedConditions.visibilityOf(someelement));
    }

    public static void navigateToDropDownList(WebElement menuElement) {
        Actions action = new Actions(BrowserManager.browser);
        action.moveToElement(menuElement).build().perform();
    }

    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) BrowserManager.browser).executeScript("arguments[0].click();", element);
    }

    public static void logInfo(String someMessage) {
        Logger logger = Logger.getLogger("BankTest");
        PropertyConfigurator.configure("log4j.properties");
        logger.info(someMessage);
    }
}

