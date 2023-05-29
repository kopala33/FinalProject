package StepObject;

import PageObject.ZoommerProductionPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;


public class ZoommerProductionPageSteps extends ZoommerProductionPage {
    @Step("მოსაძებნ ველში ლაპტოპის ჩაწერა")
    public ZoommerProductionPageSteps productPage() {
        searchInput.setValue("laptop");
        return this;

    }
    @Step("მოსაზებნ ღილაკზე დაკლიკება")
    public ZoommerProductionPageSteps searchBtnIn() {
        searchBtn.click();
        return this;

    }

    @Step("გამოტანილი პროდუკტებიდან ერთ-ერთის არჩევა დაკლიკებით")
    public ZoommerProductionPageSteps productLaptop() {
        laptopProduct.click();
        return this;

    }
    @Step("პროდუქტიის შესახებ იმფორმაცია უნდა ჩანდეს")
    public ZoommerProductionPageSteps productInformation() {
        productInfo.shouldBe(visible);
        productInfo2.shouldBe(visible);
        return this;

    }

    @Step("პროდუქცია ხელმისაწვდომია")
    public ZoommerProductionPageSteps productIsAvailable() {
        productIsIn.shouldBe(visible);
        return this;

    }
    @Step("პროდუქცის ყველა ხედით ნახვა სრათებზე კლიკებით")
    public ZoommerProductionPageSteps laPView() {
        lapTobVew1.click();
        lapTobVew2.click();
        lapTobVew3.click();
        return this;

    }

    @Step("პროდუქციის ჩვენების დაბრუნება პირვანდელ მდგომარეობაში შავი ღილაკის კლიკით")
    public ZoommerProductionPageSteps blackCircle() {
        blackCircleBtnVisible.shouldBe(visible);
        blackCircleBtn.click();
        return this;
    }
    @Step("პროდუქციის მონაცემების ნახვა, მეტის ნახვის ღღილაკით ჩამოშლა")
    public ZoommerProductionPageSteps InfoText() {
        productInfoText.shouldBe(visible);
        productInfoClick.click();
        return this;
    }
    @Step("მარჯვენა ზედა მონაცემიც უნდა ჩანდეს")
    public ZoommerProductionPageSteps titleSide() {
        titleLeftSide.shouldBe(visible);
        return this;
    }
    @Step("ყველა მონაცემი ნაჩვენებია")
    public ZoommerProductionPageSteps MoreProdInfo() {
        MoreInfoText.shouldBe(visible);

        return this;
    }
    @Step("მანახე დამატებითი ინფორმაცია")
    public ZoommerProductionPageSteps ProdInfo() {
        showMoreProdInfo.click();
        return this;
    }
    @Step("პროდუკტზე დაკლიკება")
    public ZoommerProductionPageSteps LapClick() {
        lapTopsClick.click();
        return this;
    }
    @Step("პოპულარული მენიუს ჩამოხსნა")
    public ZoommerProductionPageSteps PopMenu() {
        popMenu.pressEnter();
        return this;
    }
    @Step("არჩევა ფასი ზრდადობით")
    public ZoommerProductionPageSteps ByPrice() {
        byPriceRaise.click();
        return this;
    }
    @Step("ციკლი ფასი ზრდადობით")
    public ZoommerProductionPageSteps productionCounts() {

        int count = $$(byClassName("product_top_div")).size();
        System.out.println(count);
        String lapPrice = $(".product_prices", 0).$(".product_new_price").getText().replaceAll("[^\\d.]", "");
        System.out.println(lapPrice);
        float firstPriceFloat = Float.parseFloat(lapPrice);
        System.out.println(firstPriceFloat);
        for (int i = 1; i < count; i++) {
            String lapSecondPrice = $(".product_prices", i).$(".product_new_price").getText().replaceAll("[^\\d.]", "");
            float lapSecondPriceFloat = Float.parseFloat(lapSecondPrice);
            Assert.assertTrue(firstPriceFloat <= lapSecondPriceFloat);
            System.out.println(lapSecondPriceFloat);
            firstPriceFloat = lapSecondPriceFloat;
        }
        return this;
    }


}


