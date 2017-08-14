package com.dave.steps;

import com.dave.model.Favorites;
import com.dave.pages.GreetingPage;
import com.dave.pages.ThankYouPage;
import net.thucydides.core.annotations.Step;


import static org.junit.Assert.assertEquals;

public class UserSteps {

    GreetingPage greetingPage;

    ThankYouPage thankYouPage;

    @Step
    public void opensGreetingPage(String name){
        greetingPage.open("open.greeting", new String[]{name});
    }

    @Step
    public void submitsFavorites(Favorites favorites) {
        greetingPage.submitForm(favorites);

    }

    @Step
    public void shouldSeeThankYou() {
        thankYouPage.verifyUser();
    }
}
