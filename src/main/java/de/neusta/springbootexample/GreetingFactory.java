package de.neusta.springbootexample;

import org.springframework.stereotype.Component;

@Component
public class GreetingFactory {

    public String buildGreeting(String name) {
        return "Moin, " + name + "!";
    }
}
