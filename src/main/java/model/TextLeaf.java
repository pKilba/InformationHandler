package model;

import controller.TextComponent;
import controller.impl.TextComposite;

public class TextLeaf extends TextComposite {

    String str;

    public TextLeaf(ComponentType componentType, String str) {
        super(componentType);
        this.str = str;
    }


    public void addElement(TextComponent part) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void removeElement(TextComponent part) {
        throw new UnsupportedOperationException();

    }

    @Override
    public TextComposite getElement(int index) {
        return this;
    }




    @Override
    public String toString() {
        return str;
    }

}
