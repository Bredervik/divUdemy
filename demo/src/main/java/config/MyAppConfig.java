package config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "myConfig")
public class MyAppConfig {

    private String appName;
    private String appDescription;
    private String adminFirstName;
    private String adminLastName;
    private String adminMail;
}
