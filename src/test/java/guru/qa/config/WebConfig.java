package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config.properties"
})
public interface WebConfig extends Config {

    @Key("browser.name")
    String getBrowserName();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("browser.remote")
    Boolean isRemoteBrowser();

    @Key("browser.size")
    String getBrowserSize();

    @Key("browser.baseUrl")
    String getBaseUrl();
}
