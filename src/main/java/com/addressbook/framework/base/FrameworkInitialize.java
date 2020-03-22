package com.addressbook.framework.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

public class FrameworkInitialize extends Base {
    public void InitializeBrowser(BrowserType browserType) {
        WebDriver driver = null;
        switch (browserType) {
            case Chrome:
                driver = chrome();
                break;
            case Firefox:
                driver = firefox();
                break;
        }
        DriverContext.setDriver(driver);
        DriverContext.Browser = new Browser(driver);
    }


    private static WebDriver chrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options. setCapability(CapabilityType
                .ForSeleniumServer
                .ENSURING_CLEAN_SESSION, true);
        System.setProperty("webdriver "
                        + ".chrome.driver",
                "chromedriver" + getExtesionValue());
        return new ChromeDriver(options);
    }

    private static WebDriver firefox() {
        System.setProperty(
                "webdriver.gecko.driver",
                "geckodriver" + getExtesionValue());
        return new FirefoxDriver();
    }


    public static String getExtesionValue() {
        String extension = "";
        String operationalSystem = System.getProperty("os.name").toLowerCase();

        if (operationalSystem.indexOf("win") >= 0) {
            extension = ".exe";
        }
        return extension;
    }

}
