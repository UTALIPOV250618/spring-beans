package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import peaksoft.model.AnimalsCage;
import peaksoft.model.Cat;
import peaksoft.model.Dog;
import peaksoft.model.Timer;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {
    @Bean
    public AnimalsCage animalsCage (){
        return  new AnimalsCage();
    }
    @Bean
    public Cat cat(){
        return new Cat();
    }
    @Bean
    public Dog dog(){
        return new Dog();
    }
    @Bean
    public Timer timer(){
        return new Timer();
    }

}
