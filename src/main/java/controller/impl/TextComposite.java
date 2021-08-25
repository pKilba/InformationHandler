package controller.impl;

import entity.ComponentType;

public class TextComposite extends Composite {

    private String value;

    public TextComposite(ComponentType type) {
        super(type);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

