package org.example;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage {
    private SHAFT.GUI.WebDriver driver;

    public RegisterPage(SHAFT.GUI.WebDriver driver) {this.driver = driver ; }

    private By HomePage = By.xpath("//a[@style=\"color: orange;\"]");
    private By SignupPageButton = By.xpath("//a[@href=\"/login\"]//i[@class=\"fa fa-lock\"]");
    private By NewUserSignup = By.xpath("//div[@class=\"signup-form\"]//h2");
    private By NameTextField = By.xpath("//input[@data-qa=\"signup-name\"]");
    private By EmailTextField = By.xpath("//input[@data-qa=\"signup-email\"]");
    private By SignupLoginPage = By.xpath("//div[@class='login-form']");
    private By SignupButton = By.xpath("//button[@data-qa=\"signup-button\"]");
    private By TitleGender1 = By.xpath("//div[@class=\"radio-inline\"]//div[@class=\"radio\"]//input[@id=\"id_gender1\"]");
    //private By TitleGender2 = By.xpath ("//div[@class="radio-inline"]//div[@class="radio"]//input[@id="id_gender2"]");
    private By UserName = By.xpath("//div[@class=\"required form-group\"]//input[@data-qa=\"name\"]");
    private By UserPassword = By.xpath("//div[@class=\"required form-group\"]//input[@data-qa=\"password\"]");
    private By Day = By.xpath("//select[@data-qa=\"days\"]//option[@value=\"1\"]");
    private By Month = By.xpath("//select[@data-qa=\"months\"]//option[@value=\"1\"]");
    private By Year = By.xpath("//select[@data-qa=\"years\"]//option[@value=\"2001\"]");
    private By CheckBoxNewSletter = By.xpath("//div[@class=\"checkbox\"]//input[@name=\"newsletter\"]");
    private By CheckBoxSpecialOffers = By.xpath("//div[@class=\"checkbox\"]//input[@name=\"optin\"]");
    private By FirstName = By.xpath("//input[@data-qa=\"first_name\"]");
    private By LastName = By.xpath("//input[@data-qa=\"last_name\"]");
    private By Company = By.xpath("//input[@data-qa=\"company\"]");
    private By Address = By.xpath("//input[@data-qa=\"address\"]");
    private By Address2 = By.xpath("//input[@data-qa=\"address2\"]");
    private By Country = By.xpath("//select[@data-qa=\"country\"]//option[@value=\"Canada\"]");
    private By State = By.xpath("//input[@data-qa=\"state\"]");
    private By City = By.xpath("//input[@data-qa=\"city\"]");
    private By ZipCode = By.xpath("//input[@data-qa=\"zipcode\"]");
    private By MobileNumber = By.xpath("//input[@data-qa=\"mobile_number\"]");
    private By CreateAccountButton = By.xpath("//button[@data-qa=\"create-account\"]");
    private By AccountCreated = By.xpath("//h2[@data-qa=\"account-created\"]");
    private By ContinueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
    //ul[@class="nav navbar-nav"]//a//i[@class="fa fa-user"]
    private By LoggedIn = By.xpath("//ul[@class=\"nav navbar-nav\"]");
    private By DeleteAccButton = By.xpath("//a[@href=\"/delete_account\"]//i");
    private By DeletedAcc = By.xpath("//h2[@data-qa=\"account-deleted\"]//b");
    private By ContinButton = By.xpath("//a[@data-qa=\"continue-button\"]");


    public RegisterPage navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public RegisterPage clickOnSignupPageButton() {
        driver.element().click(SignupPageButton);
        return this;
    }

    public RegisterPage fillNameTextField(String name) {
        driver.element().type(NameTextField,name);
        return this;
    }

    public RegisterPage fillEmailTextField(String email) {
        driver.element().type(EmailTextField,email);
        return this;
    }

    public RegisterPage clickOnSignupButton() {
        driver.element().click(SignupButton);
        return this;
    }

    public RegisterPage clickOnTitleGender1() {
        driver.element().click(TitleGender1);
        return this;
    }

    public RegisterPage fillUserName(String username) {
        driver.element().type(UserName, username);
        return this;
    }

    public RegisterPage fillPassword(String password) {
        driver.element().type(UserPassword, password);
        return this;
    }

    public RegisterPage clickOnDay() {
        driver.element().click(Day);
        return this;
    }

    public RegisterPage clickOnMonth() {
        driver.element().click(Month);
        return this;
    }

    public RegisterPage clickOnYear() {
        driver.element().click(Year);
        return this;
    }

    public RegisterPage clickOnCheckBoxNewSletter() {
        driver.element().click(CheckBoxNewSletter);
        return this;
    }

    public RegisterPage clickOnCheckBoxSpecialOffers() {
        driver.element().click(CheckBoxSpecialOffers);
        return this;
    }

    public RegisterPage fillFirstName(String Fname) {
        driver.element().type(FirstName, Fname);
        return this;
    }

    public RegisterPage fillLastName(String Sname) {
        driver.element().type(LastName, Sname);
        return this;
    }

    public RegisterPage fillCompany(String Compname) {
        driver.element().type(Company, Compname);
        return this;
    }

    public RegisterPage fillAddress(String Faddress) {
        driver.element().type(Address, Faddress);
        return this;
    }

    public RegisterPage fillAddress2(String Saddress) {
        driver.element().type(Address2, Saddress);
        return this;
    }

    public RegisterPage clickOnCountry() {
        driver.element().click(Country);
        return this;
    }

    public RegisterPage fillState(String state) {
        driver.element().type(State, state);
        return this;
    }

    public RegisterPage fillCity(String city) {
        driver.element().type(City, city);
        return this;
    }

    public RegisterPage fillZipCode(String zipcode) {
        driver.element().type(ZipCode, zipcode);
        return this;
    }

    public RegisterPage fillMobileNumber(String mobnumber) {
        driver.element().type(MobileNumber, mobnumber);
        return this;
    }

    public RegisterPage clickOnCreateAccountButton() {
        driver.element().click(CreateAccountButton);
        return this;
    }

    public RegisterPage clickOnContinueButton() {
        driver.element().click(ContinueButton);
        return this;
    }

    public RegisterPage clickOnDeleteAccButton() {
        driver.element().click(DeleteAccButton);
        return this;
    }

    public RegisterPage clickOnContinButton() {
        driver.element().click(ContinButton);
        return this;
    }

    @Step("Validate that the user is on Home Page")
    public RegisterPage validateHomePage() {
        driver.element().verifyThat(HomePage).text().contains("Home");
        return this;
    }

    @Step("Validate that the user is on Signup Page")
    public RegisterPage validateNewUserSignup() {
        driver.element().verifyThat(NewUserSignup).text().contains("New User Signup!");
        return this;
    }

    @Step("Validate that the user is on Signup/Login Page")
    public RegisterPage validateSignupLoginPage() {
        driver.element().verifyThat(SignupLoginPage).text().contains("ENTER ACCOUNT INFORMATION");
        return this;
    }

    @Step("Validate that the user has created an account")
    public RegisterPage validateAccountCreated() {
        driver.element().verifyThat(AccountCreated).text().isEqualTo("ACCOUNT CREATED!");
        return this;
    }

    @Step("Validate that the user has logged in")
    public RegisterPage validateLoggedIn() {
        driver.element().verifyThat(LoggedIn).text().contains("Logged in as Samy");
        return this;
    }

    @Step("Validate that the user deleted account")
    public RegisterPage validateDeletedAcc() {
        driver.element().verifyThat(DeletedAcc).text().contains("ACCOUNT DELETED!");
        return this;
    }


}
