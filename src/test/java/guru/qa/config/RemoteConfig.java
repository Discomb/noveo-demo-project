package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config.properties"
})
public interface RemoteConfig extends Config {

    @Key("remote.url")
    String getRemoteUrl();

    @Key("remote.auth")
    String getRemoteAuth();

}
