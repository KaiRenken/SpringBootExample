package de.neusta.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {

    @GetMapping("/greet/{name}")
    public String greetWithNameInPathVariable(@PathVariable String name) {
        return "Moin, " + name + "!";
    }

    /*
    An diesen Endpunkt kann ein Gruß geschickt werden, indem die Parameter die das Objekt 'GreetingDto' erwartet (also 'name')
    in einen JSON-String verpackt und als Body mitgesendet werden. So ein JSON-String sähe dann so aus:

    {
        "name": "Kai"
    }

     */
    @PostMapping("/greet")
    public String greetWithNameInRequestBody(@RequestBody GreetingDto greetingDto) {
        return "Moin, " + greetingDto.name() + "!";
    }
}
