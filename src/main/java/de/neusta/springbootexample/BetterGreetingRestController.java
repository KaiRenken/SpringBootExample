package de.neusta.springbootexample;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BetterGreetingRestController {

    private GreetingFactory greetingFactory;

    public BetterGreetingRestController(GreetingFactory greetingFactory) {
        this.greetingFactory = greetingFactory;
    }

    @GetMapping("/better/greet/{name}")
    public String Greet(@PathVariable String name) {
        return greetingFactory.buildGreeting(name);
    }
}
