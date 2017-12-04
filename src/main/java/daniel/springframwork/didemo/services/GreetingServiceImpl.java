package daniel.springframwork.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author Daniel Tominov on 11/29/2017 6:21 PM /
 **/
@Service
public class GreetingServiceImpl implements GreetingService {
    public String hello = "Hello Everyone";

    @Override
    public String sayGreeting() {
        return hello;
    }
}
