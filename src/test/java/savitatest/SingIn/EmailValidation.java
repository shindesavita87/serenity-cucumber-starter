package savitatest.SingIn;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import savitatest.SingIn.SignUpTarget;


public class EmailValidation extends UIInteractionSteps {

    @Step("Click on Sing up button without entering an email.")
    public void clickOnCreateAnAccount() {
        $(SignUpTarget.SIGN_IN_LINK).click();
        $(SignUpTarget.EMAIL_ADDRESS_TEXT).clear();
        $(SignUpTarget.CREATE_AN_ACCOUNT_BUTTON).click();
    }
}
