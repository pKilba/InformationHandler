package service.parser.impl;

import entity.ComponentType;
import controller.impl.TextComposite;
import service.parser.ComponentParser;
import service.parser.ParserForComposite;

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
