package guru.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage {

    public MainPage openPage(){
        step("Open the main page", () -> {
            open("");
        });
        return this;
    }

    public MainPage checkWelcomeText(){
        step("Check the text", () -> {
        $(".index-poster__info").shouldHave(text("\n" +
                "РАЗРАБАТЫВАЕМ\n" +
                "качественное ПО\n" +
                "и проводим независимое тестирование"));
        });
        return this;
    }

    public MainPage checkMenuHeaders(){
        step("Check menu headers", () -> {
            $(".header__menu a[href='/about']").shouldHave(text("О компании"));
            $(".header__menu a[href='//xn--80aac6chp.xn--b1agwec.xn--p1ai/']").shouldHave(text("Вакансии"));
            $(".header__menu a[href='https://стажировки.новео.рф/']").shouldHave(text("Стажировки"));
            $(".header__menu a[href='/contact']").shouldHave(text("Контакты"));
        });
        return this;
    }

    public void goToCareersPage(){
        step("Click the Careers link", () -> {
            $(".header__menu a[href='//xn--80aac6chp.xn--b1agwec.xn--p1ai/']").click();
        });
    }

    public void goToAboutPage(){
        step("Click the About link", () -> {
            $(".header__menu a[href='/about']").click();
        });
    }

    public void search(String query){
        step("Use the search", () -> {
            $(".js-header-search-btn .icon-svg").click();
            $("#search").setValue(query).submit();
        });
    }
}
