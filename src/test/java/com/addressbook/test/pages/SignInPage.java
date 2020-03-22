package com.addressbook.test.pages;

import com.addressbook.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(id = "session_email")
    WebElement eUsernameField;
    @FindBy(id = "session_password")
    WebElement ePasswordField;
    @FindBy(name = "commit")
    WebElement eSignInButton;
    @FindBy(xpath = ".//div[@class='row']/a")
    WebElement signUpLink;

//    public StorePage fillAndLogIn(String username, String password){
//        waitElementIsInvisibility(eUsernameField);
//        eUsernameField.sendKeys(username);
//        ePasswordField.sendKeys(password);
//        eSignInButton.click();
//
//        return GetInstance(StorePage.class);
//    }
//
    public SignUpPage clickSignUp(){
        waitElementIsVisibility(signUpLink);
        signUpLink.click();
        return GetInstance(SignUpPage.class);
    }
}
