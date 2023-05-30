import StepObject.SmartDevicePageSteps;
import Utills.ChromeRunner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;


public class ZoommerSmartDevices extends ChromeRunner {

    SmartDevicePageSteps smartDevicePageSteps = new SmartDevicePageSteps();

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void SmartDevices() {


        smartDevicePageSteps.DevicePage()
                .minMaxPrice()
                .PriceBtn()
                .CheckBox()
                .ProductLabel()
                .TvProduct()
                .AddCart();

    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void SmartDevicesAndBasket() {
        smartDevicePageSteps.WithOutClick()
                .MoveInToBasket()
                .ProductInBasket()
                .BasketItemCheckBox()
                .CorrectPrice()
                .AddPlusToItem()
                .TotalPrice()
                .ClearTheCart()
                .AgreeToYes()
                .BasketIsEmpty();


    }
}
