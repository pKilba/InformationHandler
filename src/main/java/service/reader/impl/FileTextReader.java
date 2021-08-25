package service.reader.impl;

import exceptions.ClosingStreamException;
import exceptions.InputStreamFileException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.reader.TextReader;

import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileTextReader implements TextReader {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public String read(String filePath) throws InputStreamFileException, ClosingStreamException {
        FileReader fileReader = null;
        CharArrayWriter charArray = new CharArrayWriter();
        try {
            fileReader = new FileReader(filePath);
            char[] charBuffer = new char[1024 * 4]; //reading 8kB in one time
            int currentCharsAmount;
            while (fileReader.ready()) {
                currentCharsAmount = fileReader.read(charBuffer);
                charArray.write(charBuffer, 0, currentCharsAmount);
            }
        } catch (IOException e) {
            logger.error("Непредвиденная ошибка при считки файла");
            throw new InputStreamFileException();

        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    logger.error("Ошибка при закрытии потока");
                    throw new ClosingStreamException();
                }
            }
        }

        return charArray.toString();
    }
}