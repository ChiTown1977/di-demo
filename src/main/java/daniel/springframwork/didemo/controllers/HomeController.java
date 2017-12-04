package daniel.springframwork.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Daniel Tominov on 11/29/2017 5:25 PM
 **/
@Controller
public class HomeController {
    public String hello() {
        System.out.println("HELLO!!!!!!!!!!!!!");
        return "test";
    }
}
