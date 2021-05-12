package raiven.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "HelloWorld - Constructor";
    }
}
