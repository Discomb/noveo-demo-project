package guru.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class AboutPage {

    public void checkHeaders() {
        step("Check headers", () -> {
            $$("h2.index__title").findBy(text("Новео - это")).shouldBe(visible);
            $$("h2.index__title").findBy(text("Командная работа")).shouldBe(visible);
            $$("h2.index__title").findBy(text("Ценности Новео")).shouldBe(visible);
            $$("h2.index__title").findBy(text("Наша жизнь")).shouldBe(visible);
        });
    }
}
