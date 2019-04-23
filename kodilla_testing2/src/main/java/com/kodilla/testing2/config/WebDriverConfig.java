package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    public static final String CHROME = "CHROME_DRIVER";

    private static String adminTrelloLogin = "Ja";

    private static String adminTrelloPassword = "ja20";

    public static String getAdminTrelloLogin() {
        return adminTrelloLogin;
    }

    public static String getAdminTrelloPassword() {
        return adminTrelloPassword;
    }

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.chrome.driver","c:\\Windows\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}