package guru.qa.tests;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
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

        ElementsCollection headers = $$("h2");

        step("Check for headers on the main page", () -> {
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
        step("Check links on the main page", () -> {});
    }

    @Test
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
    public void checkCareerPageContent() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Click 'Careers' link", () -> {
            $("#primary-menu").find(By.linkText("careers.")).click();
        });
        step("Check contents", () -> {

        });
    }

    @Test
    public void checkContactPageContent() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Check 'About' link", () -> {});
    }

    @Test
    public void checkStoriesPageContent() {
        step("Open the main page", () -> {
            open(baseUrl);
        });

        step("Check 'About' link", () -> {});
    }
}
