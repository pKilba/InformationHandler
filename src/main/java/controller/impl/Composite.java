package controller.impl;

import controller.TextComponent;
import model.ComponentType;

import java.util.ArrayList;
import java.util.List;

public class Composite implements TextComponent {
    public List<TextComposite> textComponents = new ArrayList<>();
    public ComponentType type;


    public Composite(ComponentType type) {
        this.type = type;
    }

    @Override
    public void addElement(TextComposite part) {
        textComponents.add(part);

    }

    @Override
    public void removeElement(TextComponent part) {
        textComponents.remove(part);
    }

    @Override
    public TextComponent getElement(int index) {
        return textComponents.get(index);
    }

    @Override
    public List<TextComposite> getChildren() {
        return textComponents;
    }

    @Override
    public ComponentType getType() {
        return type;
    }

    @Override
    public void addChildren(List<TextComposite> subComponents) {
        this.textComponents.addAll(subComponents);
    }
}
