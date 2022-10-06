package de.neusta.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping("/greet")
    public String Greet() {
        return "Moin!";
    }

    @GetMapping("/greet/{name1}/{name2}")
    public String GreetNamePathVariable(@PathVariable String name1, @PathVariable String name2) {
        return "Moin, " + name1 + " und " + name2 + "!";
    }

    @GetMapping("/greeting")
    public String GreetNameQueryParameter(@RequestParam String name1, @RequestParam String name2) {
        return "Moin, " + name1 + " und " + name2 + "!";
    }
}
