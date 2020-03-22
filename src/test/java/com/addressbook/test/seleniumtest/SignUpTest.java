package com.addressbook.test.seleniumtest;

import com.addressbook.framework.base.BrowserType;
import com.addressbook.framework.base.DriverContext;
import com.addressbook.framework.base.FrameworkInitialize;
import com.addressbook.framework.utilities.DataUtils;
import com.addressbook.test.pages.AddressBookPage;
import com.addressbook.test.pages.SignInPage;
import com.addressbook.test.pages.SignUpPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpTest extends FrameworkInitialize {

    @BeforeTest
    public void initialize(){
        InitializeBrowser(BrowserType.Chrome);
        DriverContext.Browser.goToUrl("http://a.testaddressbook.com/");
    }

    @AfterTest
    public void finished(){
        DriverContext.Browser.shutdown();
    }

    @Test()
    public void test01() throws InterruptedException {
        currentPage = GetInstance(AddressBookPage.class);
        currentPage = currentPage.As(AddressBookPage.class).clickSignIn();
        currentPage = currentPage.As(SignInPage.class).clickSignUp();

        String username = DataUtils.createEmail("bart.simpsons","yopmail.com", true);
        String password = "@bcd1234";
        currentPage = currentPage.As(SignUpPage.class).fillAndGo(username,password);
        currentPage.As(AddressBookPage.class).checkUserCurrentMenu(username);
    }
}
