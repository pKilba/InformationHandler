package com.epam.hadler.service.reader;

import com.epam.hadler.exceptions.ClosingStreamException;
import com.epam.hadler.exceptions.InputStreamFileException;

public interface TextReader {
    String read(String filePath) throws InputStreamFileException, ClosingStreamException;
}
