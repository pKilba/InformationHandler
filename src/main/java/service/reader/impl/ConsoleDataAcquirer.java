package service.reader.impl;

import exceptions.InputDataTypeException;
import exceptions.InputStreamConsoleException;
import exceptions.UnsuitableRangeValueException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.reader.DataAcquirer;
import validator.DataValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {


    private static final Logger logger = LogManager.getLogger();
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private int minNumber;
    private int maxNumber;

    @Override
    public String getFilePath() {
        return "E://123.txt";

    }

    @Override
    public int getNumberForSelectTask() throws UnsuitableRangeValueException, InputStreamConsoleException, InputDataTypeException {
        DataValidator dataValidator = new DataValidator();
        int number = 0;
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            logger.error("Неправильный формат числа");
            throw new InputDataTypeException();
        } catch (IOException e) {
            logger.error("Непредвиденная ошибка");
            throw new InputStreamConsoleException();
        }
        if (dataValidator.checkRange(number, minNumber, maxNumber)) {
            logger.error("Введите число заданного диапозона");
            throw new UnsuitableRangeValueException();
        }
        return number;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }
}
