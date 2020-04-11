package Parsing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Irina Goncharova
 */
public abstract class Parsable {
    private String value = null;

    public Parsable(String value) {
        this.value = value;
    }

    public List<?> parse (){
        return new ArrayList<>();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
