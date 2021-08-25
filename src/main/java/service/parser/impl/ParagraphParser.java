package service.parser.impl;


import model.ComponentType;
import controller.impl.TextComposite;
import service.parser.ComponentParser;
import service.parser.ParserForComposite;


public class ParagraphParser extends ParserForComposite implements ComponentParser {
    private ComponentType componentType = ComponentType.PARAGRAPH;

    public ParagraphParser(ComponentParser nextParser) {
        super(nextParser);
    }

    @Override
    public TextComposite parse(String data) {
        return parseComposite(data, componentType);

    }


}




