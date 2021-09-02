package com.epam.hadler.service.reader;

import com.epam.hadler.exceptions.InputStreamConsoleException;

public interface DataAcquirer {
    String getFilePath() throws InputStreamConsoleException;


}
