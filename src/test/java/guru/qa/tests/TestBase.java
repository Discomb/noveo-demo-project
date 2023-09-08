package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.baseUrl;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        baseUrl = "https://devzion.com";
        Configuration.browserSize = "1920x1080";
    }

}
