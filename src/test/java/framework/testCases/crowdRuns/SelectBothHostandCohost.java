package framework.testCases.crowdRuns;

import java.io.IOException;

import org.testng.annotations.Test;
import framework.pageObjects.LoginPage;
import framework.pageObjects.createCrowdRun;
import framework.pageObjects.dashboard;

public class SelectBothHostandCohost extends framework.BaseClass.BaseClass {
    String cardName = "Selenium Timebase Test Event";

@Test
public void TC_TimeBasedRun_HW() throws IOException, InterruptedException {
    LoginPage lp = new LoginPage(driver);
    LoginPage login = new LoginPage(driver);
    dashboard dashboard = new dashboard(driver);
    createCrowdRun crowd = new createCrowdRun(driver);

    login.setEmailAddress(emailAddress);
        logger.info("Email Address entered");
        login.setPassword(password);
        logger.info("password entered");
        login.clickLogin();
        Thread.sleep(3000);

        dashboard.clickCreateCrowdRun();
        crowd.setEventName(cardName);
        crowd.setEventDescription("Test Description");
        Thread.sleep(2000);
        crowd.clickNext();
        Thread.sleep(2000);
        crowd.clickNext();
        Thread.sleep(2000);
        crowd.clickNext();
        Thread.sleep(2000);
        crowd.clickSelectOnline();
        Thread.sleep(2000);
        crowd.uploadImg();
        logger.info("Image Uploaded");
        Thread.sleep(3000);
        crowd.clickConfirm();
        Thread.sleep(2000);

        crowd.clickSummary();
        Thread.sleep(2000);
        crowd.clickPublish();
        logger.info("Published");
        Thread.sleep(5000);

        crowd.clickDone();
        Thread.sleep(5000);
    }
}