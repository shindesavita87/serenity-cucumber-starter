package savitatest.SingIn;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class PersonalDetailsValidationErrors extends UIInteractionSteps {

    @Step("Click on Register button without entering any details.")
    public void clickOnRegisterAccount() {
        $(SignUpTarget.SUBMIT_BUTTON).click();
    }

    public List<String> getAllErrorMessages() {
        List<WebElement> errors=getDriver().findElements(By.xpath("//div[@class='alert alert-danger']/ol/li"));
        List<String> actualErrorMessages = new ArrayList<String>();
        for (WebElement err : errors)
        {
            System.out.println(err.getText());
            actualErrorMessages.add(err.getText());
        }
        return actualErrorMessages;
    }
}
