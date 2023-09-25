package guru.qa.tests;

import guru.qa.pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Epic(value = "Noveo demo tests")
@Feature(value = "Main page")
public class MainPageTests extends TestBase {

    private MainPage mainPage = new MainPage();

    @Test
    @Severity(value = SeverityLevel.MINOR)
    @Issue(value = "HOMEWORK-886")
    @Story(value = "Welcome text")
    @DisplayName("Check text on the main page")
    @Description("Checking only the welcome text on the main page")
    public void checkTextOnTheMainPage() {
        mainPage
                .openPage()
                .checkWelcomeText();
    }

    @Test
    @Severity(value = SeverityLevel.CRITICAL)
    @Issue(value = "HOMEWORK-886")
    @Story(value = "Menu headers")
    @DisplayName("Check menu headers on the main page")
    @Description("Checking correlation between menu headers names and their links on the main page")
    public void checkMenuHeadersOnTheMainPage() {
        mainPage
                .openPage()
                .checkMenuHeaders();
    }

}
