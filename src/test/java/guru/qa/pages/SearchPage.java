package guru.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class SearchPage {

    public void checkSearchResult(String query){
        step("Check the search result", () -> {
            switch (query){
                case ("Developer"):
                        $$(".search-page__found h3").findBy(text("Python developer (Django)")).shouldBe(visible);
                        $("a[href='/vacancy/python-developer-django'] .search-page__found-descripton").shouldHave(text("Мы — международная IT-компания НОВЕО"));
                        break;
                default:
                    System.out.println("Not implemented");
        }
        });
    }
}
