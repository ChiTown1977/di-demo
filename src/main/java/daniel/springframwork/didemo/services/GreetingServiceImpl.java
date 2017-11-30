package daniel.springframwork.didemo.services;

/**
 * @author Daniel Tominov on 11/29/2017 6:21 PM /
 **/
public class GreetingServiceImpl implements GreetingService {
    public String hello = "Hello Everyone";

    @Override
    public String sayGreeting() {
        return hello;
    }
}
