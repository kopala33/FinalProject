package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    public SelenideElement

            profileText = $(byText("პროფილი")),
            profileClick = $(byText("პროფილი")),
            authorizationText = $(byText("ავტორიზაცია"), 1),
            regClick = $(byText("რეგისტრაცია")),
            emailInput = $("#Email"),
            emailInputText = $("#Email"),
            passInput = $("#register-password"),
            confPassInput = $(byAttribute("placeholder", "დაადასტურეთ პაროლი")),
            Agreement = $(byText("ვეთანხმები წესებს და პირობებს"), 0),
            CheckMark = $(".checkmark", 0),
            RegBtnEnable = $("#register-button"),
            RegBtn = $("#register-button"),
            ExitPopupMessage = $(".exit_popup"),
            ExitPopupClick = $(".exit_popup"),
            WelcomeMessClick = $(".welcome-text-desktop"),
            ArrowLeftBtn = $(".fa-angle-left"),
            ClickArrowLeft = $(".fa-angle-left"),
            errorTitle = $(".error_title");


}
