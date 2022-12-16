package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement userInput;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement passInput;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView")
    private WebElement loginButton;

    public void enterUserInput(String user){
        userInput.sendKeys(user);
    }

    public void enterPassInput(String password){
        passInput.sendKeys(password);
    }

    public void clickLogin(){
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        loginButton.click();
    }
}
