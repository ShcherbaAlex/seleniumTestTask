package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {

    private WebDriver driver;
    @FindBy(xpath = "//*[@href='#compose']")
    private WebElement writeBtn;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String countMails() {
        List<WebElement> mails = driver.findElements(By.xpath("//span[text()='Simbirsoft Тестовое задание']"));
        return Integer.toString(mails.size());
    }

    public void clickWriteBtn() {
        writeBtn.click();
    }
}
