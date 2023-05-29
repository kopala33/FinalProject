import StepObject.SmartDevicePageSteps;
import Utills.ChromeRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;


public class SmartDevices extends ChromeRunner {

    SmartDevicePageSteps smartDevicePageSteps = new SmartDevicePageSteps();

    @Test
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
