package daniel.springframwork.didemo.controllers;

import daniel.springframwork.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Daniel Tominov on 12/4/2017
 */
@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    @Autowired //not required but specifies intention of dependency injection
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
