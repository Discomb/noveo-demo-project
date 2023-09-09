package guru.qa.tests;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class DevzionTests extends TestBase {

    @Test
    @DisplayName("Check for headers on the main page")
    @Description("Check for headers on the main page")
    public void contentHeadersOnMainPageArePresent() {

        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Check for welcome text", () -> {
            $("#duplicate-preload-text").shouldHave(text("welcome to zion development"));
        });
        step("Check for headers on the main page", () -> {
            ElementsCollection headers = $$("h2");
            headers.findBy(text("what we do")).shouldHave(text("what we do"));
            headers.findBy(text("what we offer")).shouldHave(text("what we offer"));
            headers.findBy(text("who we partner with")).shouldHave(text("who we partner with"));
            headers.findBy(text("how we work")).shouldHave(text("how we work"));
            headers.findBy(text("where we’re based")).shouldHave(text("where we’re based"));
            headers.findBy(text("where we’re based")).shouldHave(text("where we’re based"));
            headers.findBy(text("who we are")).shouldHave(text("who we are"));
            headers.findBy(text("what we say")).shouldHave(text("what we say"));
        });
    }

    @Test
    public void linksOnMainPageArePresent() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Check links on the main page", () -> {
            $("#primary-menu a[href='https://devzion.com/']").shouldHave(text("about us."));
            $("#primary-menu a[href='https://devzion.com/careers/']").shouldHave(text("careers."));
            $("#primary-menu a[href='https://devzion.com/contacts/']").shouldHave(text("contacts."));
            $("#primary-menu a[href='https://devzion.com/zionstories/']").shouldHave(text("#zionstories"));
        });
    }

    @Test
    @Disabled
    public void checkAboutLink() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Click 'About us' link", () -> {
            $("#primary-menu").find(By.linkText("about us.")).click();
        });
        step("Check for welcome text", () -> {
            $("#duplicate-preload-text").shouldHave(text("welcome to zion development"));
        });
    }

    @Test
    @Disabled
    public void checkCareerPageContent() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Click 'careers' link", () -> {
            $("#primary-menu").find(By.linkText("careers.")).click();
        });
        step("Check contents", () -> {
            ElementsCollection headers = $$("h2");
            headers.findBy(text("why choose ZION")).shouldHave(text("why choose ZION"));
            headers.findBy(text("job listings")).shouldHave(text("job listings"));
            headers.findBy(text("tips for acinfg the interview")).shouldHave(text("tips for acing the interview"));
            headers.findBy(text("relocate with us")).shouldHave(text("relocate with us"));
        });
    }

    @Test
    @Disabled
    public void checkContactPageContent() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Click 'contacts' link", () -> {
            $("#primary-menu").find(By.linkText("contacts.")).click();
        });
        step("Check contents", () -> {
            $(".kt-inside-inner-col p").shouldHave(text("Email: info@devzion.com\n" +
                    "СЕО: Vitalii Zinovevv\n" +
                    "Georgia, Tbilisi, 37m Ilia Chavchavadze Avenue"));
            switchTo().frame($("iframe[src^='https://www.google.com/maps/']"));
            $("div.place-name").shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("37m Ilia Chavchavadze Avenue"));
        });
    }

    @Test
    @Disabled
    public void checkStoriesPageContent() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Click 'zionstories' link", () -> {
            $("#primary-menu").find(By.linkText("#zionstories")).click();
        });
        step("Check header", () -> {
            $(".stories__title").shouldHave(text("zions stories"));
        });
    }
}
