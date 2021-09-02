package com.epam.hadler.service.parser;

import com.epam.hadler.controller.impl.TextComposite;

public interface ComponentParser {
    TextComposite parse(String text);
}
