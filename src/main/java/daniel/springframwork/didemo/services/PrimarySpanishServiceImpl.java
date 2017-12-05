package daniel.springframwork.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Daniel Tominov on 12/4/2017
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishServiceImpl implements GreetingService {
   String greeting = "Hola. Este es el saludo PRIMARIO";

    @Override
    public String sayGreeting() {
        return greeting;
    }
}
