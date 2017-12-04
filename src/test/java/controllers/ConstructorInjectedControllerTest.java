package controllers;

import daniel.springframwork.didemo.controllers.ConstructorInjectedController;
import daniel.springframwork.didemo.controllers.SetterInjectorController;
import daniel.springframwork.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Daniel Tominov on 12/4/2017
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        Assert.assertEquals(new GreetingServiceImpl().sayGreeting(), constructorInjectedController.sayHello());
    }
}
