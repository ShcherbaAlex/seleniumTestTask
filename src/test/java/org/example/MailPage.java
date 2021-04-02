package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {

    private WebDriver driver;
    @FindBy(xpath = "//div[@class='composeYabbles']")
    private WebElement toWhom;
    @FindBy(xpath = "//input[@class='composeTextField ComposeSubject-TextField']")
    private WebElement theme;
    @FindBy(xpath = "//*[@role='textbox']")
    private WebElement message;
    @FindBy(xpath = "//*[@class='control button2 button2_view_default button2_tone_default button2_size_l button2_theme_action button2_pin_circle-circle ComposeControlPanelButton-Button ComposeControlPanelButton-Button_action']")
    private WebElement sendBtn;

    public MailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickSendBtn() {
        sendBtn.click();
    }

    public void inputToWhom(String toWhom) {
        this.toWhom.sendKeys(toWhom);
    }

    public void inputTheme(String theme) {
        this.theme.sendKeys(theme);
    }

    public void inputMessage(String message) {
        this.message.sendKeys(message);
    }
}
