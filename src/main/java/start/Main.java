
package start;

import controller.impl.TextComposite;
import exceptions.InCorrectTypeCompositeException;
import org.apache.logging.log4j.LogManager;
import service.parser.impl.ParagraphParser;
import service.parser.impl.SentenceParser;
import service.parser.impl.TextParser;
import service.parser.impl.WordParser;
import service.reader.impl.ConsoleDataAcquirer;
import service.reader.impl.FileTextReader;
import logic.Calculator;

import java.util.List;
import java.util.Set;

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
