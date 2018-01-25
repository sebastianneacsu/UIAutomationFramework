package pages.utils;

import org.openqa.selenium.WebDriver;
import pages.generic.Homepage;

public class App {

    private WebDriver driver;

    public App() {
        driver = DriverManager.getDriver();
    }

    public Homepage homepage = new Homepage();

    public void quit(){
        DriverManager.quitDriver();
    }

}
