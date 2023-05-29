package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ZoommerProductionPage {

    public SelenideElement

            searchInput = $(byName("q")),
            searchBtn = $(".h_search_btn"),
            laptopProduct = $(".product_top_div", 5),
            productInfo = $(".product-information"),
            productInfo2 = $(".product-s-d"),
            productIsIn = $(byText("მარაგშია"), 0),
            lapTobVew1 = $(".active", 2),
            lapTobVew2 = $(".active", 3),
            lapTobVew3 = $(".active", 4),
            blackCircleBtnVisible = $(".spec-color-o"),
            blackCircleBtn = $(".spec-color-o"),
            productInfoText = $(byText("მახასიათებლები"), 1),
            productInfoClick = $(byText("მახასიათებლები"), 1),
            titleLeftSide = $(".title_left_side"),
            MoreInfoText = $("#show-more-spec"),
            showMoreProdInfo = $("#show-more-spec"),

            lapTopsClick = $(byText("ლეპტოპები | IT"), 2),

            popMenu = $(byText("პოპულარული"),0),

            byPriceRaise = $(byText("ფასი: ზრდადობით"));

}
