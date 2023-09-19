package guru.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class SearchPage {

    public void checkSearchResult(String query){
        step("Check the search result", () -> {
            switch (query){
                case ("Developer"):
                        $(".search-page__found-title").shouldHave(text("Python developer (Django)"));
                        $(".search-page__found-descripton").shouldHave(text("Мы — международная IT-компания НОВЕО"));
                        break;
                default:
                    System.out.println("Not implemented");
        }
        });
    }
}
