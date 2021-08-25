package service.reader.impl;

import service.reader.TextReader;

import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileTextReader implements TextReader {
    @Override
    //know I could work with BufferedReader or just use Java 8,
    //but I want to read all characters at once (i mean \r\n)
    public String read(String filePath) //throws TextReaderException
    {
        filePath = "D://123.txt";
       // LOGGER.info("Reading text from " + filePath + " file...");
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
           // throw new TextReaderException("Something wrong with file text reading.", e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                  //  LOGGER.error(e.getMessage(), e);
                }
            }
        }


        System.out.println(charArray);
        //LOGGER.info("Text has been read!");

        return charArray.toString();
    }
}