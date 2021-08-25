package service.parser.impl;


import model.ComponentType;
import controller.impl.TextComposite;
import service.parser.ComponentParser;
import service.parser.ParserForComposite;

public class TextParser extends ParserForComposite implements ComponentParser {
    private ComponentType componentType = ComponentType.TEXT;

    public TextParser(ComponentParser nextParser) {
        super(nextParser);
    }

    @Override
    public TextComposite parse(String text) {

        return parseComposite(text, componentType);
    }
}
