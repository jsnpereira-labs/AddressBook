package com.addressbook.framework.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class Browser extends Base {
    private WebDriver _driver;

    public Browser(WebDriver driver) {
        _driver = driver;
    }

    public BrowserType type;

    public void goToUrl(String url) {
        _driver.get(url);
    }

    public void maximize() {
        _driver.manage().window().maximize();
    }

    public void shutdown() {
        _driver.close();
    }

}
