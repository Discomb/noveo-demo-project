package guru.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CareersPage {

    public CareersPage checkVacancies(String selector, String text) {

        step("Checking vacancy: " + text, () -> {
            $(selector).shouldHave(text(text));
        });

        return this;
    }
}
