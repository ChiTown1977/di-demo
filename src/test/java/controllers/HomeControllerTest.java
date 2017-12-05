package controllers;

import daniel.springframwork.didemo.DiDemoApplication;
import daniel.springframwork.didemo.controllers.HomeController;
import daniel.springframwork.didemo.services.GreetingService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Daniel Tominov on 12/4/2017
 */
public class HomeControllerTest {

    private HomeController controller;
    private GreetingService greetingService;

    @Before
    public void setUp() {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class);
        controller = (HomeController) ctx.getBean("homeController");
        greetingService = (GreetingService) ctx.getBean("primaryServiceImpl");
    }

    @Test
    public void testGreeting() {
        //Tests the greeting service in home controller to ensure it is using the PRIMARY service
        Assert.assertEquals(controller.hello(), greetingService.sayGreeting());
    }
}