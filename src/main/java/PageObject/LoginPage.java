package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    public SelenideElement

            emailInput = $("#EmailOrPhone"),
            emailInputText = $("#EmailOrPhone"),
            passInput = $("#Password"),
            passInputText = $("#Password"),
            LoginBtn = $("#login-btn"),
            ProfileTextBtn = $(byText("პროფილი")),
            ClickLeftArrow = $(".fa-angle-left"),
            avtorisationIn = $(byText("ავტორიზაცია"), 1);


}
