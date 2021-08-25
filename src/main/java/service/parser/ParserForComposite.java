package service.parser;


import model.ComponentType;
import controller.impl.TextComposite;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParserForComposite {
    private final ComponentParser nextParser;


    public ParserForComposite(ComponentParser nextParser) {
        this.nextParser = nextParser;
    }


    public ComponentParser getNextParser() {
        return nextParser;
    }


    public TextComposite parseComposite(String text, ComponentType type) {
        TextComposite textComposite = new TextComposite(type);
        List<TextComposite> subComponents = matchSubComponents(text, type.getRegexForSplit());
        textComposite.addChildren(subComponents);
        textComposite.value = text;
        return textComposite;
    }

    private List<TextComposite> matchSubComponents(String text, String regex) {
        List<TextComposite> subComponents = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            ComponentParser nextParser = getNextParser();
            String matchedData = matcher.group();
            TextComposite textComponent = nextParser.parse(matchedData);
            textComponent.value=matchedData;
            subComponents.add(textComponent);
        }
        return subComponents;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParserForComposite)) {
            return false;
        }

        ParserForComposite that = (ParserForComposite) o;

        return getNextParser() != null ? getNextParser().equals(that.getNextParser()) : that.getNextParser() == null;
    }

    @Override
    public int hashCode() {
        return getNextParser() != null ? getNextParser().hashCode() : 0;
    }


}