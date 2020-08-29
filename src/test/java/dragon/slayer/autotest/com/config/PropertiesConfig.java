package dragon.slayer.autotest.com.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(ignoreInvalidFields = true)
@PropertySource(value = "classpath:properties/application-${spring.profiles.active}.properties", ignoreResourceNotFound = true)
public class PropertiesConfig {

    private Web web;

    @lombok.Data
    public static class Web {
        private String baseurl;
        private Auth user;
    }

    @lombok.Data
    private static class Auth {
        private String username;
        private String password;
    }
}
