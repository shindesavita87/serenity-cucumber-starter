package savitatest.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import savitatest.SingIn.*;
import savitatest.navigation.NavigateToPage;
import session.SessionData;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class SignInSteps {

    @Steps
    NavigateToPage navigateToPage;

    @Steps
    EntersEmailForSignUp createNewAccountEmail;
    EmailValidation emailValidation;
    ErrorMessage errorMessage;
    EnterPersonalInfoForSignUp enterPersonalInfoForSignUp;
    PersonalDetailsValidationErrors personalDetailsValidationErrors;

    String randomEmail, email;

    @Given("Savita on create account page")
    public void on_create_account_page() {

        navigateToPage.theCreateNewAccountPage();
    }

    @And("Enter email id for sign in")
    public void enter_email_id_for_sign_in() {
        randomEmail=RandomStringUtils.random(10, true, true);
        email=randomEmail+"@gmail.com";

        SessionData.INSTANCE.setEmail(email);
        createNewAccountEmail.entersEmail(email);

    }

    @Given("^clicks on Create An Account Button$")
    public void click_on_Create_An_Account_Button() {

        emailValidation.clickOnCreateAnAccount();
    }

    @Then("^validation error message should be shown$")
    public void validation_error_message_should_be_shown() {
        assertThat(errorMessage.getValidationError()).isEqualTo("Invalid email address.");
    }


    @And("^Enter personal information on sign up form and clicks on Register button$")
    public void enter_personal_information_on_sign_up_form_and_clicks_on_Register_button() {
        String emailID=SessionData.INSTANCE.getEmail();
        enterPersonalInfoForSignUp.entersPersonalInformation();
        assertThat(enterPersonalInfoForSignUp.verifyEmail().trim()).isEqualTo(emailID);
        enterPersonalInfoForSignUp.enterAddressDetails();

    }

    @Then("^She get registered successfully$")
    public void she_get_registered_successfully() {
        assertThat(enterPersonalInfoForSignUp.verifyTitleAfterSignUp()).isEqualTo("My account - My Store");
    }

    @Given("^she clicks on Register button$")
    public void she_clicks_on_Register_button() {
      personalDetailsValidationErrors.clickOnRegisterAccount();
    }

    @Then("^all validation messages for that page should be shown$")
    public void all_validation_messages_for_that_page_should_be_shown() {
        List<String> expectedMessages = new ArrayList<String>();
        expectedMessages.add("You must register at least one phone number.");
        expectedMessages.add("lastname is required.");
        expectedMessages.add("firstname is required.");
        expectedMessages.add("passwd is required.");
        expectedMessages.add("address1 is required.");
        expectedMessages.add("city is required.");
        expectedMessages.add("The Zip/Postal code you've entered is invalid. It must follow this format: 00000");
        expectedMessages.add("This country requires you to choose a State.");
        assertThat(personalDetailsValidationErrors.getAllErrorMessages()).isEqualTo(expectedMessages);
    }
}
