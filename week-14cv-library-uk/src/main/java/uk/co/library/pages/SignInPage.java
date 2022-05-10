package uk.co.library.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement createAccountEmail;// create email for account register create an account

      @FindBy(xpath ="//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
      WebElement signout;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailId;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordfField;
// the test stop at date changed date xpath
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signinclick;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createanAccountBtn;

    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createanAccountText;

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement createaAuthentificationText;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createaccount;

    public void emailidforcreateanAccount(String email){
        Reporter.log("Enter email "+email+ " to email field "+createAccountEmail.toString() + "<br>");
        sendTextToElement(createAccountEmail,email);
    }

    public void clickoncreatAccount(){
        Reporter.log("Clicking on create account"+ createaccount.toString()+ "<br>");
        clickOnElement(createaccount);
    }

    public String textAuthentification() {
        Reporter.log("getting create a Authentification text from "+createaAuthentificationText.toString()+"<br>");
     return    getTextFromElement(createaAuthentificationText);
    }


    public String textcreateanaccount() {
        Reporter.log("getting create an Account Btn text from "+createanAccountBtn.toString()+"<br>");
        return getTextFromElement(createanAccountBtn);
    }

    public void clickoncreateanAccount() {
        Reporter.log("Clicking on create an Account Btn"+ createanAccountBtn.toString()+ "<br>");
        clickOnElement(createanAccountBtn);
    }


    public void enterEmailId(String email) {
        Reporter.log("Enter email "+email+ " to email field "+emailId.toString() + "<br>");
        sendTextToElement(emailId, email);
    }

    public void enterPasswordId(String password) {
        Reporter.log("Enter password "+password+ " to email field "+passwordfField.toString() + "<br>");
        sendTextToElement(passwordfField, password);
    }

    public void clickonSigninButton() {
        Reporter.log("Clicking on sign in click"+ signinclick.toString()+ "<br>");
        clickOnElement(signinclick);
    }
    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        Reporter.log("Clicking on newsletterbox"+ username.toString()+ "<br>");
        enterPasswordId(password);
        Reporter.log("Clicking on newsletterbox"+ password.toString()+ "<br>");
        clickonSigninButton();
    }
    public void setSignout(){
        Reporter.log("Clicking on signout "+ signout.toString()+ "<br>");
       clickOnElement(signout);
    }
    public String varifysignoutButton(){
        Reporter.log("getting sign out text from "+signout.toString()+"<br>");
        return getTextFromElement(signout);
    }

}

