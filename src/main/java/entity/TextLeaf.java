package entity;

import controller.Component;
import controller.impl.TextComposite;

public class TextLeaf extends TextComposite {

    private String value;

    public TextLeaf(ComponentType componentType, String value) {
        super(componentType);
        this.value = value;
    }


    public void addElement(Component part) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void removeElement(Component part) {
        throw new UnsupportedOperationException();

    }

    @Override
    public TextComposite getElement(int index) {
        return this;
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
