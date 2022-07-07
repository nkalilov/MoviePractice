package peaksoft;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Director {
    private String name;
    private String lastName;

    public Director(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name  + lastName;
    }
}
