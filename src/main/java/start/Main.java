
package start;

import controller.impl.TextComposite;
import org.apache.logging.log4j.LogManager;
import service.parser.impl.ParagraphParser;
import service.parser.impl.SentenceParser;
import service.parser.impl.TextParser;
import service.parser.impl.WordParser;
import service.reader.impl.FileTextReader;
import logic.Calculator;

import java.util.List;

import org.apache.logging.log4j.Logger;

public class Main {


    private static final Logger logger = LogManager.getLogger();


    public static void main(String[] args) throws Exception {

        FileTextReader fileTextReader = new FileTextReader();
        String str = fileTextReader.read("E://123.txt");
        TextParser pr = new TextParser(new ParagraphParser(new SentenceParser(new WordParser())));
        TextComposite textComposite = pr.parse(str);
        System.out.println("");


        System.out.println("");
        Calculator calculator = new Calculator();
        calculator.task1(textComposite);
        calculator.task6(textComposite);

        calculator.task15(textComposite, "last");

        calculator.swapFirstLastWord(textComposite);
        List list = calculator.sortSentencesByWord(textComposite);

        System.out.println("");
    }
}
