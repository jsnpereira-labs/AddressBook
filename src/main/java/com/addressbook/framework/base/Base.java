package com.addressbook.framework.base;

import org.openqa.selenium.support.PageFactory;

public class Base {

    public static BasePage currentPage;

    public <TPage extends BasePage> TPage GetInstance(Class<TPage> page) {
        Object obj = PageFactory.initElements(DriverContext.Driver, page);
        return page.cast(obj);
    }
}
