package com.dave;

import com.dave.model.Favorites;
import com.dave.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class WhenAskedForFavorites {

    public static final String USER_NAME = "david";
    @Managed
    WebDriver driver;

    @Steps
    UserSteps user;

    @Test
    public void shouldAskForFavoritesTest(){

        // Given
        user.opensGreetingPage(USER_NAME);

        //When
        Favorites favorites = new Favorites(USER_NAME);
        favorites.setIceCream("cookiesAndCream");
        favorites.setMovie("MeetTheParents");
        favorites.setRockGroup("Led Zeppelin");
        favorites.setVacation("Italy");
        favorites.setSportsTeam("White Sox");
        user.submitsFavorites(favorites);

        //Then
        user.shouldSeeThankYou();
    }
}
