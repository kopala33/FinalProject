import StepObject.ZoommerProductionPageSteps;
import Utills.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ZoommerProductions extends ChromeRunner {
    ZoommerProductionPageSteps zoommerProductionPageSteps = new ZoommerProductionPageSteps();

    @Test
    public void ZoommerProductionSearch() {

        zoommerProductionPageSteps.productPage()
                .productPage()
                .searchBtnIn()
                .productLaptop()
                .productInformation()
                .productIsAvailable()
                .laPView()
                .blackCircle()
                .InfoText()
                .titleSide()
                .MoreProdInfo();

    }

    @Test
    public void ZoommerProductionCount() {

        zoommerProductionPageSteps.LapClick()
                .PopMenu()
                .ByPrice()
                .productionCounts();


    }


}