package Learning.TravelPlanner.Config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Learning.TravelPlanner.Entity.User;

@Configuration
public class AppConfig {

    @Bean
    public User createUser(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(1998, Calendar.AUGUST, 5);
        return new User("John", "Doe", "johndoe@gmail.com", "Password", Calendar.getInstance().getTime());
    }

    // How spring boot find these beans
    // 1. Using @ComponentScan annotation, it will scan the specified package and sub-package for class annotated with
    //    @Component and @Service etc.
    // for e.g. @ComponentScan(basepackages = 'Learning.TravelPlanner')
    // Two types of bean
    // 1. Singleton:- Beans created at the start of application
    // 2. Lazy:- Beans created at the required time. @Lazy annotation required for lazy initialization.

    // Life cycle of a bean
    // 1. Application start
    // 2. IOC container Started:- Scan for the beans
    // 3. Constructor bean:- construction of bean
    // 4. Inject dependency into constructed bean:- Injecting dependency into bean
    // 5. @Postconstruct:- If any task to perform after bean construction we can perform over there
    // 6. Use the bean
    // 7. @Predestroy:- Before destroying the bean.
    // 8. Bean Destroyed
}

