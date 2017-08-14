package com.dave.pages;

import com.dave.model.Favorites;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@NamedUrls(
    {

        @NamedUrl(name = "open.greeting", url = "/greeting?name={1}")
    }
)
public class GreetingPage extends PageObject {

    @FindBy(id = "iceCream")
    WebElement iceCream;

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "sportsTeam")
    WebElement sportsTeam;

    @FindBy(id = "rockGroup")
    WebElement rockGroup;

    @FindBy(id = "movie")
    WebElement movie;

    @FindBy(id = "vacation")
    WebElement vacation;

    @FindBy(id = "submit")
    WebElement submit;

    @WhenPageOpens
    public void verifyTitleAndUser() throws InterruptedException {
        element(iceCream).waitUntilPresent();
        element(userName).waitUntilPresent();
        element(sportsTeam).waitUntilPresent();
        element(rockGroup).waitUntilPresent();
        element(movie).waitUntilPresent();
        element(vacation).waitUntilPresent();
        element(submit).waitUntilPresent();
    }

    public void submitForm(Favorites favorites){
        iceCream.sendKeys(favorites.getIceCream());
        rockGroup.sendKeys(favorites.getRockGroup());
        movie.sendKeys(favorites.getMovie());
        sportsTeam.sendKeys(favorites.getSportsTeam());
        vacation.sendKeys(favorites.getVacation());
        submit.click();
        System.out.println("fini");
    }
}
