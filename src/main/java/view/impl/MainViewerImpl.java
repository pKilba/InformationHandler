package view.impl;

import view.MainViewer;

public class MainViewerImpl implements MainViewer {
    @Override
    public String showAboutProgram() {
        return "Выберите действие: \n" +
                "Find the largest number of sentences of text with the same words\n"
                +
                "Display all sentences of a given text in ascending order of the number of words in each of them\n"
                +
                "Type the words of the text alphabetically by first letter. Words starting with a new letter, print from the red line\n"
                +
                "Sort the words of the text in ascending proportion of vowels\n"
                +
                "In some sentence of the text of a word of a given length, replace with the specified substring, the length of which may not coincide with the length of the word \n"
                +
                "Find a word in the first sentence of which none of the other sentences\n"
                +
                "In each sentence of the text, swap the first word with the last without changing the length of the sentence \n"
                ;
    }

}
