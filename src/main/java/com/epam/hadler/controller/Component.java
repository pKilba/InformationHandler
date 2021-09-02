package com.epam.hadler.controller;

import com.epam.hadler.controller.impl.TextComposite;
import com.epam.hadler.entity.ComponentType;

import java.util.List;

public interface Component {
    ComponentType getType();

    void removeElement(Component part);

    Component getElement(int index);

    void addElement(TextComposite part);

    void addChildren(List<TextComposite> subComponents);

    List<TextComposite> getChildren();
}
