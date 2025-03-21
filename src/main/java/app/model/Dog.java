package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
