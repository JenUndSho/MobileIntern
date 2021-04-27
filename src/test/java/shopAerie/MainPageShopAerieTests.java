package shopAerie;

import baseConfings.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class MainPageShopAerieTests extends BaseTest {

    @Epic("Test Application")
    @Feature("Main Page Shop Aerie Tests")
    @Story("Positive")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that user visit Shop Aerie")
    @Test
    public void userIsAbleToVisitShopAerie(){
        preMainPages.clickOnAcceptBtn()
                .clickNoThanksBtn()
                .clickAerieShopNowBtn();

        mainPageShopAerie.checkIfItIsAerieShop();
    }
}
