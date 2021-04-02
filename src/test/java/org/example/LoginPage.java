package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    @FindBy(xpath = "//*[contains(@id, 'passp-field-login')]")
    private WebElement loginField;
    @FindBy(xpath = "//*[contains(text(), 'Войти')]/..")
    private WebElement LoginBtn;
    @FindBy(xpath = "//*[contains(@id, 'passp-field-passwd')]")
    private WebElement passwordField;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void clickLoginBtn() {
        LoginBtn.click();
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

}
