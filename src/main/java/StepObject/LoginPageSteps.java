package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class LoginPageSteps extends LoginPage {

    @Step("რეგისტრაციის გვერზე გადასვლა")
    public LoginPageSteps GoToLoginPage(String email) {

        emailInput.setValue(email);
        emailInputText.shouldBe(visible);
        return this;
    }
    @Step("რეგისტრაციის ველში იმაილის ჩაწერა")
    public LoginPageSteps passIn(String pass) {

        passInput.setValue(pass);
        passInputText.shouldBe(visible);
        return this;
    }

    @Step("პროფილის ღილაკძე დაკლიკება")
    public LoginPageSteps profileBtn() {
        ProfileTextBtn.click();
        return this;
    }
    @Step("პროფილის გვერძე მარცხენა ისრის ღილაკზე გადასვლა ")
    public LoginPageSteps leftArrow() {
        ClickLeftArrow.click();
        return this;
    }
    @Step("ავტორიზაციის ღილაკი აქტიურია")
    public LoginPageSteps avtorisationClick() {
        avtorisationIn.shouldBe(enabled);
        return this;
    }


}
