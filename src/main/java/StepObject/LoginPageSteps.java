package StepObject;

import PageObject.LoginPage;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.visible;

public class LoginPageSteps extends LoginPage {


    public LoginPageSteps GoToLoginPage(String email) {

        emailInput.setValue(email);
        emailInputText.shouldBe(visible);
        return this;
    }

    public LoginPageSteps passIn(String pass) {

        passInput.setValue(pass);
        passInputText.shouldBe(visible);
        return this;
    }

    public LoginPageSteps LogInIn() {
        LoginBtn.click();
        return this;
    }


    public LoginPageSteps profileBtn() {
        ProfileTextBtn.click();
        return this;
    }
    public LoginPageSteps leftArrow() {
        ClickLeftArrow.click();
        return this;
    }
    public LoginPageSteps avtorisationClick() {
        avtorisationIn.click();
        return this;
    }




}
