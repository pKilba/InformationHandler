package service.parser.impl;

import entity.ComponentType;
import entity.TextLeaf;
import controller.impl.TextComposite;
import service.parser.ComponentParser;
import service.parser.ParserForComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser extends ParserForComposite implements ComponentParser {

   private final ComponentType componentType = ComponentType.WORD;

    public WordParser() {
        super(null); //last parser
    }

    @Override
    public TextComposite parse(String text) {
        TextComposite textComposite = new TextComposite(ComponentType.WORD);
        textComposite.setValue(text);
        Pattern pattern = Pattern.compile(componentType.getRegexForSplit());
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {

            text = matcher.group();
        }
        return new TextLeaf(componentType, text);
    }
}
