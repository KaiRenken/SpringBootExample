package de.neusta.springbootexample;

public class GreetingDto {

    private final String name;

    public GreetingDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
