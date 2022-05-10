package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

/**
 * Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin,
 * salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
 * Methods - enterJobTitle(String jobTitle), enterLocation(String location),
 * selectDistance(String distance), clickOnMoreSearchOptionLink(),
 * enterMinSalary(String minSalary), enterMaxSalary(String maxSalary), selectSalaryType(String
 * sType), selectJobType(String jobType),
 * clickOnFindJobsButton().
 */
public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @FindBy(id = "location")
    WebElement locationField;

    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter job Title "+jobTitle+ " to email field "+jobTitleField.toString() + "<br>");
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Enter location "+location+ " to email field "+locationField.toString() + "<br>");
        sendTextToElement(locationField, location);

    }

    public void selectDistance(String distance1) {
        Reporter.log("Selecting distance"+distance1+" from dropdown "+distanceDropDown.toString() + "<br>");
        selectByValueFromDropDown(distanceDropDown, distance1);
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter min Salary "+minSalary+ " to email field "+salaryMin.toString() + "<br>");
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter max Salary"+maxSalary+ " to email field "+salaryMax.toString() + "<br>");
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String salaryType) {
        Reporter.log("Selecting salary Type"+salaryType+" from dropdown "+salaryTypeDropDown.toString() + "<br>");
        selectByValueFromDropDown(salaryTypeDropDown, salaryType);

    }

    public void selectJobType(String jobType) {
        Reporter.log("Selecting job Type "+jobType+" from dropdown "+jobTypeDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

    }
    // accept cookies
    @FindBy(xpath = "//*[contains(text(),'Accept')]")
    WebElement cookies;

    public void clickOnFindJobsButton() {
        Reporter.log("Clicking on find Jobs Btn "+ findJobsBtn.toString()+ "<br>");
        clickOnElement(findJobsBtn);
    }
    public void clickOnAcceptCookie(){
        Reporter.log("Clicking on Accept Cookies : " + cookies.toString());
        switchToiFrame("gdpr-consent-notice");
        clickOnElement(cookies);
    }

}
