package savitatest.SingIn;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class ErrorMessage extends UIInteractionSteps {

    public String getValidationError() {
        return find(SignUpTarget.EMAIL_VALIDATION_ERROR).getText();
    }
}
