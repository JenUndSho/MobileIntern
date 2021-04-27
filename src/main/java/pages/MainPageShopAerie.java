package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPageShopAerie {

    private AndroidDriver driver;

    public MainPageShopAerie (AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop Aerie']")
    private AndroidElement shopAerieLabel;

    public MainPageShopAerie checkIfItIsAerieShop(){
        Assert.assertEquals(shopAerieLabel.getText(), "Shop Aerie");
        return this;
    }
}
