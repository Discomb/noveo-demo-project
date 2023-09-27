package guru.qa.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Configuration.baseUrl;

public class WebDriverProvider {

    public void getDriver() {

        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

        if (webConfig.isRemoteBrowser()) {

            RemoteConfig remoteConfig = ConfigFactory.create(RemoteConfig.class, System.getProperties());

            String selenoidHome = remoteConfig.getRemoteUrl();
            String selenoidCreds = remoteConfig.getRemoteAuth();
            Configuration.remote = "https://" + selenoidCreds + "@" + selenoidHome + "/wd/hub";
        }

        baseUrl = webConfig.getBaseUrl();
        Configuration.browserSize = webConfig.getBrowserSize();
        Configuration.browser = webConfig.getBrowserName();
        Configuration.browserVersion = webConfig.getBrowserVersion();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }
}
