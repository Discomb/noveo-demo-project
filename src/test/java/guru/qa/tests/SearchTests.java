package guru.qa.tests;

import guru.qa.pages.MainPage;
import guru.qa.pages.SearchPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic(value = "Noveo demo tests")
@Feature(value = "Search page")
public class SearchTests extends TestBase {

    private MainPage mainPage = new MainPage();
    private SearchPage searchPage = new SearchPage();

    @Test
    @Story(value = "Simple search")
    @Severity(value = SeverityLevel.CRITICAL)
    @Issue(value = "HOMEWORK-886")
    @DisplayName("Check the search")
    @Description("Using the search from the main page")
    public void checkSearch() {
        String query = "Developer";

        mainPage.openPage()
                .search(query);

        searchPage.checkSearchResult(query);

    }
}
