package service.reader;

import exceptions.InputDataTypeException;
import exceptions.InputStreamConsoleException;
import exceptions.UnsuitableRangeValueException;

import java.io.IOException;

public interface DataAcquirer {
 String getFilePath();
 int getNumberForSelectTask() throws IOException, UnsuitableRangeValueException, InputStreamConsoleException, InputDataTypeException;
}
