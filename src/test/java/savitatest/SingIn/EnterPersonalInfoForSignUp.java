package savitatest.SingIn;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class EnterPersonalInfoForSignUp extends UIInteractionSteps {

    @Step("Enter YOUR PERSONAL INFORMATION on CREATE AN ACCOUNT page.")
    public void entersPersonalInformation() {
        $(SignUpTarget.TITLE_MRS).click();
        $(SignUpTarget.FIRST_NAME).type("Savita");
        $(SignUpTarget.LAST_NAME).type("Shinde");
        $(SignUpTarget.PASSWORD).type("@Savita20");
        $(SignUpTarget.DOB_DAYS).selectByValue("20");
        $(SignUpTarget.DOB_MONTH).selectByVisibleText("May ");
        $(SignUpTarget.DOB_YEAR).selectByIndex(31);
        $(SignUpTarget.NEWSLETTER).click();
        $(SignUpTarget.RECEIVE_MAILS).click();
    }

    public String verifyEmail()
    {
        System.out.println("Get Value: "+ $(SignUpTarget.EMAIL).getValue());
        System.out.println("Get attribute: " + $(SignUpTarget.EMAIL).getAttribute("value"));

        return  $(SignUpTarget.EMAIL).getAttribute("value");

    }

    @Step("Enter YOUR ADDRESS on CREATE AN ACCOUNT page.")
    public void enterAddressDetails() {
        $(SignUpTarget.ADDRESS_FIRST_NAME).type("Savita");
        $(SignUpTarget.ADDRESS_LAST_NAME).type("Shinde");
        $(SignUpTarget.COMPANY).type("Savita Pvt Ltd");
        $(SignUpTarget.ADDRESS_LINE_1).type("Address Line 1");
        $(SignUpTarget.ADDRESS_LINE_2).type("Address line 2");
        $(SignUpTarget.CITY).type("Pune");
        $(SignUpTarget.STATE).selectByVisibleText("New York");
        $(SignUpTarget.POSTCODE).type("12345");
        $(SignUpTarget.COUNTRY).selectByVisibleText("United States");
        $(SignUpTarget.ADDITIONAL_INFO).type("This is additional info which is not required at all.");
        $(SignUpTarget.HOME_PHONE).type("1234567890");
        $(SignUpTarget.MOBILE_PHONE).type("90876544321");
        $(SignUpTarget.ADDRESS_ALIAS).type("AddAlias");
        $(SignUpTarget.SUBMIT_BUTTON).click();
    }


    public String verifyTitleAfterSignUp()
    {
        return  getDriver().getTitle();
    }
}
