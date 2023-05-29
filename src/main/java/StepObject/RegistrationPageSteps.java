package StepObject;

import PageObject.RegistrationPage;
import io.qameta.allure.Step;


import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.switchTo;

public class RegistrationPageSteps extends RegistrationPage {


    @Step("პროფილის ტექსტი უნდა ჩანდეს და ტექსტზე დაკლიკება")
    public RegistrationPageSteps GoRegistrationPage() {
        profileText.shouldBe(visible);
        profileClick.click();
        return this;
    }
    @Step("ავტორიზაციის ღილაკი უნდა ჩანდეს")
    public RegistrationPageSteps Authorization() {
        authorizationText.shouldBe(visible);
        return this;
    }
    @Step("რეგისტაციის ტექსტზე დაკლიკება")
    public RegistrationPageSteps RegTextBtn() {
        regClick.click();
        return this;
    }
    @Step("იმაილის ველში ჩაწერა, უნდა ჩანდეს")
    public RegistrationPageSteps emailIn(String email) {
        emailInput.setValue(email);
        emailInputText.shouldBe(visible);
        return this;
    }
    @Step("პაროლის ველში ჩაწერა")
    public RegistrationPageSteps PassIn(String pass) {
        passInput.setValue(pass);
        return this;
    }
    @Step("პაროლის გამეორება")
    public RegistrationPageSteps confPassIn(String confPass) {
        confPassInput.setValue(confPass);
        return this;
    }
    @Step("ვეთანხმები წესებზე დაკლიკება გადასვლა ახალ გვედზე და უკან დაბრუნება")
    public RegistrationPageSteps AgreementIn() {
        Agreement.click();
        switchTo().window(0);
        return this;
    }

    @Step("ვეთანხმები წესების ჩეკბოქსის მონიშვნა")
    public RegistrationPageSteps Checkbox() {
        CheckMark.click();
        return this;
    }
    @Step("რეგისტრაციის ღილკზე დაკლიკება")
    public RegistrationPageSteps RegisterBtn() {
        RegBtnEnable.shouldBe(enabled);
        RegBtn.click();
        return this;
    }
    @Step("გაფთხილების მესეჯი უნდა ჩანდეს")
    public RegistrationPageSteps PopUpMessage() {
        ExitPopupMessage.shouldBe(visible);
        return this;
    }
    @Step("გაფთხილების მესეჯის გამორთვა")
    public RegistrationPageSteps PopUpOf() {
        ExitPopupClick.click();
        return this;
    }
    @Step("გაფთხილების მესეჯის გამორთვა")
    public RegistrationPageSteps Welcome() {
        WelcomeMessClick.click();
        return this;
    }
    @Step("მარცხენა გადასასვლე ისრიან ღილაკზე დაკლიკება")
    public RegistrationPageSteps ArrowLeft() {
        ClickArrowLeft.click();
        return this;
    }

    @Step("შეცდომის მესეჯი უნდა ჩანდეს")
    public RegistrationPageSteps error() {
        errorTitle.shouldBe(visible);
        return this;
    }


}
