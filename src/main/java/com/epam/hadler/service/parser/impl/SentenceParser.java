package com.epam.hadler.service.parser.impl;

import com.epam.hadler.entity.ComponentType;
import com.epam.hadler.controller.impl.TextComposite;
import com.epam.hadler.service.parser.ComponentParser;
import com.epam.hadler.service.parser.ParserForComposite;

public class SentenceParser extends ParserForComposite implements ComponentParser {
   private final ComponentType componentType = ComponentType.SENTENCE;

    public SentenceParser(ComponentParser nextParser) {
        super(nextParser);
    }

    @Override
    public TextComposite parse(String text) {

        return parseComposite(text, componentType);
    }
}
