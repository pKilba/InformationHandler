package logic;

import controller.impl.TextComposite;

import java.util.Comparator;

class WordsCountComparator implements Comparator<TextComposite> {
    @Override
    
    public int compare(TextComposite o1, TextComposite o2) {
        int countSentencesFirstParagraph = o1.getChildren().size();
        int countSentencesSecondParagraph = o2.getChildren().size();
        return Integer.compare(countSentencesFirstParagraph,countSentencesSecondParagraph);
    }
}
