package controller;

import controller.impl.TextComposite;
import model.ComponentType;

import java.util.List;

public interface TextComponent {
    ComponentType getType();

    void removeElement(TextComponent part);

    TextComponent getElement(int index);

    void addElement(TextComposite part);

    void addChildren(List<TextComposite> subComponents);

    List<TextComposite> getChildren();
}
