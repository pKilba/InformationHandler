package com.epam.hadler.validator;

import com.epam.hadler.controller.impl.TextComposite;
import com.epam.hadler.entity.ComponentType;
import com.epam.hadler.exceptions.InCorrectTypeCompositeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValidatorByCompositeType {

    Logger logger = LogManager.getLogger();

    public ValidatorByCompositeType() {
    }

    public void isCorrectSentenceType(TextComposite textComposite) throws InCorrectTypeCompositeException {
        if (textComposite.getType() != ComponentType.SENTENCE) {
            logger.error("Вы передали не предложение");
            throw new InCorrectTypeCompositeException();
        }
    }

    public void isCorrectTextType(TextComposite textComposite) throws InCorrectTypeCompositeException {
        if (textComposite.getType() != ComponentType.TEXT) {
            logger.error("Вы передали не текст");
            throw new InCorrectTypeCompositeException();
        }
    }


}
