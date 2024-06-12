package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected WebDriver driver;

    public WebDriver getWebDriver() {

        System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/IdeaProjects/seleniumLogin/src/main/resources/chromedriver");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        return driver;
    }
}
