package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPageShopAE {

    private AndroidDriver driver;

    public MainPageShopAE(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop AE']")
    private AndroidElement shopAELabel;

    public MainPageShopAE checkIfItIsAEShop(){
        Assert.assertEquals(shopAELabel.getText(), "Shop AE");
        return this;
    }
}
