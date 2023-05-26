import StepObject.LoginPageSteps;
import StepObject.RegistrationPageSteps;
import Utills.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


import static DataObject.LoginPageData.Email;
import static DataObject.LoginPageData.Password;
import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;

public class ZoommerRegister extends ChromeRunner {
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();

    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test()
    public void positiveRegistration() {


        registrationPageSteps.GoRegistrationPage()
                .Authorization()
                .RegTextBtn()
                .emailIn(email)
                .PassIn(password)
                .confPassIn(confPassInput)
                .AgreementIn()
                .Checkbox()
                .RegisterBtn()
                .PopUpMessage()
                .PopUpOf()
                .Welcome()
                .ArrowLeft();
        Assert.assertTrue(registrationPageSteps.ArrowLeftBtn.isDisplayed());
        loginPageSteps.GoToLoginPage(Email)
                .passIn(Password)
                .LogInIn();
        Assert.assertFalse(loginPageSteps.LoginWelcomeText.isDisplayed());


    }


    @Test()
    public void negativeRegistration() {

        registrationPageSteps.GoRegistrationPage()
                .RegTextBtn()
                .emailIn(incorectEmail)
                .PassIn(IncorrectPassword)
                .confPassIn(incConfigPass)
                .Checkbox()
                .RegisterBtn()
                .PopUpMessage()
                .PopUpOf();

        loginPageSteps.profileBtn()
                .leftArrow()
                .avtorisationClick()
                .GoToLoginPage(incorectEmail)
                .passIn(IncorrectPassword)
                .LogInIn();


    }

}
