package com.addressbook.test.pages;

import com.addressbook.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.assertj.core.api.Assertions;

public class AddressBookPage extends BasePage {
    @FindBy(id = "sign-in")
    WebElement signInLink;

    @FindBy(xpath = ".//div[@id='navbar']//a[1]")
    WebElement homeLink;

    @FindBy(xpath = ".//div[@id='navbar']/div[2]/span")
    WebElement currentUser;

    @FindBy(xpath = ".//div[@id='navbar']/div[1]/a[2]")
    WebElement addressesLink;

    public SignInPage clickSignIn(){
        waitElementIsVisibility(signInLink);
        signInLink.click();
        return GetInstance(SignInPage.class);
    }

    public void checkUserCurrentMenu(String username){
        waitElementIsVisibility(currentUser);
        Assertions.assertThat(currentUser.getText())
                .isEqualTo(username);

    }

}
