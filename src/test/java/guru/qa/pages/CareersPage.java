package guru.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CareersPage {

    public CareersPage checkVacancies(String url, String vacancyName) {

        step("Checking vacancy: " + vacancyName, () -> {
            $("section.vacancies-block a[href='" + url + "'] p.vacancies__name").shouldHave(text(vacancyName));
        });

        return this;
    }
}
