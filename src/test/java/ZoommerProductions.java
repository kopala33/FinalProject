import StepObject.ZoommerProductionPageSteps;
import Utills.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ZoommerProductions extends ChromeRunner {
    ZoommerProductionPageSteps zoommerProductionPageSteps = new ZoommerProductionPageSteps();

    @Test
    @Severity(SeverityLevel.NORMAL)
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
    @Severity(SeverityLevel.NORMAL)
    public void ZoommerProductionCount() {

        zoommerProductionPageSteps.LapClick()
                .PopMenu()
                .ByPrice()
                .productionCounts();


    }


}