package controller.impl;

import controller.Component;
import entity.ComponentType;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<TextComposite> textComponents = new ArrayList<>();
    private ComponentType type;


    public Composite(ComponentType type) {
        this.type = type;
    }

    @Override
    public void addElement(TextComposite part) {
        textComponents.add(part);

    }

    @Override
    public void removeElement(Component part) {
        textComponents.remove(part);
    }

    @Override
    public Component getElement(int index) {
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
