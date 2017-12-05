package daniel.springframwork.didemo.controllers;

import daniel.springframwork.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Daniel Tominov on 11/29/2017 5:25 PM
 **/
@Controller
public class HomeController {
    private GreetingService greetingService;

    public HomeController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println(greetingService.sayGreeting());
        return greetingService.sayGreeting();
    }
}
