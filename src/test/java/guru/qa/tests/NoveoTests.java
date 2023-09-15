package guru.qa.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class NoveoTests extends TestBase {

    @Test
    @DisplayName("Check headers on the main page")
    @Description("Check headers on the main page")
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
    @DisplayName("Check headers on the main page")
    @Description("Check headers on the main page")
    public void checkMenuHeadersOnTheMainPage() {
        step("Open the main page", () -> {
            open(baseUrl);
        });
        step("Check the text", () -> {
            $(".header__menu a[href='/about']").shouldHave(text("О компании"));
            $(".header__menu a[href='//xn--80aac6chp.xn--b1agwec.xn--p1ai/']").shouldHave(text("Вакансии"));
            $(".header__menu a[href='https://стажировки.новео.рф/']").shouldHave(text("Стажировки"));
            $(".header__menu a[href='/contact']").shouldHave(text("Контакты"));
        });
    }

    @Test
    @DisplayName("Check headers on the main page")
    @Description("Check headers on the main page")
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
}
