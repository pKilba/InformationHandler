package service.parser.impl;

import model.ComponentType;
import model.TextLeaf;
import controller.impl.TextComposite;
import service.parser.ComponentParser;
import service.parser.ParserForComposite;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser extends ParserForComposite implements ComponentParser {

    public WordParser() {
        super(null); //last parser
    }

    @Override
    public TextComposite parse(String text) {
        TextComposite textComposite = new TextComposite(ComponentType.WORD);
        textComposite.value = text;
        List<TextComposite> subComponents = new ArrayList<>();


        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {

            System.out.println(matcher.group());
        }
        return new TextLeaf(ComponentType.WORD, text);
    }
}
