package daniel.springframwork.didemo.controllers;

import daniel.springframwork.didemo.services.GreetingService;
import daniel.springframwork.didemo.services.GreetingServiceImpl;

/**
 *
 * @author Daniel Tominov on 12/4/2017
 *
 */
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
