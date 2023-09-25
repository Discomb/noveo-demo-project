package guru.qa.tests;

import guru.qa.pages.AboutPage;
import guru.qa.pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic(value = "Noveo demo tests")
@Feature(value = "About page")
public class AboutPageTests extends TestBase{

    private MainPage mainPage = new MainPage();
    private AboutPage aboutPage = new AboutPage();

    @Test
    @Issue(value = "HOMEWORK-886")
    @Severity(value = SeverityLevel.NORMAL)
    @Story(value = "Page text block headers")
    @DisplayName("Check headers on the About page")
    @Description("Checking text block headers on the About page going from main page")
    public void checkHeadersOnTheAboutPage() {
        mainPage.openPage()
                .goToAboutPage();

        aboutPage.checkHeaders();
    }
}
