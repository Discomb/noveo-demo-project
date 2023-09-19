package guru.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CareersPage {

    public CareersPage checkVacancies(){

        step("Check vacancies", () -> {
            $("section.vacancies-block a[href='/vacancy/menedzher-proektov-it-project-manager'] p.vacancies__name")
                    .shouldHave(text("Менеджер проектов / IT Project Manager"));
            $("section.vacancies-block a[href='/vacancy/devops-engineer-azure'] p.vacancies__name")
                    .shouldHave(text("DevOps Engineer (Azure)"));
            $("section.vacancies-block a[href='/vacancy/product-support-engineer'] p.vacancies__name")
                    .shouldHave(text("Product Support Engineer"));
            $("section.vacancies-block a[href='/vacancy/biznes-analitik'] p.vacancies__name")
                    .shouldHave(text("Бизнес-аналитик"));
            $("section.vacancies-block a[href='/vacancy/qa-automation-engineer-python-selenium'] p.vacancies__name")
                    .shouldHave(text("QA Automation Engineer (Python / Selenium)"));
            $("section.vacancies-block a[href='/vacancy/python-developer-django'] p.vacancies__name")
                    .shouldHave(text("Python developer (Django)"));
        });

        return this;
    }
}
