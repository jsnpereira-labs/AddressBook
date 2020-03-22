package com.addressbook.test.pages;

import com.addressbook.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

    @FindBy(id = "user_email")
    WebElement usernameField;

    @FindBy(id = "user_password")
    WebElement passwordField;

    @FindBy(name = "commit")
    WebElement signUpbutton;

    @FindBy(xpath = ".//div[@class='row']/a")
    WebElement signInLink;

    public AddressBookPage fillAndGo(String username, String passoword){
        waitElementIsVisibility(usernameField);
        waitElementIsVisibility(passwordField);
        waitElementIsVisibility(signUpbutton);

        usernameField.sendKeys(username);
        passwordField.sendKeys(passoword);
        signUpbutton.click();
        return GetInstance(AddressBookPage.class);
    }
}
