package raiven.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "HelloWorld - Setter";
    }
}