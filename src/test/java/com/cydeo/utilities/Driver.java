package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver() {
    }

    //create a private constructor to remove access to this  object
    //We make constructor  private because we want t close access from outside th class
    //We make static, because we will use it i a static method
    // private static WebDriver driver; // default value by default is null
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();// parallel run

    // we create a reusable utility method wich will retur the same driver instance once we call it
//if an instance doesn't exist, it will create first, and then it will always return same instance.'
    public static WebDriver getDriver() {

//if (driver == null) {                  //for single run
        if (driverPool.get() == null) {         //for parallel run

// we will read our browser type from configuration.properties file.
// This way, we can control wich browser is opened from outside  our code

            String browserType = ConfigurationReader.getProperty("browser");
/*
Depending on the BrowserType returned from configuration.properties
switch statement wiil determines the "case", and opens the matching browser
 */

            switch (browserType) {
                case "chrome":
                    //   WebDriverManager.chromedriver().setup();   before november 2022 we have to create WebDriverManager,
                    //   now this is included already in Selenium Web driver
//driver = new ChromeDriver();

                    driverPool.set(new ChromeDriver());
// driver.manage().window().maximize();
                    driverPool.get().manage().window().maximize();                                // for parallel testing
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // for parallel testing
                    break;
                case "firefox":
                    //     WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            }
        }
        return driverPool.get();

    }

    //Create a new Driver.closureDriver() method; it will use quit browser, and then set the driver value back
    public static void closeDriver() {
//if (driver != null) {
        if (driverPool.get() != null) {          // for parallel
//driver.quit(); // this line will terminate the currently existing driver completely. It will not exist going forward
            driverPool.get().quit(); // this line will terminate the currently existing driver completely. It will not exist going forward
//driver = null; // we assign the value back to "null" so that my "singleton" can create a newer one of needed

//driver = null; // we assign the value back to "null" so that my "singleton" can create a newer one of needed
            driverPool.remove(); // we assign the value back to "null" so that my "singleton" can create a newer one of needed


        }
    }
}