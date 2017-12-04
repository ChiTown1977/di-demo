package controllers;

import daniel.springframwork.didemo.DiDemoApplication;
import daniel.springframwork.didemo.controllers.SetterInjectorController;
import daniel.springframwork.didemo.services.GreetingService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Daniel Tominov on 12/4/2017
 */
public class SetterInjectedControllerTest {

    private SetterInjectorController setterInjectorController;
    private GreetingService greetingService;

    @Before
    public void setUp() {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class);
        setterInjectorController = (SetterInjectorController) ctx.getBean("setterInjectorController");
        greetingService = (GreetingService) ctx.getBean("setterGreetingServiceImpl");
    }

    @Test
    public void testGreeting() {
        Assert.assertEquals(setterInjectorController.sayHello(), greetingService.sayGreeting());
    }
}
