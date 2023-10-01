package guru.qa.tests;

import guru.qa.pages.CareersPage;
import guru.qa.pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@Epic(value = "Noveo demo tests")
@Feature(value = "Careers page")
public class CareersPageTests extends TestBase {

    private MainPage mainPage = new MainPage();
    private CareersPage careersPage = new CareersPage();

    @ParameterizedTest
    @Severity(value = SeverityLevel.NORMAL)
    @Issue(value = "HOMEWORK-886")
    @Story(value = "Current vacancies")
    @CsvFileSource(delimiter = ';', resources = "/currentVacancies.csv")
    @DisplayName("Check vacancies on the Careers page.")
    @Description("Checking current vacancies on the Careers page going from main page.")
    public void checkVacanciesOnTheCareerPage(String url, String text) {
        mainPage.openPage()
                .goToCareersPage();

        careersPage.checkVacancies(url, text);
    }
}
