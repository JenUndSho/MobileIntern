package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PreMainPages {

    private AndroidDriver driver;

    public PreMainPages(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    @AndroidFindBy(id = "ccpa_accept")
    private AndroidElement acceptBtn;

    @AndroidFindBy(id = "disable")
    private AndroidElement noThanksBtn;

    @AndroidFindBy(id = "button_shop_aeo")
    private AndroidElement aeShop;

    @AndroidFindBy(id = "button_shop_aerie")
    private AndroidElement aerieShop;


    public PreMainPages clickOnAcceptBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.visibilityOf(acceptBtn));
        acceptBtn.click();
        return this;
    }

    public PreMainPages clickNoThanksBtn(){
        noThanksBtn.click();
        return this;
    }

    public PreMainPages clickAEShopNowBtn(){
        aeShop.click();
        return this;
    }

    public PreMainPages clickAerieShopNowBtn(){
        aerieShop.click();
        return this;
    }


}
