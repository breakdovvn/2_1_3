package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean
    public Dog dog() {
        return new Dog();
    }
    @Bean
    public Timer timer() {
        return new Timer();
    }
}
