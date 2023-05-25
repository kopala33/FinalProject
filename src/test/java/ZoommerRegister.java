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
                .Welcome()
                .ArrowLeft();
        Assert.assertTrue(registrationPageSteps.ArrowLeftBtn.isDisplayed());
        loginPageSteps.GoToLoginPage(Email)
                .passIn(Password)
                .LogInIn();
        Assert.assertFalse(loginPageSteps.LoginWelcomeText.isDisplayed());




//        SoftAssert softAssert = new SoftAssert();

        // Registration

//        softAssert.assertTrue($(byText("პროფილი")).isDisplayed());
//        $(byText("პროფილი")).click();
//        softAssert.assertTrue($(byText("ავტორიზაცია"), 1).isDisplayed());
//        $(byText("რეგისტრაცია")).click();
//        $("#Email").setValue("kopaladata@gmail.com");
//        $("#Email").shouldBe(visible);
//        $("#register-password").setValue("12345678");
//        $("#register-password").shouldBe(visible);
//        $(byAttribute("placeholder", "დაადასტურეთ პაროლი")).setValue("12345678");
//        $(byAttribute("placeholder", "დაადასტურეთ პაროლი")).shouldBe(visible);
//        $(byText("ვეთანხმები წესებს და პირობებს"), 0).click();
//        switchTo().window(0);
//        $(".checkmark", 0).click();
//        softAssert.assertTrue($("#register-button").isEnabled());
//        $("#register-button").click();
//        $(".exit_popup").shouldBe(visible);
//        $(".exit_popup").click();
//        $(".welcome-text-desktop").shouldBe(visible);
//        $(".welcome-text-desktop").click();
//        $(".fa-angle-left").shouldBe(visible);
//        $(".fa-angle-left").click();
//
//       //SingUp
//
//        $("#EmailOrPhone").setValue("kopaladata@gmail.com");
//        $("#EmailOrPhone").shouldBe(visible);
//        $("#Password").setValue("12345678");
//        $("#Password").shouldBe(visible);
//        $("#login-btn").shouldBe(enabled);
//        $("#login-btn").click();
//
//        softAssert.assertTrue($(".logged_in_welcome").isDisplayed());
//        softAssert.assertAll();

    }

//    @Test(priority = 1)
//    public void negativeTest() {


    // Bug report:  It's not supposed to pass Registration with wrong email address and password.
//
//        $(byText("პროფილი")).click();
//        $(byText("რეგისტრაცია")).click();
//        $("#Email").setValue("sdjhbfajs@jhsdfj.com");
//        $("#register-password").setValue("1m1m1m1m");
//        $(byAttribute("placeholder", "დაადასტურეთ პაროლი")).setValue("1m1m1m1m");
//        $(".checkmark", 0).click();
//        $("#register-button").click();
//        sleep(2000);
//        Assert.assertTrue($(".error_title").isDisplayed(), "შეცდომa არის ნაჩვენები");
//        $(".exit_popup").click();
//        sleep(2000);
//
//        // You cannot log in with an incorrect email or password
//
//        $(byText("პროფილი")).click();
//        $(".fa-angle-left").click();
//        $(byText("ავტორიზაცია"), 1).shouldBe(visible);
//        $("#EmailOrPhone").setValue("sdjhbfajs@jhsdfj.com");
//        Assert.assertTrue($("#EmailOrPhone").isDisplayed(), "ელ. ფოსტა  უნდა ჩანდეს");
//        $("#Password").setValue("1m1m1m1m");
//        Assert.assertTrue($("#Password").isDisplayed(), "პაროლის შეყვანა  არის ნაჩვენები");
//        $("#login-btn").click();


//    }

}
