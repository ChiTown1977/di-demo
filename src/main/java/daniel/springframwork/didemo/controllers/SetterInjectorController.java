package daniel.springframwork.didemo.controllers;

import daniel.springframwork.didemo.services.GreetingService;
import daniel.springframwork.didemo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectorController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }
}