package com.epam.hadler.service.parser.impl;


import com.epam.hadler.service.parser.ComponentParser;
import com.epam.hadler.entity.ComponentType;
import com.epam.hadler.controller.impl.TextComposite;
import com.epam.hadler.service.parser.ParserForComposite;


public class ParagraphParser extends ParserForComposite implements ComponentParser {
    private final ComponentType componentType = ComponentType.PARAGRAPH;

    public ParagraphParser(ComponentParser nextParser) {
        super(nextParser);
    }

    @Override
    public TextComposite parse(String data) {
        return parseComposite(data, componentType);

    }


}




