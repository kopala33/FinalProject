package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SmartDevicePage {


    public SelenideElement


            tvAndMonitorsText = $(byText("ტელევიზორი | მონიტორი"), 2),
            tvAndMonitors = $(byText("ტელევიზორი | მონიტორი"), 2),
            minPrice = $("#min_price"),
            maxPrice = $("#max_price"),
            priceBtn = $(".js-filter-price"),
            checkBox = $$(".checkmark").get(4),
            productLabel = $(".product_label", 0),
            tvProduct = $(".product_top_div", 0),
            addCart = $(".n-add-cart"),

            withOutClick = $(".h_basket_icon").hover(),
            moveInToBasket = $(byText("კალათაში გადასვლა")),
            productInBasket = $(".n-cart-title",1),
            basketItemCheckBox = $(".custom_checkbox",1),
            correctPrice = $(".basket_unit_price_column", 1),
            addPlusToItem = $(".fa-plus",1),

            totalPrice = $(byText("ჯამი"),2),
            clearTheCart = $(byText("კალათის გასუფთავება"),0),
            agreeToYes = $(byText("დიახ"),1),
            basketIsEmpty = $(byText("თქვენი კალათა ცარიელია"));






}
