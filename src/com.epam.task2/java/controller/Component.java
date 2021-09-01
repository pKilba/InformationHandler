package controller;

import controller.impl.TextComposite;
import entity.ComponentType;

import java.util.List;

public interface Component {
    ComponentType getType();

    void removeElement(Component part);

    Component getElement(int index);

    void addElement(TextComposite part);

    void addChildren(List<TextComposite> subComponents);

    List<TextComposite> getChildren();
}
