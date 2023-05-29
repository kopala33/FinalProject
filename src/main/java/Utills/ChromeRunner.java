package Utills;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {

    @BeforeMethod(description = "ბროუსერის გამართვა გახსნა")
    public static void setUp(){
        Configuration.browserSize = "3840x2160";
//        System.setProperty("selenide.browserSize", "3840x2160");
        open("https://zoommer.ge/");
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
    }
    @AfterMethod(description = "ქეშის,ქუქის,ლოკალ სტორიჯის გასუფთავება და ბროუსერის დახურვა")
    public void tearDown(){
        SelenideLogger.removeListener("allure");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();

    }


}
