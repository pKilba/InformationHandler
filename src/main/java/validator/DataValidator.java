package validator;

public class DataValidator {

    public boolean checkRange(int number, int minNumber, int maxNumber) {
        return minNumber <= number && maxNumber >= number;
    }

}
