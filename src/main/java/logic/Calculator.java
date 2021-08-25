package logic;

import model.ComponentType;
import controller.impl.TextComposite;


import java.util.*;

public class Calculator {


    //2
    public List sortSentencesByWord(TextComposite textComposite) throws Exception {
        if (textComposite.type != ComponentType.TEXT) {
            throw new Exception();
        }
        List list = new ArrayList();
        for (TextComposite paragraph : textComposite.getChildren()) {
            for (TextComposite sentences : paragraph.getChildren()) {
                list.add(sentences);
            }
        }
        list.sort(new WordsCountComparator());
        System.out.println("");
        System.out.println("");
        return list;
    }


    //task6

    public void task6(TextComposite textComposite) {
        Map<Character, Integer> map = new HashMap<>();
        List list = new ArrayList();
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (TextComposite word : sentence.getChildren()) {
                    if (!(map.containsKey(word.value.charAt(0)))) {
                        list.add("\n");
                    }
                    list.add(word);
                    map.put(word.value.charAt(0), 0);
                }
            }
        }
        System.out.println(list);


    }

    //task7
    public void task7(TextComposite textComposite) {
        List list = new ArrayList();
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (TextComposite word : sentence.getChildren()) {
                    list.add(word.value);
                }
            }
        }
        list.sort(new Vowels1CountComparator());
        System.out.println("");

    }

    //task1
    public void task1(TextComposite textComposite) {
        Set set = new HashSet();
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (int i = 0; i < sentence.getChildren().size(); i++) {
                    for (int y = i + 1; y < sentence.getChildren().size(); y++) {
                        System.out.println(sentence.getChildren().get(i));
                        System.out.println(sentence.getChildren().get(y));
                        if (sentence.getChildren().get(i).value.equals(sentence.getChildren().get(y).value)) {
                            set.add(sentence);
                        }
                    }

                }
            }
        }

    }


    //task12 можно будет переделать если я слова разделю на симвоыл




    //task15 НЕ РАБОАТЕТ ПОТОМУ ЧТО В ЭРРЕЙ ЛИСТЕ СЛОВ НЕТУ БУКВ НАДО ИСПРАВИТЬ
    public void task15(TextComposite textComposite,String firstOrLastLetter){
        int index = 0 ;
        for (TextComposite paragraphs: textComposite.getChildren()){
            for (TextComposite sentences: paragraphs.getChildren()){
                for (TextComposite word: sentences.getChildren()){
                    if (firstOrLastLetter.equals("last")){
                        index=word.value.length()-1;
                    }
                    int finalIndex = index;

                    word.getChildren().removeIf(s->s.equals(word.getChildren().get(finalIndex)));
                //    word.getChildren().add(finalIndex,new TextComposite(ComponentType.WORD));
                }
            }
        }

    }


    //task16
    public void task16(TextComposite sentence, String str, int lengthWord) {
        for (TextComposite word : sentence.getChildren()) {
            if (word.getChildren().size() == lengthWord) {
                word.value = str;
            }
        }
    }


    //task9
    public void task9(TextComposite textComposite, Character character) {
        Map map = new HashMap();
        int count = 0;
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (TextComposite word : sentence.getChildren()) {


                }
            }
        }
    }

    //task10


    //task3
    public Map<String, Integer> getFirstSentence(TextComposite textComposite) {
        Map<String, Integer> map = new HashMap<>();
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (TextComposite word : sentence.getChildren()) {

                    map.put(word.value, 0);
                }
                return map;
            }
        }
        return map;
    }

    public void task3(TextComposite textComposite) {
        Map<String, Integer> map = getFirstSentence(textComposite);
        for (TextComposite paragraphs : textComposite.getChildren()) {
            for (TextComposite sentence : paragraphs.getChildren()) {
                for (TextComposite word : sentence.getChildren()) {
                    if (map.containsKey(word.value)) {
                        map.put(word.value, (map.get(word.value) + 1));
                    }
                }

            }

        }

        System.out.println("чел ты ");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 0) {
                System.out.println(e.getKey());
            }
        }

        System.out.println("");


    }

    //5
    public void swapFirstLastWord(TextComposite textComposite) throws Exception {
        if (textComposite.type != ComponentType.TEXT) {
            throw new Exception();
        }
        for (TextComposite paragraph : textComposite.getChildren()) {
            for (TextComposite sentences : paragraph.getChildren()) {
                int index = (sentences.getChildren().size()) - 1;
                TextComposite lastWord = sentences.getChildren().get(index);
                TextComposite tempWordPosition = (sentences.getChildren()).get(0);
                sentences.getChildren().set(0, lastWord);
                sentences.getChildren().set(index, tempWordPosition);
                System.out.println("");
                System.out.println("");

            }

        }

    }


}
