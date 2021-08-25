package service.reader.impl;

import exceptions.InputStreamConsoleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.reader.DataAcquirer;
import view.DataAcquirerViewer;
import view.impl.DataAcquirerViewerImpl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {


    private static final Logger logger = LogManager.getLogger();
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private DataAcquirerViewer dataAcquirerViewer = new DataAcquirerViewerImpl();

    @Override
    public String getFilePath() throws InputStreamConsoleException {
        String filePath;
        dataAcquirerViewer.printInputFilePath();
        try {
            filePath = bufferedReader.readLine();
        } catch (IOException e) {
            logger.error("Непредвиденная ошибка");
            throw new InputStreamConsoleException();
        }
        return filePath;

    }

}
