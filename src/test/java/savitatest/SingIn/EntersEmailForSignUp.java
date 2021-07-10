package savitatest.SingIn;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class EntersEmailForSignUp extends UIInteractionSteps {

    @Step("Enter and enters email {0}.")
    public void entersEmail(String email) {
        $(SignUpTarget.SIGN_IN_LINK).click();
        $(SignUpTarget.EMAIL_ADDRESS_TEXT).clear();
        $(SignUpTarget.EMAIL_ADDRESS_TEXT).type(email);
        $(SignUpTarget.CREATE_AN_ACCOUNT_BUTTON).click();
    }
}
