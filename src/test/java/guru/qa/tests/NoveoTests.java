package guru.qa.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class NoveoTests extends TestBase {

    @Test
    @DisplayName("Check text on the main page")
    @Description("Check text on the main page")
    public void checkTextOnTheMainPage() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Check the text", () -> {
            $(".index-poster__info").shouldHave(text("\n" +
                    "РАЗРАБАТЫВАЕМ\n" +
                    "качественное ПО\n" +
                    "и проводим независимое тестирование"));
        });
    }

    @Test
    @DisplayName("Check menu headers on the main page")
    @Description("Check menu headers on the main page")
    public void checkMenuHeadersOnTheMainPage() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Check menu headers", () -> {
            $(".header__menu a[href='/about']").shouldHave(text("О компании"));
            $(".header__menu a[href='//xn--80aac6chp.xn--b1agwec.xn--p1ai/']").shouldHave(text("Вакансии"));
            $(".header__menu a[href='https://стажировки.новео.рф/']").shouldHave(text("Стажировки"));
            $(".header__menu a[href='/contact']").shouldHave(text("Контакты"));
        });
    }

    @Test
    @DisplayName("Check headers on the About page")
    @Description("Check headers on the About page")
    public void checkHeadersOnTheAboutPage() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Click the About link", () -> {
            $(".header__menu a[href='/about']").click();
        });
        step("Check headers", () -> {
            $$("h2.index__title").findBy(text("Новео - это")).shouldBe(visible);
            $$("h2.index__title").findBy(text("Командная работа")).shouldBe(visible);
            $$("h2.index__title").findBy(text("Ценности Новео")).shouldBe(visible);
            $$("h2.index__title").findBy(text("Наша жизнь")).shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Check vacancies on the Careers page")
    @Description("Check vacancies on the Careers page")
    public void checkVacanciesOnTheCareerPage() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Click the Careers link", () -> {
            $(".header__menu a[href='//xn--80aac6chp.xn--b1agwec.xn--p1ai/']").click();
        });
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
    }

    @Test
    @DisplayName("Check the search")
    @Description("Check the search")
    public void checkSearch() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Use the search", () -> {
            $(".js-header-search-btn .icon-svg").click();
            $("#search").setValue("Developer").submit();
        });
        step("Check the search result", () -> {
            $(".search-page__found-title").shouldHave(text("Python developer (Django)"));
            $(".search-page__found-descripton").shouldHave(text("Мы — международная IT-компания НОВЕО"));
        });
    }
}
