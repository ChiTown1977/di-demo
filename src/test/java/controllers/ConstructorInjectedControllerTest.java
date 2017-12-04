package controllers;

import daniel.springframwork.didemo.DiDemoApplication;
import daniel.springframwork.didemo.controllers.ConstructorInjectedController;
import daniel.springframwork.didemo.services.GreetingService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Daniel Tominov on 12/4/2017
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;
    private GreetingService greetingService;

    @Before
    public void setUp() {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class);
        constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        greetingService = (GreetingService) ctx.getBean("constructorGreetingServiceImpl");
    }

    @Test
    public void testGreeting() {
        Assert.assertEquals(constructorInjectedController.sayHello(), greetingService.sayGreeting());
    }
}
