package daniel.springframwork.didemo.controllers;

import daniel.springframwork.didemo.services.GreetingService;
import daniel.springframwork.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Daniel Tominov on 12/4/2017
 */
public class ConstructorInjectedController {
    private GreetingService greetingService;

    @Autowired //not required but specifies intention of dependency injection
    public ConstructorInjectedController(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
