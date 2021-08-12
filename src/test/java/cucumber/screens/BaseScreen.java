package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utilities.Constants;

import java.time.Duration;
import java.util.List;

public class BaseScreen {
    protected AppiumDriver<MobileElement> driver;
    protected Wait<AppiumDriver> wait;

    public BaseScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new FluentWait<AppiumDriver>(driver)
                .withTimeout(Duration.ofSeconds(Constants.TIMEOUT))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
    }

    protected void waitAndClick(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }

    protected void waitAndClick(MobileElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    protected void click(By by) {
        driver.findElement(by).click();
    }

    protected void click(MobileElement element) {
        element.click();
    }

    protected void clickIfDisplayed(MobileElement element) {
        if (wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOf(element)).click();
        }
    }


    protected void hideKeyboard() {
        driver.navigate().back();
    }

    protected List<WebElement> waitAndFindAllElements(By by) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    protected List<WebElement> waitAndFindAllElements(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    protected WebElement waitAndFindElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected WebElement waitAndFindElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected String getText(By by) {
        return waitAndFindElement(by).getText();
    }

    protected String getText(MobileElement element) {
        return waitAndFindElement(element).getText();
    }

    protected void sendKey(By by, String text) {
        waitAndFindElement(by).sendKeys(text);
    }

    protected void sendKey(MobileElement element, String text) {
        waitAndFindElement(element).sendKeys(text);
    }
}
