import StepObject.LoginPageSteps;
import StepObject.RegistrationPageSteps;
import Utills.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;


import static DataObject.LoginPageData.Email;
import static DataObject.LoginPageData.Password;
import static DataObject.RegistrationPageData.*;


public class ZoommerRegister extends ChromeRunner {
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();

    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test
    @Description("რეგისტრაციის შემოწმება დადებითი მნიშვნელობებით")
    @Severity(SeverityLevel.CRITICAL)
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
                .passIn(Password);
        Assert.assertTrue(loginPageSteps.LoginBtn.isEnabled());


    }


    @Test
    @Description("რეგისტრაციის შემოწმება უარყოფითი მნიშვნელობებით")
    @Severity(SeverityLevel.CRITICAL)
    public void negativeRegistration() {

        registrationPageSteps.GoRegistrationPage()
                .RegTextBtn()
                .emailIn(incorrectEmail)
                .PassIn(IncorrectPassword)
                .confPassIn(incConfigPass)
                .Checkbox()
                .RegisterBtn()
                .PopUpMessage()
                .PopUpOf();
        loginPageSteps.profileBtn()
                .leftArrow()
                .avtorisationClick()
                .GoToLoginPage(incorrectEmail)
                .passIn(IncorrectPassword);
        Assert.assertTrue(loginPageSteps.LoginBtn.isEnabled());


    }

}
