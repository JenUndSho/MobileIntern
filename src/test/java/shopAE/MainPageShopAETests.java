package shopAE;

import baseConfings.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class MainPageShopAETests extends BaseTest {

    @Epic("Test Application")
    @Feature("Main Page Shop AE Tests")
    @Story("Positive")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that user visit Shop AE")
    @Test
    public void userIsAbleToVisitShopAE(){
        preMainPages.clickOnAcceptBtn()
                .clickNoThanksBtn()
                .clickAEShopNowBtn();

        mainPageShopAE.checkIfItIsAEShop();
    }
}
