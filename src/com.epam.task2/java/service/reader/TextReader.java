package service.reader;

import exceptions.ClosingStreamException;
import exceptions.InputStreamFileException;

public interface TextReader {
    String read(String filePath) throws InputStreamFileException, ClosingStreamException;
}
