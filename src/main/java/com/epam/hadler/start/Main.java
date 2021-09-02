package com.epam.hadler.start;

import com.epam.hadler.controller.impl.TextComposite;
import com.epam.hadler.exceptions.InCorrectTypeCompositeException;
import com.epam.hadler.logic.Calculator;
import org.apache.logging.log4j.LogManager;
import com.epam.hadler.service.parser.impl.ParagraphParser;
import com.epam.hadler.service.parser.impl.SentenceParser;
import com.epam.hadler.service.parser.impl.TextParser;
import com.epam.hadler.service.parser.impl.WordParser;
import com.epam.hadler.service.reader.impl.ConsoleDataAcquirer;
import com.epam.hadler.service.reader.impl.FileTextReader;

import org.apache.logging.log4j.Logger;

public class Main {


    private static final Logger logger = LogManager.getLogger();


    public static void main(String[] args) throws InCorrectTypeCompositeException, Exception {

        FileTextReader fileTextReader = new FileTextReader();
        String str = fileTextReader.read(new ConsoleDataAcquirer().getFilePath());
        TextParser pr = new TextParser(new ParagraphParser(new SentenceParser(new WordParser())));
        TextComposite textComposite = pr.parse(str);

        Calculator calculator = new Calculator();


    }
}
//test