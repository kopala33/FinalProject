package StepObject;

import PageObject.RegistrationPage;


import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.switchTo;

public class RegistrationPageSteps extends RegistrationPage {


    // registracia
    public RegistrationPageSteps GoRegistrationPage() {
        profileText.shouldBe(visible);
        profileClick.click();
        return this;
    }

    public RegistrationPageSteps Authorization() {
        authorizationText.shouldBe(visible);
        return this;
    }

    public RegistrationPageSteps RegTextBtn() {
        regClick.click();
        return this;
    }

    public RegistrationPageSteps emailIn(String email) {
        emailInput.setValue(email);
        emailInputText.shouldBe(visible);
        return this;
    }

    public RegistrationPageSteps PassIn(String pass) {
        passInput.setValue(pass);
        return this;
    }
    public RegistrationPageSteps confPassIn(String confPass) {
        confPassInput.setValue(confPass);
        return this;
    }

    public RegistrationPageSteps AgreementIn() {
        Agreement.click();
        switchTo().window(0);
        return this;
    }


    public RegistrationPageSteps Checkbox() {
        CheckMark.click();
        return this;
    }

    public RegistrationPageSteps RegisterBtn() {
        RegBtnEnable.shouldBe(enabled);
        RegBtn.click();
        return this;
    }

    public RegistrationPageSteps PopUpMessage() {
        ExitPopupMessage.shouldBe(visible, Duration.ofMillis(3000));
        ExitPopupClick.click();
        return this;
    }

    public RegistrationPageSteps Welcome() {
        WelcomeMessText.shouldBe(visible);
        WelcomeMessClick.click();
        return this;
    }

//    public RegistrationPageSteps ArrowBtn() {
//        ArrowLeftBtn.shouldBe(visible);
//        return this;
//    }
    public RegistrationPageSteps ArrowLeft() {
        ClickArrowLeft.click();
        return this;
    }




}
