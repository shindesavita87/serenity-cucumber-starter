package savitatest.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateToPage {

    CreateNewAccountHomePage createNewAccountHomePage;

    @Step("Open the Create New Account home page")
    public void theCreateNewAccountPage() {
        createNewAccountHomePage.open();
    }
}
