package controllers;

import daniel.springframwork.didemo.controllers.SetterInjectorController;
import daniel.springframwork.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Daniel Tominov on 12/4/2017
 */
public class SetterInjectedControllerTest {

    private SetterInjectorController setterInjectorController;

    @Before
    public void setUp(){
        this.setterInjectorController = new SetterInjectorController();
        this.setterInjectorController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        Assert.assertEquals(new GreetingServiceImpl().sayGreeting(), setterInjectorController.sayHello());
    }
}
