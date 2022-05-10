package uk.co.library.testsuite;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import uk.co.library.pages.*;
import uk.co.library.testbase.TestBase;
import uk.co.library.testdata.TestData;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;
     @BeforeMethod(alwaysRun = true)
     public void inIt() {
         homePage = new HomePage();
         ResultPage resultPage=new ResultPage();

     }

    @Test (dataProvider = "credentials",dataProviderClass = TestData.class,groups = {"sanity","smoke","regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnAcceptCookie();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        softAssert.assertEquals(resultPage.getSearchResultText(),result,"");


    }


}