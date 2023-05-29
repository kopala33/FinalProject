package StepObject;

import PageObject.SmartDevicePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

public class SmartDevicePageSteps extends SmartDevicePage {
    @Step("ტელეზივორების და მონიტორების თექსტი უნდა ჩანდეს. დაკლიკება")
    public SmartDevicePageSteps DevicePage() {
        tvAndMonitorsText.shouldBe(visible);
        tvAndMonitors.click();
        return this;

    }
    @Step("მინიმაური და მაქსიმალურის ფასის ველში ჩაწერა")
    public SmartDevicePageSteps minMaxPrice() {
        minPrice.shouldBe(visible).setValue("1000");
        maxPrice.shouldBe(visible).setValue("5000");
        return this;

    }
    @Step("მინიმალირი და მაქსიმალური ღირებულების დადასტურების ღილაკზე დაკლიკება")
    public SmartDevicePageSteps PriceBtn() {
        priceBtn.click();
        return this;

    }
    @Step("გარკვეული ფირმის პროდუქციის ჩეკბოქსის ფილტრის მონიშვნა")
    public SmartDevicePageSteps CheckBox() {
        checkBox.click();
        return this;

    }
    @Step("მოცემული პროდუციის არჩევა")
    public SmartDevicePageSteps ProductLabel() {
        productLabel.click();
        return this;

    }
    @Step("მოცემული პროდუციის არჩევა დაკლიკება")
    public SmartDevicePageSteps TvProduct() {
        tvProduct.click();
        return this;

    }

    @Step("კალათაში დამატება")
    public SmartDevicePageSteps AddCart() {
        addCart.click();
        return this;

    }
    @Step("კალათაში შესასვლელად ჰოვერის მეტოდის მეშვეობით კალათაში შესასვლელი მენიუს ჩამოშლა")
    public SmartDevicePageSteps WithOutClick() {
        withOutClick.hover();
        return this;

    }
    @Step("კალათაში შესვლა")
    public SmartDevicePageSteps MoveInToBasket() {
        moveInToBasket.click();
        return this;

    }
    @Step("კალათაში დამატებული პროდუქტი უნდა ჩანდეს")
    public SmartDevicePageSteps ProductInBasket() {
        productInBasket.shouldBe(visible);
        return this;

    }
    @Step("კალათაში მოთავსებული პროდუქტის ამღნიშვნელი ჩეკბოკსის მონიშვნა")
    public SmartDevicePageSteps BasketItemCheckBox() {
        basketItemCheckBox.click();
        return this;

    }

    @Step("კალათაში მოთავსებული პროდუქტის ამღნიშვნელი ჩეკბოკსის მონიშვნა")
    public SmartDevicePageSteps CorrectPrice() {
        correctPrice.shouldBe(visible);
        return this;

    }
    @Step("არჩეული პროდუქციის ფასის გაორმაგება დამატება პლიუს ღილაკით")
    public SmartDevicePageSteps AddPlusToItem() {
        addPlusToItem.click();
        return this;

    }
    @Step("გაორმაგებული ფასის უნდა ჩანდეს")
    public SmartDevicePageSteps TotalPrice() {
        totalPrice.shouldBe(visible);
        return this;

    }
    @Step("კალათიდან პროდუქციის წაშლა")
    public SmartDevicePageSteps ClearTheCart() {

        clearTheCart.click();
        return this;

    }
    @Step("ვეთანხმები კი-თ გაუქმების მესეჯს")
    public SmartDevicePageSteps AgreeToYes() {
        agreeToYes.click();
        return this;

    }
    @Step("კალათა ცარიელია")
    public SmartDevicePageSteps BasketIsEmpty() {

        basketIsEmpty.click();
        return this;

    }


}
