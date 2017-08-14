package com.dave.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@NamedUrls(
    {
        @NamedUrl(name = "thankyou", url = "/thankYou?name={1}")
    }
)
public class ThankYouPage extends PageObject {
    @FindBy(id = "userName")
    WebElement userName;

    @WhenPageOpens
    public void verifyUser() {
        element(userName).waitUntilPresent();
    }
}
