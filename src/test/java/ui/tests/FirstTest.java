package ui.tests;

import org.testng.annotations.Test;
import pages.utils.App;
import ui.base.BaseTest;

public class FirstTest extends BaseTest{


    @Test(description = "test")
    public void displayTimeAndDate() {

        App app = new App();

        app.homepage.openHomePage();
        app.homepage.search("Selenium");


        app.quit();


        softAssert.assertTrue(true);
        softAssert.assertAll();


    }
}
