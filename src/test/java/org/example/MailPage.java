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
    @FindBy(xpath = "//button[@data-lego='react'][@aria-disabled='false']")
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
