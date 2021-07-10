package savitatest.SingIn;

import org.openqa.selenium.By;

class SignUpTarget {
    static By SIGN_IN_LINK = By.linkText("Sign in");
    static By EMAIL_ADDRESS_TEXT = By.id("email_create");
    static By CREATE_AN_ACCOUNT_BUTTON = By.id("SubmitCreate");
    static By EMAIL_VALIDATION_ERROR = By.xpath("//div[@id='create_account_error']/ol/li");

    static By TITLE_MRS = By.id("id_gender2");
    static By FIRST_NAME = By.id("customer_firstname");
    static By LAST_NAME = By.id("customer_lastname");
    static By EMAIL = By.xpath("//input[preceding-sibling::label[contains(text(),'Email ')]]");
    static By PASSWORD = By.id("passwd");
    static By DOB_DAYS = By.id("days");
    static By DOB_MONTH = By.id("months");
    static By DOB_YEAR = By.id("years");

    static By NEWSLETTER = By.id("newsletter");
    static By RECEIVE_MAILS = By.id("optin");
    static By ADDRESS_FIRST_NAME = By.id("firstname");
    static By ADDRESS_LAST_NAME = By.id("lastname");
    static By COMPANY = By.id("company");
    static By ADDRESS_LINE_1 = By.id("address1");
    static By ADDRESS_LINE_2 = By.id("address2");
    static By CITY = By.id("city");

    static By STATE = By.id("id_state");
    static By POSTCODE = By.id("postcode");
    static By COUNTRY = By.id("id_country");
    static By ADDITIONAL_INFO = By.id("other");
    static By HOME_PHONE = By.id("phone");
    static By MOBILE_PHONE = By.id("phone_mobile");
    static By ADDRESS_ALIAS = By.id("alias");
    static By SUBMIT_BUTTON = By.id("submitAccount");

    static By ALL_VALIDATION_ERRORS = By.xpath("//div[@class='alert alert-danger']/ol/li");
}
