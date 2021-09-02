package com.epam.hadler.logic;

import com.epam.hadler.controller.impl.TextComposite;
import com.epam.hadler.exceptions.InCorrectTypeCompositeException;
import com.epam.hadler.validator.ValidatorByCompositeType;



import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Calculator {

    private final ValidatorByCompositeType validator = new ValidatorByCompositeType();


    //task2
    public List<TextComposite> sortSentencesByWord(TextComposite textComposite) throws InCorrectTypeCompositeException {

        validator.isCorrectTextType(textComposite);
        List<TextComposite> list = new ArrayList<TextComposite>();
        for (TextComposite paragraph : textComposite.getChildren()) {
            list.addAll(paragraph.getChildren());
        }
        list.sort(new Comparator<TextComposite>() {
            @Override
            public int compare(TextComposite o1, TextComposite o2) {
                int countSentencesFirstParagraph = o1.getChildren().size();
                int countSentencesSecondParagraph = o2.getChildren().size();
                return Integer.compare(countSentencesFirstParagraph, countSentencesSecondParagraph);
            }
        });
        return list;
    }


    //task6

    public List sortByFirstLetter(TextComposite textComposite) throws InCorrectTypeCompositeException {
        validator.isCorrectTextType(textComposite);
        Map<Character, Integer> map = new HashMap<>();
        List list = new ArrayList<>();
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (TextComposite word : sentence.getChildren()) {
                    if (!(map.containsKey(word.getValue().charAt(0)))) {
                        list.add("\n");
                    }
                    list.add(word);
                    map.put(word.getValue().charAt(0), 0);
                }
            }
        }

        return list;
    }

    //task7
    public void sortWordsOfTextAscendingProportionOfVowels(TextComposite textComposite) throws InCorrectTypeCompositeException {
        validator.isCorrectTextType(textComposite);
        List<String> list = new ArrayList<>();
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (TextComposite word : sentence.getChildren()) {
                    list.add(word.getValue());
                }
            }
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                double firstNumber = (double) getCount.apply(o1) / o1.length();
                double secondNumber = (double) getCount.apply(o2) / o2.length();
                return Double.compare(firstNumber, secondNumber);
            }

            Function<String, Integer> getCount = new Function<String, Integer>() {
                private Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'u', 'i', 'o', 'y'));

                @Override
                public Integer apply(String s) {
                    int count = 0;
                    for (int i = 0; i < s.length(); i++) {
                        count += set.contains(s.charAt(i)) ? 1 : 0;
                    }
                    return count;
                }
            };


        });

    }

    //task1
    public Set<TextComposite> FindLargestNumberOfSentencesEqualsWords(TextComposite textComposite) throws InCorrectTypeCompositeException {
        validator.isCorrectTextType(textComposite);
        Set<TextComposite> set = new HashSet<>();
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (int i = 0; i < sentence.getChildren().size(); i++) {
                    for (int y = i + 1; y < sentence.getChildren().size(); y++) {
                        if (sentence.getChildren().get(i).getValue().equals(sentence.getChildren().get(y).getValue())) {
                            set.add(sentence);
                        }
                    }

                }
            }
        }
        return set;

    }


    //task16
    public void replaceWordsWithSubstring(TextComposite sentence, String str, int lengthWord) throws InCorrectTypeCompositeException {
        validator.isCorrectSentenceType(sentence);
        for (TextComposite word : sentence.getChildren()) {
            if (word.getChildren().size() == lengthWord) {
                word.setValue(str);
            }
        }
    }


    //task3
    public Map<String, Integer> getFirstSentence(TextComposite textComposite) {
        Map<String, Integer> map = new HashMap<>();
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (TextComposite word : sentence.getChildren()) {
                    map.put(word.getValue(), 0);
                }
                return map;
            }
        }
        return map;
    }

    public void FindWordInSentenceOfWhichNoneOtherSentences(TextComposite textComposite) throws InCorrectTypeCompositeException {
        validator.isCorrectTextType(textComposite);
        Map<String, Integer> map = getFirstSentence(textComposite);
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (TextComposite word : sentence.getChildren()) {
                    if (map.containsKey(word.getValue())) {
                        map.put(word.getValue(), (map.get(word.getValue()) + 1));
                    }
                }

            }

        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 0) {
                System.out.println(e.getKey());
            }
        }
    }

    //5
    public void swapFirstLastWord(TextComposite textComposite) throws InCorrectTypeCompositeException {
        validator.isCorrectTextType(textComposite);
        for (TextComposite paragraph : textComposite.getChildren()) {
            for (TextComposite sentences : paragraph.getChildren()) {
                int index = (sentences.getChildren().size()) - 1;
                TextComposite lastWord = sentences.getChildren().get(index);
                TextComposite tempWordPosition = (sentences.getChildren()).get(0);
                sentences.getChildren().set(0, lastWord);
                sentences.getChildren().set(index, tempWordPosition);
            }

        }

    }
}
