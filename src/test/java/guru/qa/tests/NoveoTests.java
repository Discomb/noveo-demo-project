package guru.qa.tests;

import guru.qa.pages.AboutPage;
import guru.qa.pages.CareersPage;
import guru.qa.pages.MainPage;
import guru.qa.pages.SearchPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NoveoTests extends TestBase {

    MainPage mainPage = new MainPage();
    CareersPage careersPage = new CareersPage();
    AboutPage aboutPage = new AboutPage();
    SearchPage searchPage = new SearchPage();

    @Test
    @DisplayName("Check text on the main page")
    @Description("Check text on the main page")
    public void checkTextOnTheMainPage() {
        mainPage
                .openPage()
                .checkWelcomeText();
    }

    @Test
    @DisplayName("Check menu headers on the main page")
    @Description("Check menu headers on the main page")
    public void checkMenuHeadersOnTheMainPage() {
        mainPage
                .openPage()
                .checkMenuHeaders();
    }

    @Test
    @DisplayName("Check headers on the About page")
    @Description("Check headers on the About page")
    public void checkHeadersOnTheAboutPage() {
        mainPage.openPage()
                .goToAboutPage();

        aboutPage.checkHeaders();
    }

    @Test
    @DisplayName("Check vacancies on the Careers page")
    @Description("Check vacancies on the Careers page")
    public void checkVacanciesOnTheCareerPage() {
        mainPage.openPage()
                .goToCareersPage();

        careersPage.checkVacancies();
    }

    @Test
    @DisplayName("Check the search")
    @Description("Check the search")
    public void checkSearch() {
        String query = "Developer";

        mainPage.openPage()
                .search(query);

        searchPage.checkSearchResult(query);
    }
}
